package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
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
