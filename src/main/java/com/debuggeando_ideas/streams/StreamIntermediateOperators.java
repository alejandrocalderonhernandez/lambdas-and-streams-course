package com.debuggeando_ideas.streams;

import util.BasicVideogame;
import util.Database;
import util.Review;
import util.Videogame;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntermediateOperators {

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();

        mapVSFlatMapOperator(videogames);
    }

    static void distinctOperator(Stream<Videogame> stream) {
        System.out.println(stream.distinct().count());
    }

    static void limitOperator(Stream<Videogame> stream) {
        List<Videogame> r = stream.limit(5).collect(Collectors.toList());
        r.forEach(System.out::println);
    }

    static void skipOperator(Stream<Videogame> stream) {
        List<Videogame> r = stream.skip(15).collect(Collectors.toList());
        r.forEach(System.out::println);
    }

    static void filterOperator(Stream<Videogame> stream) {
        List<Videogame> r = stream
                .filter(v -> v.getPrice() > 12.0)
                .filter(v -> !v.getIsDiscount())
                .filter(v -> v.getOfficialWebsite().contains("forza"))
                .collect(Collectors.toList());

        r.forEach(System.out::println);
    }

    static void mapOperator(Stream<Videogame> stream) {
        List<BasicVideogame> basicVideogames = stream
                .map(v -> {
                    return BasicVideogame.builder()
                            .name(v.getName())
                            .price(v.getPrice())
                            .console(v.getConsole())
                            .build();
                }).collect(Collectors.toList());

        List<String> titles =  basicVideogames.stream()
                .map(BasicVideogame::getName)
                .collect(Collectors.toList());

        basicVideogames.forEach(System.out::println);
        System.out.println("-----");
        titles.forEach(System.out::println);
    }

    static void flatMapOperator(Stream<Videogame> stream) {
        List<Review> r = stream.flatMap(v -> v.getReviews().stream()).collect(Collectors.toList());
        System.out.println(r);
    }

    static void mapVSFlatMapOperator(Stream<Videogame> stream) {
        //var totalReviews = stream.map(v -> v.getReviews().size()).collect(Collectors.toList());
        Long totalReviews = stream.flatMap(v -> v.getReviews().stream()).count();
        System.out.println(totalReviews);
    }

    //peek
}
