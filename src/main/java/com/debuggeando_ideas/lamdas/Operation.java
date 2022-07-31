package com.debuggeando_ideas.lamdas;

@FunctionalInterface
public interface Operation {

    Double execute(Double a, Double b);

    default Double sum(Double a, Double b) {
        return a + b;
    }
}
