package com.debuggeando_ideas.optional;

import util.Database;
import util.Videogame;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        Optional<Videogame> gtaOpt = Optional.ofNullable(null);

        System.out.println(gtaOpt.orElseThrow(() -> new RuntimeException("Videogame not found")));
    }
}
