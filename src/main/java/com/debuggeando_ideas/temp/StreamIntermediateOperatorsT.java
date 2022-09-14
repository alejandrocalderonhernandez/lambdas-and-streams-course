package com.debuggeando_ideas.temp;

import util.BasicVideogame;
import util.Database;
import util.Review;
import util.Videogame;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntermediateOperatorsT {

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();

        flatMapVSMapOperator(videogames);
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

    static void mapOperator(Stream<Videogame> stream) {
        stream.map( v -> {
            return BasicVideogame.builder()
                    .name(v.getName())
                    .price(v.getPrice())
                    .console(v.getConsole())
                    .build();
        }).forEach(System.out::println);
    }

    static void flatMapOperator(Stream<Videogame> stream) {
        List<Review> reviews = stream.flatMap(v -> v.getReviews().stream()).collect(Collectors.toList());

        reviews.forEach(System.out::println);
    }

    static void flatMapVSMapOperator(Stream<Videogame> stream) {
        //Long totalFlatMap = stream.flatMap(v -> v.getReviews().stream()).count();
        Long totalMap = stream.map(v -> v.getTotalSold()).count();
        //
        // System.out.println(totalFlatMap);
        System.out.println(totalMap);

    }
}
