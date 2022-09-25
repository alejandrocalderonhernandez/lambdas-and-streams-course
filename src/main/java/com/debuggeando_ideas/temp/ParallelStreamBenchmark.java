package com.debuggeando_ideas.temp;

import java.util.stream.IntStream;

public class ParallelStreamBenchmark {

    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();
        IntStream.rangeClosed(1, 2000000000).parallel().reduce(0, Integer::sum);
        long endTime = System.currentTimeMillis();
        System.out.println("Total time: " + (endTime - startTime));
    }

}
