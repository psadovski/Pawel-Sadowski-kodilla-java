package com.kodilla.sudoku.board;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class SudokuRow {
    private final List<SudokuElement> elements = new ArrayList<>();

    public SudokuRow() {
        for (int n = 0; n < 9; n++) {
            this.elements.add(new SudokuElement());
        }
    }
}
