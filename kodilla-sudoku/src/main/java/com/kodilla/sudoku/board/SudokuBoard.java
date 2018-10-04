package com.kodilla.sudoku.board;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 9;

    private List<SudokuRow> rows = new ArrayList<>();

    public SudokuBoard() {
        for (int n = MIN_INDEX; n < MAX_INDEX; n++) {
            rows.add(new SudokuRow());
        }
    }

    public List<SudokuRow> getRows() {
        return this.rows;
    }

    @Override
    public String toString() {
        String board = "";

        for (int i = MIN_INDEX; i <= MAX_INDEX; i++) {
            for (int k = MIN_INDEX; k <= MAX_INDEX; k++) {
                if (i == MIN_INDEX) {
                    board += "  " + "_" + "  ";
                } else if (k == MAX_INDEX) {
                    board += "|" + " ";
                } else {
                    board += "|" + "_";
                }
            }
            board += "\n";
        }
        return board;
    }
}

