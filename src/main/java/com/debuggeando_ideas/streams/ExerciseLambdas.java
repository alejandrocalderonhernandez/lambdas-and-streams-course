package com.debuggeando_ideas.streams;

import util.Console;
import util.Database;
import util.Review;
import util.Videogame;

import java.util.stream.Stream;

public class ExerciseLambdas {

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();
    }

    /*
    *Regresar true si el stream contiene almenos un videojuego con numero de ventas mayor a 10
    * y no este en descuento o su precio sea mayor a 9.99 de lo contrario regresar false.
     */
    static Boolean exercise1(Stream<Videogame> stream) {
        return null;
    }

    /*
     *Regresar un Stream medicament con los titulos de todas las consolas que sen de XBOX
     * durante el proceso imprimir los resultados ignorando los repetidos.
     */
    static Stream<String> exercise2(Stream<Videogame> stream) {
       return null;

    }

    /*
     *Regresar un el videojuego con el mayor numero de ventas
     * unicamente contemplando los primers 10 elementos del stream.
     */
    static Videogame exercise3(Stream<Videogame> stream) {
        return null;
    }

    /*
     *Regresar un stream con todos los comentarios del cada review de todos los videojuegos
     */
    static Stream<String> exercise4(Stream<Videogame> stream) {
        return null;

    }

    /*
     *Regresar un stream con los todos los precios menores a 20.0
     * sin utilizar el operador filter().
     */
    static Stream<Double> exercise5(Stream<Videogame> stream) {
        return null;
    }

}
