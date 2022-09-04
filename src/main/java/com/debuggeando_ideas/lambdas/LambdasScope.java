package com.debuggeando_ideas.lambdas;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class LambdasScope {

    public static void main(String[] args) {
        AtomicInteger num = new AtomicInteger(10);
        IntStream.range(1,10).forEach(i -> num.set(num.get() + i));

        System.out.println(num.get());
    }
}
