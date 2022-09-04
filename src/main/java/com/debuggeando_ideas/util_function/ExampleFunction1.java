package com.debuggeando_ideas.util_function;

import java.util.function.Function;

public class ExampleFunction1 {

    static Function<Integer, Integer> multiply = n -> n * 10;
    static Function<Integer, Integer> sum = n -> n  + 10;
    static Function<Integer, Integer> addThenMultiply = multiply.andThen(sum);
    static Function<Integer, Integer> composeMultiply = multiply.compose(sum);

    public static void main(String[] args) {
        System.out.println(addThenMultiply.apply(5));
        System.out.println(composeMultiply.apply(5));
    }
}
