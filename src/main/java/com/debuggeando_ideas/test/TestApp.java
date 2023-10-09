package com.debuggeando_ideas.test;

import util.Database;
import util.Videogame;

import java.util.List;

public class TestApp {

    public static void main(String[] args) {
        final List<TestValidation<Videogame>> validations = List.of(
                v -> v.getPrice() > 0,
                v -> v.getName().length() > 3,
                Videogame::getIsDiscount
        );

        System.out.println(Database.videogames.get(8));

        var validator = TestSimpleValidation.from(  Database.videogames.get(8), "fail to valid", validations);

        validator.startValidations();
    }
}
