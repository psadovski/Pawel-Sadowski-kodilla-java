package com.kodilla.sudoku;

public class SudokuMenu {

    private static final String INTRODUCTION = ".::Welcome to Sudoku Resolver Game::. \n    Game Instruction: \n";
    private static final String INSTRUCTION = "Type 'SUDOKU' and press 'Enter' do resolve Sudoku. \n";
    private static final String GAMEEND = "Press 'x' to end the game. \n";

    static void printMenu() {
        System.out.println(String.join("", INTRODUCTION, INSTRUCTION, GAMEEND));
    }
}
