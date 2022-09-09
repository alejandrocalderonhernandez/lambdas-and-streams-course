package com.debuggeando_ideas.temp;

import util.Database;
import util.Videogame;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntermediateOperatorsT {

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();

        filterOperator(videogames);
    }

    static void distinctOperator(Stream<Videogame> stream) {
        System.out.println(stream.distinct().count());
    }

    static void limitOperator(Stream<Videogame> stream) {
         stream.limit(2).collect(Collectors.toList()).forEach(System.out::println);
    }

    static void skipOperator(Stream<Videogame> stream) {
       stream.skip(15).collect(Collectors.toList()).forEach(System.out::println);
    }

    static void filterOperator(Stream<Videogame> stream) {
        stream.filter(Videogame::getIsDiscount).collect(Collectors.toList()).forEach(System.out::println);
    }
}
