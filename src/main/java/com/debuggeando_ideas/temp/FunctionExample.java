package com.debuggeando_ideas.temp;

import lombok.ToString;

import java.io.*;
import java.util.Arrays;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        Function<Person, ByteArrayOutputStream> serializer = p -> {
            ByteArrayOutputStream inMemoryBytes = new ByteArrayOutputStream();
            try (ObjectOutputStream outputStream = new ObjectOutputStream(inMemoryBytes)) {
                outputStream.writeObject(p);
                outputStream.flush();
            } catch (IOException ioe) {
                System.err.println(ioe.getMessage());
            }
            return inMemoryBytes;
        };

        Function<ByteArrayInputStream, Person> deserializer = bais -> {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(bais)) {
                return (Person) objectInputStream.readObject();
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e.getMessage());
            }
        };

        ByteArrayOutputStream objectSerialized = serializer.apply(new Person("Max", 26));

        System.out.println(Arrays.toString(objectSerialized.toByteArray()));

        Person objectDeserialized = deserializer.apply(new ByteArrayInputStream(objectSerialized.toByteArray()));

        System.out.println(objectDeserialized.toString());

        Function<Integer, Integer> multiply = n -> n * 10;
        Function<Integer, Integer> add =  n -> n  + 10;
        Function<Integer, Integer> addThenMultiply = multiply.compose(add);
        Function<Integer, Integer> multiplyThenAdd = multiply.andThen(add);
        Integer result = addThenMultiply.apply(3);
        Integer result2 = multiplyThenAdd.apply(3);
        System.out.println(result);
        System.out.println(result2);



    }
}

@ToString
class Person implements Serializable{
    private  String name;
    private  Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
