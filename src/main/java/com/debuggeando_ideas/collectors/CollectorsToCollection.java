package com.debuggeando_ideas.collectors;

import util.Database;
import util.Videogame;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsToCollection {

    public static void main(String[] args) {
        Stream<Videogame> videogames = Database.videogames.stream();
        streamToMap(videogames).forEach((k, v) -> System.out.println(k + " - " + v));
    }

    static Collection<Videogame> streamToCollection(Stream<Videogame> stream, String type) {
        return (type.equals("LIST")) ? stream.collect(Collectors.toList()) : stream.collect(Collectors.toSet());
    }

    static Map<String, Double> streamToMap(Stream<Videogame> stream) {
        return stream.distinct().collect(Collectors.toMap(Videogame::getName, Videogame::getPrice));
    }
}
