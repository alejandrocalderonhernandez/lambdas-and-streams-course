package com.debuggeando_ideas.temp;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ArbitraryMethodReference {

    public static void main(String[] args) {

        //BiPredicate<String, String> equals = (s1, s2) -> s1.equals(s2);
        BiPredicate<String, String> equals = String::equals;

        boolean isEquals = equals.test("Hello", "World");

        System.out.println(isEquals);
    }
}
