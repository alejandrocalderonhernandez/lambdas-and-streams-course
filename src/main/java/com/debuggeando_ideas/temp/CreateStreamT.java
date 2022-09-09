package com.debuggeando_ideas.temp;

import util.Database;
import util.Videogame;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class CreateStreamT {

    public static void main(String[] args) {
        Stream<Videogame> myStream = Database.videogames.stream();
        DoubleStream myDoubleStream= DoubleStream.of(20.1, 30.2);
        System.out.println(myStream);
    }
}
