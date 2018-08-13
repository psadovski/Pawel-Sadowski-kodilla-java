package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("listName", "description");
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> searchedList = taskListDao.findByListName(listName);

        //Then
        String actual = searchedList.get(0).getListName();
        String explicite = taskList.getListName();
        Assert.assertEquals(explicite, actual);
        Assert.assertEquals(1, searchedList.size());

        //CleanUp
        int id = searchedList.get(0).getId();
        taskListDao.delete(id);
    }
}
