package com.kodilla.sudoku;

import com.kodilla.sudoku.board.SudokuBoard;

public class SudokuRunner {
    public static void main(String[] args) {

        SudokuMenu.printMenu();
        SudokuMenu.getGameDefinition();

        boolean gameFinished = false;
        while(!gameFinished) {

            SudokuBoard board = new SudokuBoard();
            SudokuMenu.printBoard(board);
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();
        }
    }
}
