package com.debuggeando_ideas.temp;

import java.util.UUID;
import java.util.function.Supplier;

public class StaticMethodReference {

    public static void main(String[] args) {

        //Supplier<UUID> getToken = () -> UUID.randomUUID();
        Supplier<UUID> getToken = UUID::randomUUID;

        System.out.println(UUID.randomUUID().toString());
    }
}
