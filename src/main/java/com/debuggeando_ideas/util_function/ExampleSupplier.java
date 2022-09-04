package com.debuggeando_ideas.util_function;

import lombok.ToString;

import java.util.Random;
import java.util.function.Supplier;

public class ExampleSupplier {

    static Supplier<Integer> randomInt = () -> new Random().nextInt(100);
    static Supplier<MyProduct> productSupplier = () -> new MyProduct(100, "Smartphone");

    public static void main(String[] args) {
        System.out.println(randomInt.get());
        System.out.println(randomInt.get());
        System.out.println(productSupplier.get());
    }
}

@ToString
class MyProduct {

    Integer price;
    String name;

    public MyProduct(Integer price, String name) {
        this.price = price;
        this.name = name;
    }
}
