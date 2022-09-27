package com.debuggeando_ideas.temp;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class ExampleBinaryOperator {

    public static void main(String[] args) {
        BiFunction<String, String, String> normalizeFunction = (a, b) -> a.toUpperCase() + " - " + b.toLowerCase();

        String result = normalizeFunction.apply("hola", "mundo");

        System.out.println(result);


        BinaryOperator<String> normalize = (a, b) -> a.toUpperCase() + " - " + b.toLowerCase();

        String result2 = normalize.apply("hola", "mundo");

        System.out.println(result2);
    }
}
