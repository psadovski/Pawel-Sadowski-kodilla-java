package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.createTask(TaskType.SHOPPING_TASK);
        shopping.executeTask();

        //Then
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.createTask(TaskType.PAINTING_TASK);
        painting.executeTask();

        //Then
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.createTask(TaskType.DRIVING_TASK);
        driving.executeTask();

        //Then
        Assert.assertTrue(driving.isTaskExecuted());
    }
}
