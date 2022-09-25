package com.debuggeando_ideas.code_challenge.intro_examples;

import util.Database;
import util.Videogame;

import java.util.List;

public class ParallelStreamIntro {

    public static void main(String[] args) {
        Database.videogames.parallelStream()
                .forEach(v -> System.out.println(Thread.currentThread().getName() + " - " + v));
    }
}
