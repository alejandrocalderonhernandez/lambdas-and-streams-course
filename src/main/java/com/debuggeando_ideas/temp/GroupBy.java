package com.debuggeando_ideas.temp;

import util.Console;
import util.Database;
import util.Videogame;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupBy {
    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();

        Map<Console, List<Videogame>> byConsole = videogames.collect(Collectors.groupingBy(Videogame::getConsole));

        byConsole.forEach((k, v) -> System.out.println(k + " - " + v));
    }

}
