package com.debuggeando_ideas.optional;

import util.Database;
import util.Videogame;

import java.util.Optional;

public class OptionalMap {

    public static void main(String[] args) {
        Optional<Videogame> gtaOpt = Optional.of(Database.videogames.get(5));
        String website = gtaOpt.map(videogame -> "The official website is " + videogame.getOfficialWebsite())
                .orElseThrow(RuntimeException::new);

        System.out.println(website);
    }
}
