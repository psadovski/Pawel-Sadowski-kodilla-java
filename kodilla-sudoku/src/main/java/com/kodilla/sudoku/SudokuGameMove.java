package com.kodilla.sudoku;

import java.util.Arrays;

public enum SudokuGameMove {
    BAD(""), END("x"), SUDOKU("SUDOKU");

    private String move;

    SudokuGameMove(String move) {
        this.move = move;
    }

    public static SudokuGameMove getMove(String move) {
        return Arrays.stream(values()).filter(x -> x.getMove().equalsIgnoreCase(move)).findFirst().orElse(BAD);
    }

    public static SudokuGameMove getMove(Integer move) {
        return getMove(move.toString());
    }

    public String getMove() {
        return move;
    }
}
