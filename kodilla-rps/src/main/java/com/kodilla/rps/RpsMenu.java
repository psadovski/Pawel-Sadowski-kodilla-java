package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

import static com.kodilla.rps.RpsRoundResult.COMPUTER;
import static com.kodilla.rps.RpsRoundResult.DRAW;
import static com.kodilla.rps.RpsRoundResult.USER;
import static com.kodilla.rps.RpsTurn.*;

public class RpsMenu {

    private static final String INTRODUCTION = ".::Welcome to Rock - Paper - Scissors Game::. \n    Game Instruction: \n";
    private static final String CASE1 = "Botton '1' - choose Rock \n";
    private static final String CASE2 = "Botton '2' - choose Paper \n";
    private static final String CASE3 = "Botton '3' - choose Scissors \n";
    private static final String GAMEEND = "Press 'x' to end the game \n";
    private static final String REPLAY = "Press 'n' to replay the game \n";

    static void printMenu(){
        System.out.println(String.join("", INTRODUCTION, CASE1, CASE2, CASE3, GAMEEND, REPLAY));
    }

    static void printShortMenu() {System.out.println(String.join("", CASE1, CASE2, CASE3));}

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
            System.out.println("Bad luck! Computer get's a point!");
        }
        if (result == USER) {
            System.out.println("Lucky! You get a point");
        }
        if (result == DRAW) {
            System.out.println("Draw, nobody get's a point");
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
        RpsTurn userTurn = ROCK;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your move: :");
        String move = scanner.next();

        switch (move) {
            case "1": return userTurn = ROCK;
            case "2": return userTurn = PAPER;
            case "3": return userTurn = SCISSORS;
            case "x": return userTurn = RpsTurn.END;
            case "n": return userTurn = RpsTurn.REPLAY;
            case "": return userTurn = RpsTurn.BAD;
        }
        return userTurn;
    }

    public static RpsTurn getComputerTurn() {
        RpsTurn computerTurn = ROCK;
        Random random = new Random();
        int move = random.nextInt(3);
        switch (move) {
            case 1: return computerTurn = ROCK;
            case 2: return computerTurn = PAPER;
            case 3: return computerTurn = SCISSORS;
        }
        return computerTurn;
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
        System.out.println("Wrong move, please insert correct number");
    }

    public static void printReplayGameInfo() {
        System.out.println("Replaying game...");
    }
}
