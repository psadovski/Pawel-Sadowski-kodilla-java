package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

import static com.kodilla.rps.RpsRoundResult.COMPUTER;
import static com.kodilla.rps.RpsRoundResult.DRAW;
import static com.kodilla.rps.RpsRoundResult.USER;
import static com.kodilla.rps.RpsTurn.*;

public class RpsMenu {

    private static final String INTRODUCTION = ".::Welcome to Rock - Paper - Scissors Game::. \n    Game Instruction: \n";
    private static final String CASE1 = "Press '1' - to choose Rock \n";
    private static final String CASE2 = "Press '2' - to choose Paper \n";
    private static final String CASE3 = "Press '3' - to choose Scissors \n";
    private static final String GAMEEND = "Press 'x' to end the game \n";
    private static final String REPLAY = "Press 'n' to replay the game \n";

    static void printMenu(){
        System.out.println(String.join("", INTRODUCTION, CASE1, CASE2, CASE3, GAMEEND, REPLAY));
    }

    static void printShortMenu() {System.out.println(String.join(", ", "'1' - Rock", "'2' - Paper", "'3' - Scissors"));}

    static RpsGameDefinition getGameDefinition() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please insert your name: ");
        String name = scan.next();
        System.out.println("Please insert your game rounds quantity: ");
        int rounds = scan.nextInt();

        return new RpsGameDefinition(name, rounds);
    }

    static void printResult(RpsRoundResult result) {
        if (result == COMPUTER) {
            System.out.println("Bad luck! Computer get's a point!\n");
        }
        if (result == USER) {
            System.out.println("Lucky! You get a point\n");
        }
        if (result == DRAW) {
            System.out.println("Draw, nobody get's a point\n");
        }
    }

    static void printGameSummary(int gamerPoints, int computerPoints) {
        System.out.println("Game summary: " +
                            "\nGamer Points: " + gamerPoints +
                            "\nComputer Points: " + computerPoints);
    }

    public static void printRoundInfo(int roundNumber) {
        System.out.println("This is round number: " + roundNumber);
    }

    public static RpsTurn getUserTurn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your move: :");
        String input = scanner.next();
        return RpsTurn.getMove(input);
    }

    public static RpsTurn getComputerTurn() {
        Random random = new Random();
        int move = random.nextInt(3)+1;
        return RpsTurn.getMove(move);
    }

    public static void printComputerMoveInfo(RpsTurn move) {
        if (move == ROCK) {
            System.out.println("Computer has chosen rock.");
        }
        if (move == PAPER) {
            System.out.println("Computer has chosen paper.");
        }
        if (move == SCISSORS) {
            System.out.println("Computer has chosen scissors.");
        }
    }

    public static void printEndGameInfo() {
            System.out.println("Ending game...");
    }

    public static void printWrongInsertionInfo() {
        System.out.println("Wrong move, please insert correct number\n");
    }

    public static void printReplayGameInfo() {
        System.out.println("Replaying game...\n");
    }

    public static String getEndGameChoice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void printEndGameChoice() {
        System.out.println("Are you sure to end the game? Yes[y]/No[n]");
    }

    public static String getReplayGameChoice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void printReplayGameChoice() {
        System.out.println("Are you sure to replay the game? Yes[y]/No[n]");
    }
}
