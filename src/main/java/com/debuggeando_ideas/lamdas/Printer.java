package com.debuggeando_ideas.lamdas;

@FunctionalInterface
public interface Printer<T> {

    void print(T toPrint);
}
