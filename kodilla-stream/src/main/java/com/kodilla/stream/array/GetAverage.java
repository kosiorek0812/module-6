package com.kodilla.stream.array;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


public class GetAverage implements ArrayOperations{

    @Override
    public double getAverageWithoutIntStream(int[] numbers) {
        List<Integer> numbersToList = Arrays.stream(numbers).boxed().toList();

        return  numbersToList.stream()
                .mapToDouble(n -> (double) n)
                .average()
                .getAsDouble();

    }
    @Override
    public double getAverageWithIntStream(int[] numbers) {
        List<Integer> numbersToList = Arrays.stream(numbers).boxed().toList();

        return IntStream.range(0, numbersToList.size())
                .map(n -> numbersToList.get(n))
                .average()
                .getAsDouble();
    }
    @Override
    public void display(int[] numbers) {
        List<Integer> numbersToList = Arrays.stream(numbers).boxed().toList();

        IntStream.range(0, numbersToList.size())
                .forEach(n -> System.out.print(numbersToList.get(n) + " "));
    }



}
