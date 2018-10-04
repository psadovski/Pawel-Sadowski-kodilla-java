package com.kodilla.sudoku;

import com.kodilla.sudoku.board.SudokuBoard;

import java.util.Scanner;

public class SudokuMenu {

    private static final String INTRODUCTION = ".::Welcome to Sudoku Resolver Game::. \n    Game Instruction: \n";
    private static final String INSTRUCTION = "Type 'SUDOKU' and press 'Enter' do resolve Sudoku. \n";
    private static final String GAMEEND = "Press 'x' to end the game. \n";

    static void printMenu() {
        System.out.println(String.join("", INTRODUCTION, INSTRUCTION, GAMEEND));
    }

    static SudokuGameDefinition getGameDefinition() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please insert your name: ");
        String name = scan.next();

        return new SudokuGameDefinition(name);
    }

    public static SudokuGameMove getUserTurn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your move: :");
        String input = scanner.next();
        return SudokuGameMove.getMove(input);
    }

    static String printBoard(SudokuBoard board) {
        return board.toString();
    }

    public static String getSolveReplayChoice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void printSolveReplayChoice() {
        System.out.println("Would you like to solve SUDOKU again? Yes[y]/No[n]");
    }

    public static void printEndGameInfo() {
        System.out.println("Ending game...");
    }

    public static void printWrongInsertionInfo() {
        System.out.println("Type SUDOKU to solve sudoku.");
    }

    public static String getEndGameChoice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void printEndGameChoice() {
        System.out.println("Are you sure to end the game? Yes[y]/No[n]");
    }
}
