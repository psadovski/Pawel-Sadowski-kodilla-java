package com.kodilla.stream.array;

import java.util.stream.IntStream;

public class AvarageCalculator implements ArrayOperations {

    public static void getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(n -> System.out.println(numbers[n]));

        double avarage = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average().getAsDouble();

        System.out.println(avarage);
    }
}

