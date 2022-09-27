package com.debuggeando_ideas.collectors;

import util.Console;
import util.Database;
import util.Review;
import util.Videogame;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class CollectorsExercises {

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();

        getConsolesPricesAvg(videogames).forEach((k, v) -> System.out.println(k + " - " + v));
    }

    /*
     *Regresar una lista inmutable con todos los reviews del stream.
     */
    static List<Review> getReviews(Stream<Videogame> stream) {
        return null;
    }

    /*
     * Regresar un mapa true con todos los videojuegos que tengan una url(website) con una longitud menor a 15
     *  de lo contrario regresar false con una lista de los videojuegos que no cumplan la condition.
     */
    static Map<Boolean, List<Videogame>> getWebSites(Stream<Videogame> stream) {
        return null;
    }

    /*
     *  Regresar en un mapa el promedio de ventas todas las consolas
     *  la clave del mapa será la consola y el valor el promedio de ventas.
     */
    static Map<Console, Double> getConsolesPricesAvg(Stream<Videogame> stream) {
        return null;
    }
}
