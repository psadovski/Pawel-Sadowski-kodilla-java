package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case OddNumbersExterminatorList: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case OddNumbersExterminatorList: end");
    }


    @Test
    public void testOddNumbersExterminatorOddAndEvenNumbersList(){

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(2, 4);

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> actual = oddNumbersExterminator.exterminate(list);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){

        List<Integer> list = Collections.emptyList();
        List<Integer> expected = Collections.emptyList();

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> actual = oddNumbersExterminator.exterminate(list);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testOddNumbersExterminatorOnlyEvenNumbersList(){

        List<Integer> list = Arrays.asList(2, 4, 6, 8);
        List<Integer> expected = Arrays.asList(2, 4, 6, 8);

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> actual = oddNumbersExterminator.exterminate(list);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testOddNumbersExterminatorOnlyOddNumbersList(){

        List<Integer> list = Arrays.asList(1, 3, 7, 9);
        List<Integer> expected = Collections.emptyList();

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> actual = oddNumbersExterminator.exterminate(list);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testOddNumbersExterminatorNull(){

        List<Integer> list = null;
        List<Integer> expected = null;

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> actual = oddNumbersExterminator.exterminate(list);
        //Then
        Assert.assertEquals(expected, actual);
    }
}
