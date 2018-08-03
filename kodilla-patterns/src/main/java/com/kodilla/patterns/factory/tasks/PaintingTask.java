package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    public boolean isExexuted = false;
    private static final String EXECuTING_TASK_INFO = "Executing task: %s, Painting: %s, color: %s.";

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String getTaskName() {
        return this.taskName;
    }

    @Override
    public void executeTask() {
        System.out.println(String.format(EXECuTING_TASK_INFO,
                this.taskName,
                this.whatToPaint,
                this.color));

        isExexuted = true;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExexuted;
    }
}

