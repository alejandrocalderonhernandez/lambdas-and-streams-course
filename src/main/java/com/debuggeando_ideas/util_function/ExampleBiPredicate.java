package com.debuggeando_ideas.util_function;

import java.util.function.BiPredicate;

public class ExampleBiPredicate {

    static BiPredicate<String, String> myEquals = (s1, s2) -> s1.concat(s2).equals("HelloWorld");


    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(myEquals.test(s1, s2));
    }

}
