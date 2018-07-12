package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAvarage() {
        //Given
        AvarageCalculator averageCalculator = new AvarageCalculator();
        int[] numbers = new int[]{2, 4, 5, 6, 3, 4, 3, 8, 7, 11};

        //When
        averageCalculator.getAverage(numbers);

        //Then
        double avarage = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average().getAsDouble();

        Assert.assertEquals(5.3, avarage, 0.001);
    }
}
