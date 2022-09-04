package com.debuggeando_ideas.temp;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.stream.IntStream;

public class StrategyLambdasT {

    public static void main(String[] args) {

        var product1  = Product.builder().id(1L).name("Bear").price(150.00).userType("BASIC").build();
        var product2  = Product.builder().id(1L).name("Bear").price(150.00).userType("PLUS").build();
        var product3  = Product.builder().id(1L).name("Bear").price(150.00).userType("PRIME").build();
        var products = List.of(product1, product2, product3);

        products.forEach( p -> {
            switch (p.getUserType()) {
                case "BASIC": p.setDiscountStrategy(Strategies.basicDiscount); break;
                case "PLUS": p.setDiscountStrategy(Strategies.plusDiscount); break;
                case "PRIME": p.setDiscountStrategy(Strategies.primeDiscount); break;
            }
            p.setDiscount(p.getDiscountStrategy().get(p.getPrice()));
        });

       products.forEach(System.out::println);
    }
}

@FunctionalInterface
interface ApplyDiscount {
    Double get(Double toDiscount);
}

@Data
@ToString
@Builder
class Product {
    private Long id;
    private String userType;
    private String name;
    private Double price;
    private Double discount;
    private ApplyDiscount discountStrategy;
}

class Strategies {

    static ApplyDiscount basicDiscount = p -> p * .02;

    static ApplyDiscount plusDiscount = p -> p * .05;

    static ApplyDiscount primeDiscount = p -> p* .08;
}