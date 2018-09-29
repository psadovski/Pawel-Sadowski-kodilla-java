package com.kodilla.sudoku.board;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class SudokuRow {
    private final List<SudokuElement> elements;

    public SudokuRow() {
        this.elements = new ArrayList<>();
    }
}
