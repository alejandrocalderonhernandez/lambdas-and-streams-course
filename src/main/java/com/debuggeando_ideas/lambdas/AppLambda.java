package com.debuggeando_ideas.lambdas;


import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class AppLambda {

    public static void main(String[] args) {

        List<String> counties = List.of("Mexico", "Colombia", "Argentina", "Chile", "Uruguay");

        for (String c : counties) {
            System.out.println(c);
        }

        Predicate<Integer> p = n -> n > 10;
        BiConsumer<String, Integer> b = (str, num) -> System.out.println(str.concat(num.toString()));
        Supplier<Integer> su = () -> new Random().nextInt();
        Function<String, Integer> sss = word -> word.length();

        counties.forEach(c -> System.out.println(c.toUpperCase()));
    }
}
