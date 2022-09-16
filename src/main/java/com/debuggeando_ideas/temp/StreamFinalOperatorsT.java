package com.debuggeando_ideas.temp;

import util.Database;
import util.Videogame;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamFinalOperatorsT {

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();

    }

    static void countOperator(Stream<Videogame> stream) {
        System.out.println(stream.count());
    }

    static void forEachOperator(Stream<Videogame> stream) {
        stream.forEach(System.out::println);
    }

    static void anyMatchOperator(Stream<Videogame> stream) {
        boolean r = stream.anyMatch(videogame -> videogame.getTotalSold() > 1000000);
        System.out.println(r);
    }

    static void allMatchOperator(Stream<Videogame> stream) {
        boolean r = stream.allMatch(videogame -> videogame.getName().equals("Need for speed"));
        System.out.println(r);
    }

    static void noneMatchOperator(Stream<Videogame> stream) {
        boolean r = stream.noneMatch(videogame -> videogame.getName().equals("Need for speed"));
        System.out.println(r);
    }

    static void findFirstOperator(Stream<Videogame> stream) {
        Optional<Videogame> r = stream.findFirst();
        System.out.println(r);
    }

    static void findAnyOperator(Stream<Videogame> stream) {
        Optional<Videogame> r = stream.findAny();
        System.out.println(r);
    }

    static void maxOperator(Stream<Videogame> stream) {
        Optional<Videogame> r = stream.max(Comparator.comparingInt(Videogame::getTotalSold));
        System.out.println(r);
    }

    static void minOperator(Stream<Videogame> stream) {
        Optional<Videogame> r = stream.min(Comparator.comparingInt(Videogame::getTotalSold));
        System.out.println(r);
    }

    static void reduceOperator(Stream<Videogame> stream) {
        Optional<Integer> r = stream
                .map(Videogame::getTotalSold)
                .reduce(Integer::sum);

        System.out.println(r.orElse(0));

    }

}
