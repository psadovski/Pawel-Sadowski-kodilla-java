package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private final List<String> tasks;

    public TaskList() {
         tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        String result = "";

        for (int i = 0; i < tasks.size(); i++) {
            result += "" + tasks.get(i);
        }
        return result;
    }
}


