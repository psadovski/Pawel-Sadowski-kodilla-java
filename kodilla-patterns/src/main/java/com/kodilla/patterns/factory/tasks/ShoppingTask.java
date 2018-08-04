package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    private static final String EXECUTING_TASK_INFO = "Executing task: %s, Buying: %s, quantity: %s.";

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    public boolean isExexuted;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String getTaskName() {
        return this.taskName;
    }

    @Override
    public void executeTask() {
        System.out.println(String.format(EXECUTING_TASK_INFO,
                this.taskName,
                this.whatToBuy,
                this.quantity));

        isExexuted = true;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExexuted;
    }
}
