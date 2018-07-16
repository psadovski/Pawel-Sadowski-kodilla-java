package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){

        Calculator calculator = new Calculator();

        Integer result1 = calculator.add(5, 5);
        Integer result2 = calculator.substract(5, 3);

        if (result1.equals(10)){
            System.out.println("Adding test OK");
        } else {
            System.out.println("Error!");
        }

        if (result2.equals(2)){
            System.out.println("Substracting test OK");
        } else {
            System.out.println("Error!");
        }
    }
}