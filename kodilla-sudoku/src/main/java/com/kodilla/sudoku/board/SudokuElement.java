package com.kodilla.sudoku.board;


import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Setter
@Getter
public class SudokuElement {

    private static final List<Integer> VALUES = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
    public static int EMPTY = -1;

    private int value;
    private List<Integer> possibleValues;


    public SudokuElement() {
        this.value = EMPTY;
        this.possibleValues = VALUES;
    }

    @Override
    public String toString() {
        if (value == EMPTY || value == 0) {
            return " ";
        }
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SudokuElement that = (SudokuElement) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
