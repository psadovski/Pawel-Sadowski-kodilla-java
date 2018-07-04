package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of the tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("This is the end of the tests.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to executing test number: " + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        Shape circle = new Circle(3.5);
        ShapeCollector shapeCollector = new ShapeCollector(circle);
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(1, shapeCollector.getFiguresQuantity());
    }

    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        Shape circle = new Circle(4.0);
        ShapeCollector shapeCollector = new ShapeCollector(circle);
        //When
        boolean actual = shapeCollector.removeFigure(circle);
        //Then
        Assert.assertFalse(actual);
    }

    @Test
    public void testRemovePost() {
        //Given
        Shape circle = new Circle(5.0);
        ShapeCollector shapeCollector = new ShapeCollector(circle);

        shapeCollector.addFigure(circle);

        //When
        boolean actual = shapeCollector.removeFigure(circle);

        //Then
        Assert.assertTrue(actual);
        Assert.assertEquals(0, shapeCollector.getFiguresQuantity());
    }

    @Test
    public void testGetFigure() {
        //Given
        Shape circle = new Circle(2.0);
        ShapeCollector shapeCollector = new ShapeCollector(circle);

        shapeCollector.addFigure(circle);

        //When
        Shape actual = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(circle, actual);
    }

    @Test
    public void testShowFigures() {
        //Given
        Shape circle = new Circle(3.0);
        //When
        String actual = circle.getShapeName();
        //Then
        Assert.assertEquals("Circle", actual);
    }
}
