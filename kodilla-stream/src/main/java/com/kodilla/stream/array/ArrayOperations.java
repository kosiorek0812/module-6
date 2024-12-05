package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(number -> System.out.print(number + " "));

        double average = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .mapToDouble(n -> (double) n)
                .average()
                .getAsDouble();
        return average;
    }

}
