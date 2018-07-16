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

        //Then
        Assert.assertEquals(new Metrics(3, 0, 3, 0.0, 1.0, 0.0 ), metrics);
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

        //Then
        Assert.assertEquals(new Metrics(4, 1000, 1000, 250.0, 250.0, 1.0 ), metrics);
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

        //Then
        Assert.assertEquals(new Metrics(4, 4, 0, 1.0, 0.0, 0.0 ), metrics);
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

        //Then
        Assert.assertEquals(new Metrics(4, 4, 2, 1.0, 0.5, 0.5 ), metrics);
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

        //Then
        Assert.assertEquals(new Metrics(4, 1, 2, 0.25, 0.5, 2.0 ), metrics);
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

        //Then
        Assert.assertEquals(new Metrics(0, 1, 2, 0.0, 0.0, 2.0 ), metrics);
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

        //Then
        Assert.assertEquals(new Metrics(100, 100, 100, 1.0, 1.0, 1.0 ), metrics);
    }
}
