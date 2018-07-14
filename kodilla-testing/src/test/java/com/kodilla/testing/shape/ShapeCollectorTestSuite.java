package com.kodilla.testing.shape;

import org.junit.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.PI;

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
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(1, shapeCollector.getFiguresQuantity());
    }

    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        Shape circle = new Circle(4.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        boolean actual = shapeCollector.removeFigure(circle);
        //Then
        Assert.assertFalse(actual);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Shape circle = new Circle(5.0);
        ShapeCollector shapeCollector = new ShapeCollector();
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
        ShapeCollector shapeCollector = new ShapeCollector();
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
        Shape triangle = new Triangle(2.0, 4.5);
        Shape square = new Square(4.5);
        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        //When
        shapeCollector.showFigures();

    }

    @Test
    public void testCountField() {
        //Given
        Shape circle = new Circle(5.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        double actual = shapeCollector.countField(circle);
        double expected =78.54;
        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }
}
