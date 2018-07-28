package com.kodilla.rps;

import java.util.Scanner;

public class RoundsRunner {

    public void runRounds() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please, make your move!");
        int gamerMove = scan.nextInt();

        new ChoiceComparator().compare(gamerMove);


    }
}
