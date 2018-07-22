package com.kodilla.rps;

import java.util.Scanner;

public class RoundsRunner {

    public void runRounds() {
        Scanner scan = new Scanner(System.in);
        ChoiceComparator compareChoices = new ChoiceComparator();

        System.out.println("Please, make your move!");
        int gameMove = scan.nextInt();

        compareChoices.compare(gameMove);


    }
}
