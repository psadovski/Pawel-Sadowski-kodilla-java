package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main (String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(5.9, 1.7);
            System.out.println(result);

        } catch (Exception e) {
            System.out.println("Something went wrong! " + e);

        } finally {
            System.out.println("I am gonna be here always");
        }
    }
}
