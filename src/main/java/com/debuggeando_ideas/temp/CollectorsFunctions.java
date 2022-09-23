package com.debuggeando_ideas.temp;

import util.Database;
import util.Videogame;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsFunctions {

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();
        join(videogames);
    }

    static void avg(Stream<Videogame> stream) {
        Double r = stream.collect(Collectors.averagingDouble(Videogame::getPrice));
        System.out.println(r);
    }

    static void sum(Stream<Videogame> stream) {
        IntSummaryStatistics r = stream.collect(Collectors.summarizingInt(v -> v.getReviews().size()));
        System.out.println(r);
    }

    static void join(Stream<Videogame> stream) {
        String r = stream
                .map(Videogame::toString)
                .collect(Collectors.joining("\n"));
        System.out.println(r);
    }
}
