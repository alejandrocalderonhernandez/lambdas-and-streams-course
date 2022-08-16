package com.debuggeando_ideas.lambdas;

@FunctionalInterface
public interface Printer<T> {

    void print(T toPrint);
}
