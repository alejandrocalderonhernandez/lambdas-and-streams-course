package com.debuggeando_ideas.code_challenge.intro_examples;

import util.Database;
import util.Videogame;

import java.util.stream.Collectors;

public class GroupByIntro {

    public static void main(String[] args) {
        System.out.println(
                Database.videogames
                        .stream()
                        .collect(
                                Collectors.groupingBy(Videogame::getConsole,
                                Collectors.summarizingDouble(Videogame::getPrice)))
        );
    }
}
