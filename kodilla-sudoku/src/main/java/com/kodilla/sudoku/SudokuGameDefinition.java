package com.kodilla.sudoku;

import lombok.Getter;

@Getter
public class SudokuGameDefinition {
    private String name;

    public SudokuGameDefinition(String name) {
        this.name = name;
    }
}
