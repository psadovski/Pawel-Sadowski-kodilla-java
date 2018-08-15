package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testAddTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        TaskList listToDo = board.getToDoList();
        listToDo.getTasks().add("Task number 1");

        TaskList inProgressList = board.getInProgressList();
        inProgressList.getTasks().add("Task number 2");

        TaskList doneList = board.getDoneList();
        doneList.getTasks().add("Task number 3");

        board.getToDoList();
        board.getInProgressList();
        board.getDoneList();

        //Then
        Assert.assertEquals("Task number 1", listToDo.getTasks().get(0));
        Assert.assertEquals("Task number 2", inProgressList.getTasks().get(0));
        Assert.assertEquals("Task number 3", doneList.getTasks().get(0));
    }
}
