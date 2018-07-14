package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticTestSuite {
    @Test
    public void testStatisticCalculatorWithZeroPosts() {
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Arnold");
        names.add("Jane");
        when(statisticMock.usersNames()).thenReturn(names);
        when(statisticMock.commentsCount()).thenReturn(3);
        when(statisticMock.postsCount()).thenReturn(0);

        //When
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        Metrics metrics = statisticCalculator.calculateAdvStatistics(statisticMock);
        double actualAvaragePostsPerUser = metrics.getAvaragePostsPerUser();
        double expectedAvaragePostsPerUser = 0.0;

        double actualAvarageCommentsPerUser = metrics.getAvarageCommentsPerUser();
        double expectedAvarageCommentsPerUser = 1.0;

        double actualAvarageCommentsPerPost = metrics.getAvarageCommentsPerPost();
        double expectedAvarageCommentsPerPost = 0.0;

        //Then
        Assert.assertEquals(expectedAvaragePostsPerUser, actualAvaragePostsPerUser, 0.001 );
        Assert.assertEquals(expectedAvarageCommentsPerUser, actualAvarageCommentsPerUser, 0.001 );
        Assert.assertEquals(expectedAvarageCommentsPerPost, actualAvarageCommentsPerPost, 0.001 );
    }

    @Test
    public void testStatisticCalculatorWith1000Posts() {
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Arnold");
        names.add("Jane");
        names.add("Mark");
        when(statisticMock.usersNames()).thenReturn(names);
        when(statisticMock.commentsCount()).thenReturn(1000);
        when(statisticMock.postsCount()).thenReturn(1000);

        //When
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        Metrics metrics = statisticCalculator.calculateAdvStatistics(statisticMock);
        double actualAvaragePostsPerUser = metrics.getAvaragePostsPerUser();
        double expectedAvaragePostsPerUser = 250.0;

        double actualAvarageCommentsPerUser = metrics.getAvarageCommentsPerUser();
        double expectedAvarageCommentsPerUser = 250.0;

        double actualAvarageCommentsPerPost = metrics.getAvarageCommentsPerPost();
        double expectedAvarageCommentsPerPost = 1.0;

        //Then
        Assert.assertEquals(expectedAvaragePostsPerUser, actualAvaragePostsPerUser, 0.001 );
        Assert.assertEquals(expectedAvarageCommentsPerUser, actualAvarageCommentsPerUser, 0.001 );
        Assert.assertEquals(expectedAvarageCommentsPerPost, actualAvarageCommentsPerPost, 0.001 );
    }

    @Test
    public void testStatisticCalculatorWith0Comments() {
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Arnold");
        names.add("Jane");
        names.add("Mark");
        when(statisticMock.usersNames()).thenReturn(names);
        when(statisticMock.commentsCount()).thenReturn(0);
        when(statisticMock.postsCount()).thenReturn(4);

        //When
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        Metrics metrics = statisticCalculator.calculateAdvStatistics(statisticMock);
        double actualAvaragePostsPerUser = metrics.getAvaragePostsPerUser();
        double expectedAvaragePostsPerUser = 1.0;

        double actualAvarageCommentsPerUser = metrics.getAvarageCommentsPerUser();
        double expectedAvarageCommentsPerUser = 0.0;

        double actualAvarageCommentsPerPost = metrics.getAvarageCommentsPerPost();
        double expectedAvarageCommentsPerPost = 0.0;

        //Then
        Assert.assertEquals(expectedAvaragePostsPerUser, actualAvaragePostsPerUser, 0.001 );
        Assert.assertEquals(expectedAvarageCommentsPerUser, actualAvarageCommentsPerUser, 0.001 );
        Assert.assertEquals(expectedAvarageCommentsPerPost, actualAvarageCommentsPerPost, 0.001 );
    }

    @Test
    public void testStatisticCalculatorWithCommentsCountLowerThanPostsCount() {
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Arnold");
        names.add("Jane");
        names.add("Mark");
        when(statisticMock.usersNames()).thenReturn(names);
        when(statisticMock.commentsCount()).thenReturn(2);
        when(statisticMock.postsCount()).thenReturn(4);

        //When
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        Metrics metrics = statisticCalculator.calculateAdvStatistics(statisticMock);
        double actualAvaragePostsPerUser = metrics.getAvaragePostsPerUser();
        double expectedAvaragePostsPerUser = 1.0;

        double actualAvarageCommentsPerUser = metrics.getAvarageCommentsPerUser();
        double expectedAvarageCommentsPerUser = 0.5;

        double actualAvarageCommentsPerPost = metrics.getAvarageCommentsPerPost();
        double expectedAvarageCommentsPerPost = 0.5;

        //Then
        Assert.assertEquals(expectedAvaragePostsPerUser, actualAvaragePostsPerUser, 0.001 );
        Assert.assertEquals(expectedAvarageCommentsPerUser, actualAvarageCommentsPerUser, 0.001 );
        Assert.assertEquals(expectedAvarageCommentsPerPost, actualAvarageCommentsPerPost, 0.001 );
    }

    @Test
    public void testStatisticCalculatorWithCommentsCountGreaterThanPostsCount() {
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Arnold");
        names.add("Jane");
        names.add("Mark");
        when(statisticMock.usersNames()).thenReturn(names);
        when(statisticMock.commentsCount()).thenReturn(2);
        when(statisticMock.postsCount()).thenReturn(1);

        //When
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        Metrics metrics = statisticCalculator.calculateAdvStatistics(statisticMock);
        double actualAvaragePostsPerUser = metrics.getAvaragePostsPerUser();
        double expectedAvaragePostsPerUser = 0.25;

        double actualAvarageCommentsPerUser = metrics.getAvarageCommentsPerUser();
        double expectedAvarageCommentsPerUser = 0.5;

        double actualAvarageCommentsPerPost = metrics.getAvarageCommentsPerPost();
        double expectedAvarageCommentsPerPost = 2.0;

        //Then
        Assert.assertEquals(expectedAvaragePostsPerUser, actualAvaragePostsPerUser, 0.001 );
        Assert.assertEquals(expectedAvarageCommentsPerUser, actualAvarageCommentsPerUser, 0.001 );
        Assert.assertEquals(expectedAvarageCommentsPerPost, actualAvarageCommentsPerPost, 0.001 );
    }

    @Test
    public void testStatisticCalculatorWith0UserQuantity() {
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> names = new ArrayList<>();
        when(statisticMock.usersNames()).thenReturn(names);
        when(statisticMock.commentsCount()).thenReturn(2);
        when(statisticMock.postsCount()).thenReturn(1);

        //When
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        Metrics metrics = statisticCalculator.calculateAdvStatistics(statisticMock);
        double actualAvaragePostsPerUser = metrics.getAvaragePostsPerUser();
        double expectedAvaragePostsPerUser = 0.0;

        double actualAvarageCommentsPerUser = metrics.getAvarageCommentsPerUser();
        double expectedAvarageCommentsPerUser = 0.0;

        double actualAvarageCommentsPerPost = metrics.getAvarageCommentsPerPost();
        double expectedAvarageCommentsPerPost = 2.0;

        //Then
        Assert.assertEquals(expectedAvaragePostsPerUser, actualAvaragePostsPerUser, 0.001 );
        Assert.assertEquals(expectedAvarageCommentsPerUser, actualAvarageCommentsPerUser, 0.001 );
        Assert.assertEquals(expectedAvarageCommentsPerPost, actualAvarageCommentsPerPost, 0.001 );
    }

    @Test
    public void testStatisticCalculatorWith100UserQuantity() {
        //Given
        Statistics statisticMock = mock(Statistics.class);
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            names.add("Tom" + i);
        }
        when(statisticMock.usersNames()).thenReturn(names);
        when(statisticMock.commentsCount()).thenReturn(100);
        when(statisticMock.postsCount()).thenReturn(100);

        //When
        StatisticCalculator statisticCalculator = new StatisticCalculator();
        Metrics metrics = statisticCalculator.calculateAdvStatistics(statisticMock);
        double actualAvaragePostsPerUser = metrics.getAvaragePostsPerUser();
        double expectedAvaragePostsPerUser = 1.0;

        double actualAvarageCommentsPerUser = metrics.getAvarageCommentsPerUser();
        double expectedAvarageCommentsPerUser = 1.0;

        double actualAvarageCommentsPerPost = metrics.getAvarageCommentsPerPost();
        double expectedAvarageCommentsPerPost = 1.0;

        //Then
        Assert.assertEquals(expectedAvaragePostsPerUser, actualAvaragePostsPerUser, 0.001 );
        Assert.assertEquals(expectedAvarageCommentsPerUser, actualAvarageCommentsPerUser, 0.001 );
        Assert.assertEquals(expectedAvarageCommentsPerPost, actualAvarageCommentsPerPost, 0.001 );
    }
}
