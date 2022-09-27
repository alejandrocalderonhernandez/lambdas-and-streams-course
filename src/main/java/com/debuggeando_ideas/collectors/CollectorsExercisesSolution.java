package com.debuggeando_ideas.collectors;

import util.Console;
import util.Database;
import util.Review;
import util.Videogame;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExercisesSolution {

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();
        getConsolesPricesAvg(videogames).forEach((k, v) -> System.out.println(k + " - " + v));
    }

    /*
     *Regresar una lista inmutable con todos los reviews del stream.
     */
    static List<Review> getReviews(Stream<Videogame> stream) {
        return stream
                .flatMap(v -> v.getReviews().stream())
                .collect(Collectors.toUnmodifiableList());
    }

    /*
     * Regresar un mapa true con todos los videojuegos que tengan una url(website) con una longitud menor a 15
     *  de lo contrario regresar false con una lista de los videojuegos que no cumplan la condition.
     */
    static Map<Boolean, List<Videogame>> getWebSites(Stream<Videogame> stream) {
        return stream
                .collect(Collectors.partitioningBy(v -> v.getOfficialWebsite().length() < 15));
    }

    /*
     *  Regresar en un mapa el promedio de ventas todas las consolas
     *  la clave del mapa será la consola y el valor el promedio de ventas.
     */
    static Map<Console, Double> getConsolesPricesAvg(Stream<Videogame> stream) {
        return stream
                .collect(Collectors.groupingBy(
                        Videogame::getConsole,
                        Collectors.averagingDouble(Videogame::getTotalSold)
                ));
    }
}
