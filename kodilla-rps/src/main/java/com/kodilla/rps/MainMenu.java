package com.kodilla.rps;

import java.util.Scanner;

public class MainMenu {
    private boolean end = false;

    public void runMainMenuFunction() {
        while(!end){
            Scanner scan = new Scanner(System.in);
            System.out.println("Type 's' to start game or 'q' to quit");
            String input = scan.next();
            switch(input){
                case "s":
                    new GameProcessor().runGame(); break;
                case "q":
                    System.out.println("Ending the game...");
                    end = true; break;
            }
        }
    }
}
