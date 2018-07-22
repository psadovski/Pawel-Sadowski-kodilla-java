package com.kodilla.rps;

import java.util.Random;

public class ComputerChoice {
    String computerChoice = "";
    Random computerChooiceGenerator = new Random();
    int choice = computerChooiceGenerator.nextInt(5) + 1;

    public String computerChoosing() {
        switch(choice){
            case '1': computerChoice = "Rock";
            case '2': computerChoice = "Paper";
            case '3': computerChoice = "Scissors";
            case '4': computerChoice = "Spock";
            case '5': computerChoice = "Lizard";
        }

        return computerChoice;
    }
}
