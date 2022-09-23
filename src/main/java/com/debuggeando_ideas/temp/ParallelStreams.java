package com.debuggeando_ideas.temp;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreams {

    //-D java.util.concurrent.ForkJoinPool.common.parallelism=4
    public static void main(String[] args) {
        List<Integer> listOfNumbers = List.of(1, 2, 3, 4);
        listOfNumbers.parallelStream().forEach(number ->
                System.out.println(number + " " + Thread.currentThread().getName())
        );

        IntStream.rangeClosed(1, 100).reduce(0, Integer::sum);
        IntStream.rangeClosed(1, 100).parallel().reduce(0, Integer::sum);
    }


}
