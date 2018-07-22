package com.kodilla.rps;

import java.util.Scanner;

public class GameProcessor {
     public void runGame() {
        Scanner scan = new Scanner(System.in);
        GameInstructionDisplayer displayer = new GameInstructionDisplayer();
        RoundsRunner roundsRunner = new RoundsRunner();

        System.out.println("Please insert your name: ");
        String gamerName = scan.next();
        System.out.println("Please insert your game rounds quantity: ");
        int roundQuantity = scan.nextInt();

        System.out.println("Game opened for gamer " + gamerName + ", game round quantity: " + roundQuantity);
        System.out.println(displayer.displayInstruction());

        for (int i = 0; i < roundQuantity; i++) {
           roundsRunner.runRounds();
        }
     }
}
