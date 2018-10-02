package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private static final String MSG = "%s: New tasks in the queue: %s (total: %s %s)";

    private final String name;
    private int taskCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(StudentTaskQueue taskQueue) {
        System.out.println(String.format(MSG, name, taskQueue.getTaskQueueName(),
                taskQueue.getTasks().size(), task(taskQueue.getTasks().size())));
        taskCount++;
    }

    public String getUsername() {
        return name;
    }

    public int getUpdateCount() {
        return taskCount;
    }
    
    private String task(long size) {
        return size == 1 ? "task" : "tasks";
    }
}