package com.kodilla.rps;

import java.util.Scanner;

public class ChoiceComparator {
    public void compare(int gamerChoice) {
        ComputerChoice compChoice = new ComputerChoice();
        compChoice.computerChoosing();

        switch(gamerChoice){
            case '1': //Rock
                if(compChoice.computerChoosing() == "Rock"){
                    System.out.println("Draw! Nobody gets a point.");
                }
                if(compChoice.computerChoosing() == "Scissors"){
                    //playerPoints++;
                    System.out.println("Lucky! You get a point!");
                }
                if(compChoice.computerChoosing() == "Paper"){
                    //computerPoints++;
                    System.out.println("Bad luck! Computer gets a point!");
                }

                if(compChoice.computerChoosing() == "Spock"){
                   // computerPoints++;
                    System.out.println("Bad luck! Computer gets a point!");
                }

                if(compChoice.computerChoosing() == "Lizard"){
                    //playerPoints++;
                    System.out.println("Lucky! You get a point!");
                }
                break;

            case '2': //Paper
                if(compChoice.computerChoosing() == "Paper"){
                    System.out.println("Draw! Nobody gets a point.");
                }
                if(compChoice.computerChoosing() == "Rock"){
                   // playerPoints++;
                    System.out.println("Lucky! You get a point!");
                }
                if(compChoice.computerChoosing() == "Scissors"){
                    //computerPoints++;
                    System.out.println("Bad luck! Computer gets a point!");
                }

                if(compChoice.computerChoosing() == "Lizard"){
                    //computerPoints++;
                    System.out.println("Bad luck! Computer gets a point!");
                }

                if(compChoice.computerChoosing() == "Spock"){
                   // playerPoints++;
                    System.out.println("Lucky! You get a point!");
                }
                break;

            case '3': //Scissors
                if(compChoice.computerChoosing() == "Scissors"){
                    System.out.println("Draw! Nobody gets a point.");
                }
                if(compChoice.computerChoosing() == "Paper"){
                    //playerPoints++;
                    System.out.println("Lucky! You get a point!");
                }
                if(compChoice.computerChoosing() == "Rock"){
                    //computerPoints++;
                    System.out.println("Bad luck! Computer gets a point!");
                }

                if(compChoice.computerChoosing() == "Spock"){
                    //computerPoints++;
                    System.out.println("Bad luck! Computer gets a point!");
                }

                if(compChoice.computerChoosing() == "Lizard"){
                   // playerPoints++;
                    System.out.println("Lucky! You get a point!");
                }
                break;

            case '4': //Spock
                if(compChoice.computerChoosing() == "Spock"){
                    System.out.println("Draw! Nobody gets a point.");
                }
                if(compChoice.computerChoosing() == "Scissors"){
                   // playerPoints++;
                    System.out.println("Lucky! You get a point!");
                }
                if(compChoice.computerChoosing() == "Paper"){
                    //computerPoints++;
                    System.out.println("Bad luck! Computer gets a point!");
                }

                if(compChoice.computerChoosing() == "Lizard"){
                    //computerPoints++;
                    System.out.println("Bad luck! Computer gets a point!");
                }

                if(compChoice.computerChoosing() == "Rock"){
                    //playerPoints++;
                    System.out.println("Lucky! You get a point!");
                }
                break;

            case '5': //Lizard
                if(compChoice.computerChoosing() == "Lizard"){
                    System.out.println("Draw! Nobody gets a point.");
                }
                if(compChoice.computerChoosing() == "Paper"){
                   // playerPoints++;
                    System.out.println("Lucky! You get a point!");
                }
                if(compChoice.computerChoosing() == "Scissors"){
                    //computerPoints++;
                    System.out.println("Bad luck! Computer gets a point!");
                }

                if(compChoice.computerChoosing() == "Rock"){
                    //computerPoints++;
                    System.out.println("Bad luck! Computer gets a point!");
                }

                if(compChoice.computerChoosing() == "Spock"){
                    //playerPoints++;
                    System.out.println("Lucky! You get a point!");
                }
                break;

            case 'x':
                Scanner scan = new Scanner(System.in);
                System.out.println("Are you sure to exit a game? Yes(y)");

                String exit = scan.next();
                if (exit == "y") {
                    System.exit(0);
                    break;
                }

            case 'n':
                //System.exit(0); break;

        }
    }
}
