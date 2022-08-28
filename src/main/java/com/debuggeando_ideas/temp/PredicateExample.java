package com.debuggeando_ideas.temp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> isGreaterThan100 = n -> n > 100;
    static Predicate<Integer> isLessThan10 = n -> n < 10;
    static Predicate<Integer> isBetween10Ans100 = isGreaterThan100.or(isLessThan10);


    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 10, 50, 100, 150, 200));
        System.out.println(numbers);

        numbers.removeIf(isBetween10Ans100);

        System.out.println(numbers);
    }
}
