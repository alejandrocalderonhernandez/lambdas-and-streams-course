package com.debuggeando_ideas.collectors;

import util.Database;
import util.Review;
import util.Videogame;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectorsReduceFunctions {

    public static void main(String[] args) {
        Optional<Videogame> gtaOpt = Optional.of(Database.videogames.get(5));

        String webSites = gtaOpt.map(Videogame::getOfficialWebsite).get();
        List<Review> revies =  gtaOpt.flatMap(videogame -> Optional.of(List.of(videogame.getReviews().get(0)))).get();

        System.out.println(revies);

        System.out.println(webSites);
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
