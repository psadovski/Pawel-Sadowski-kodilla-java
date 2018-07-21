package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;
    private final List<TaskList> taskLists = new ArrayList<>();

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

    public List<TaskList> getTaskLists() {
        return taskLists;
    }

    @Override
    public String toString() {
        String s = "Board \n";
        for(TaskList list : taskLists) {
            s = s + list.toString() + "\n";
        }
        return s;
    }
}
