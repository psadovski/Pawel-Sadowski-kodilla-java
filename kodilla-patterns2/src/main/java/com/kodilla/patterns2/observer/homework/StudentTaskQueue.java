package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class StudentTaskQueue implements Observable {
    private final List<Observer> mentors;
    private final Deque<String> tasks;
    private final String taskListName;

    public StudentTaskQueue(String taskListName) {
        mentors = new ArrayList<>();
        tasks = new ArrayDeque<>();
        this.taskListName = taskListName;
    }

    public void addTask(String task) {
        tasks.offerLast(task);
        notifyObservers();
    }

    public Deque<String> getTasks() {
        return tasks;
    }

    public String getTaskQueueName() {
        return this.taskListName;
    }

    @Override
    public void registerObserver(Observer observer) {
        mentors.add(observer);
    }

    @Override
    public  void notifyObservers() {
        for (Observer observer : mentors) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        mentors.remove(observer);
    }
}