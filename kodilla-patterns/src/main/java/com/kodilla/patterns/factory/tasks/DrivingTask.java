package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    private static final String EXECUTING_TASK_INFO = "Executing task: %s, Driving to: %s, by: %s.";

    private final String taskName;
    private final String where;
    private final String using;
    public boolean isExexuted;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String getTaskName() {
        return this.taskName;
    }

    @Override
    public void executeTask() {
        System.out.println(String.format(EXECUTING_TASK_INFO,
                this.taskName,
                this.where,
                this.using));

        isExexuted = false;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExexuted;
    }
}

