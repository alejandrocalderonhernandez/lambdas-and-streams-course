package com.debuggeando_ideas.intro_examples;

import util.Database;
import util.Videogame;

import java.util.stream.Collectors;

public class GroupByIntro {

    public static void main(String[] args) {

        Database.videogames
                        .stream()
                        .collect(
                                Collectors.groupingBy(Videogame::getConsole,
                                Collectors.summarizingDouble(Videogame::getPrice)))
                .forEach((k,v) -> System.out.println(k + " - " + v.getAverage()));

    }
}
