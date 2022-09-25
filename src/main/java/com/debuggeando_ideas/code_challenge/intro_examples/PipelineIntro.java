package com.debuggeando_ideas.code_challenge.intro_examples;

import util.Database;
import util.Videogame;

import java.util.List;

public class PipelineIntro {

    public static void main(String[] args) {
        List<Videogame> videogames = Database.videogames;
        videogames.stream()
                .distinct()
                .filter(v -> v.getTotalSold() > 10)
                .map(v -> v.getName().toUpperCase())
                .forEach(System.out::println);
    }
}
