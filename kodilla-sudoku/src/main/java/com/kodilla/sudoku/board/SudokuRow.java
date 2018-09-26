package com.kodilla.sudoku.board;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    private final List<SudokuElement> elements;

    public SudokuRow() {
        this.elements = new ArrayList<>();
    }

    public List<SudokuElement> getElements() {
        return this.elements;
    }
}
