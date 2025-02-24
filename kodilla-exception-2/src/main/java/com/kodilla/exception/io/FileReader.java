package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile() throws FileReaderException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("names.txt").getFile());

        try (Stream<String> fileLines = Files.lines(Paths.get("tego-pliku-nie-ma.txt"))) {
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            throw new FileReaderException("THERE IS NO FILE!");
        } finally {
            System.out.println("I am gonna be here... always!");
        }
    }
}