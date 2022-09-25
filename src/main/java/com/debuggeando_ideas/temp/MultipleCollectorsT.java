package com.debuggeando_ideas.temp;

import util.Database;
import util.Videogame;

import java.util.stream.Collectors;

public class MultipleCollectorsT {

    public static void main(String[] args) {
        System.out.println(
                Database.videogames
                        .stream()
                        .collect(
                                Collectors.groupingBy(Videogame::getConsole,
                                        Collectors.summarizingInt(Videogame::getTotalSold)))
        );
    }


}
