package com.debuggeando_ideas.temp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFileT {

    public static void main(String[] args) {

        Path file = Paths.get("src/main/resources/lambdas.txt");
        try(Stream<String> lines = Files.lines(file)
                .onClose(() -> System.out.println("Finished reading the file"))) {
            lines.forEach(System.out::println);
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }
}
