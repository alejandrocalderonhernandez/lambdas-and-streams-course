package com.debuggeando_ideas.reference_methods;

import java.util.function.BiPredicate;

public class ArbitraryMethodReference {

    public static void main(String[] args) {
        //BiPredicate<String, String> equals = (s1, s2) -> s1.equals(s2);
        BiPredicate<String, String> equals = String::equals;

        boolean isEquals = equals.test("b", "a");
        System.out.println(isEquals);
    }
}
