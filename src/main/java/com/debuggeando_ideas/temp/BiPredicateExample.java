package com.debuggeando_ideas.temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateExample {

    static BiPredicate<String, String> myEquals = (s1, s2) -> s1.concat(s2).equals("HelloWorld");

    public static void main(String[] args) {
        System.out.println(myEquals.test("Hello","World"));
    }
}
