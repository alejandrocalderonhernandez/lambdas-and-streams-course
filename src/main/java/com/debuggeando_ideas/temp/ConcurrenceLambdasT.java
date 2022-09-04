package com.debuggeando_ideas.temp;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

public class ConcurrenceLambdasT {

    static Runnable printerSum = () -> {
        long r = 0;
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100000; i ++) {
           r += i;
        }

        System.out.println("Total: "+ r);
    };

    static Callable<Long>  getSum = () -> {
        long r = 0;
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 100000; i ++) {
            r += i;
        }
        return r;
    };


    public static void main(String[] args) throws Exception {

        var exec = Executors.newSingleThreadExecutor();

        exec.submit(printerSum);
        var result = exec.submit(getSum);

        System.out.println("Result: " + result.get());
    }
}
