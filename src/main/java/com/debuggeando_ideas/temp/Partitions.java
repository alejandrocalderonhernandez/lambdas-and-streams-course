package com.debuggeando_ideas.temp;

import util.Console;
import util.Database;
import util.Videogame;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Partitions {

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();

        Map<Boolean, List<Videogame>> byXboxOrPlaystation = videogames.collect(Collectors.partitioningBy(
                v -> v.getConsole().equals(Console.XBOX)  || v.getConsole().equals(Console.PLAYSTATION)
        ));

        byXboxOrPlaystation.forEach((k, v) -> System.out.println(k + " - " + v));
    }
}