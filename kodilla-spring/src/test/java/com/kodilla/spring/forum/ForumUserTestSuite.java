package com.kodilla.spring.forum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ForumUserTestSuite {
    @Test
    public void testGetUsername() {
        //Given
        ApplicationContext contex = new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser forumUser = contex.getBean(ForumUser.class);

        //When
        String actual = forumUser.getUserName();
        String expected = "John Smith";

        //Then
        Assert.assertEquals(expected, actual);
    }
}
