package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {

    private static final String EXECUTING_TASK_INFO = "Executing task: %s, Painting: %s, color: %s.";

    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean isExecuted;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.isExecuted = false;
    }

    @Override
    public String getTaskName() {
        return this.taskName;
    }

    @Override
    public void executeTask() {
        System.out.println(String.format(EXECUTING_TASK_INFO,
                this.taskName,
                this.whatToPaint,
                this.color));

        isExecuted = true;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}

