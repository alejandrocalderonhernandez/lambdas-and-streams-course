package com.debuggeando_ideas.code_challenge.intro_examples;

import util.Database;
import util.Videogame;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ParallelStreamsNoLambdasIntro {

    public static void main(String[] args) {

        List<Videogame> videogames = Database.videogames;
        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        for (Videogame v : videogames) {
            threadPool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " - " + v);
                }
            });
        }

        threadPool.shutdown();
    }
}
