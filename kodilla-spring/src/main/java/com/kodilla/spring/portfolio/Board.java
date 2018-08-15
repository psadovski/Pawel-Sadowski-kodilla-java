package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(final TaskList toDoList, final TaskList inProgressList, final TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return this.toDoList;
    }

    public TaskList getInProgressList() {
        return this.inProgressList;
    }

    public TaskList getDoneList() {
        return this.doneList;
    }


    @Override
    public String toString() {
        return "Board: " +
                "toDoList = " + toDoList +
                ", inProgressList = " + inProgressList +
                ", doneList = " + doneList;
    }
}
