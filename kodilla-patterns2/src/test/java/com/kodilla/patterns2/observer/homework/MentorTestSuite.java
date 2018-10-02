package com.kodilla.patterns2.observer.homework;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        StudentTaskQueue student1TaskList = new StudentTaskQueue("Student1");
        StudentTaskQueue student2TaskList = new StudentTaskQueue("Student2");
        StudentTaskQueue student3TaskList = new StudentTaskQueue("Student3");
        StudentTaskQueue student4TaskList = new StudentTaskQueue("Student4");
        StudentTaskQueue student5TaskList = new StudentTaskQueue("Student5");
        StudentTaskQueue student6TaskList = new StudentTaskQueue("Student6");

        Mentor mentor1 = new Mentor("mentor1");
        Mentor mentor2 = new Mentor("mentor2");

        student1TaskList.registerObserver(mentor1);
        student2TaskList.registerObserver(mentor1);
        student3TaskList.registerObserver(mentor1);
        student4TaskList.registerObserver(mentor2);
        student5TaskList.registerObserver(mentor2);
        student6TaskList.registerObserver(mentor2);

        //When
        student1TaskList.addTask("Task content 1");
        student2TaskList.addTask("Task content 2");
        student3TaskList.addTask("Task content 3");
        student4TaskList.addTask("Task content 4");
        student3TaskList.addTask("Task content 5");
        student5TaskList.addTask("Task content 6");
        student4TaskList.addTask("Task content 7");
        student6TaskList.addTask("Task content 8");

        //Then
        assertEquals(4, mentor1.getUpdateCount());
        assertEquals(4, mentor2.getUpdateCount());
    }
}