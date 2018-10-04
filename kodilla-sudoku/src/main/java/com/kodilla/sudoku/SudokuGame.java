package com.kodilla.sudoku;

import static com.kodilla.sudoku.SudokuMenu.getUserTurn;

public class SudokuGame {
    public boolean resolveSudoku() {

        SudokuGameMove move = getUserTurn();
        switch (move) {
            case SUDOKU:
                //solveSudoku();
                SudokuMenu.printSolveReplayChoice();
                if (SudokuMenu.getSolveReplayChoice().equals("y")) {
                    SudokuMenu.printEndGameInfo();
                    return true;
                }
                return false;

            case BAD:
                SudokuMenu.printWrongInsertionInfo();
                return false;

            case END:
                SudokuMenu.printEndGameChoice();
                if (SudokuMenu.getEndGameChoice().equals("y")) {
                    SudokuMenu.printEndGameInfo();
                    return true;
                }
                return false;
        }
        return false;
    }
}
