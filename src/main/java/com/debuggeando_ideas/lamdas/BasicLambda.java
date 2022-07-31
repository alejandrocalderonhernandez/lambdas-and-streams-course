package com.debuggeando_ideas.lamdas;

public class BasicLambda {

    public static void main(String[] args) {
        Operation subtract = new Operation() {
            @Override
            public Double execute(Double a, Double b) {
                return a - b;
            }
        };

        Operation multiply = (a, b) -> a * b;

        System.out.println(subtract.execute(10.0, 5.0));
        System.out.println(subtract.sum(5.0, 5.0));
        System.out.println(multiply.execute(10.0, 5.0));

    }
}
