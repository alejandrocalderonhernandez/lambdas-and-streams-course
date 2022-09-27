package com.debuggeando_ideas.collectors;

import util.Database;
import util.Videogame;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsReduceFunctions {

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();
        join(videogames);
    }

    static void avg(Stream<Videogame> stream) {
        Double avg = stream.collect(Collectors.averagingDouble(Videogame::getPrice));
        System.out.println(avg);
    }

    static void sum(Stream<Videogame> stream) {
        IntSummaryStatistics summaryStatistics =
                stream.collect(Collectors.summarizingInt(v -> v.getReviews().size()));
        System.out.println(summaryStatistics.getSum());
        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getMin());
        System.out.println(summaryStatistics.getAverage());
    }

    static void join(Stream<Videogame> stream) {
        String string = stream
                .map(Videogame::toString)
                .collect(Collectors.joining("\n"));

        System.out.println(string);
    }
}
