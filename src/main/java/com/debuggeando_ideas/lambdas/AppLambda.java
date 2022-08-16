package com.debuggeando_ideas.lambdas;


import java.util.List;

public class AppLambda {

    public static void main(String[] args) {

        List<String> counties = List.of("Mexico", "Colombia", "Argentina", "Chile", "Uruguay");

        for (String c : counties) {
            System.out.println(c);
        }

        counties.forEach(c -> System.out.println(c.toUpperCase()));
    }
}
