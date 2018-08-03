package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;
    public boolean isExexuted = false;
    private static final String EXECuTING_TASK_INFO = "Executing task: %s, Driving to: %s, by: %s.";

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
        System.out.println(String.format(EXECuTING_TASK_INFO,
                this.taskName,
                this.where,
                this.using));

        isExexuted = true;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExexuted;
    }
}

