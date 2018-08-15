package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    private TaskType taskType;

    public final Task createTask(TaskType taskType) {
        switch (taskType) {
            case SHOPPING_TASK:
                return new ShoppingTask("Buy new company accesory", "Cars", 3);
            case PAINTING_TASK:
                return  new PaintingTask("Paint company rooms/space", "White", "Boss office");
            case DRIVING_TASK:
                return new DrivingTask("Driving to the customer", "Customer MicroSystem, adress: Mila 48 St. Warsaw", "Van");
            default:
                return null;
        }
    }
}
