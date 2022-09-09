package com.debuggeando_ideas.real_appplications;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class ConcurrenceLambdas {

    static Runnable printerSum = () -> {
        long r = 0;
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 1000000; i++) {
            r += i;
        }
        System.out.println("Total: " + r);
    };

    static Callable<Long> getSum = () -> {
        long r = 0;
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 1000000; i++) {
            r += i;
        }
        return r;
    };

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Thread.currentThread().getName());
        var exec = Executors.newSingleThreadExecutor();

        exec.submit(printerSum);

        var result = exec.submit(getSum);

        System.out.println("Result: " + result.get());

        exec.shutdown();
    }
}
