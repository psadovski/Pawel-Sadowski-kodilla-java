package com.kodilla.testing;

import com.kodilla.testing.shape.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestingMain {
    public static void main(String[] args){

        Shape circle = new Circle(5);
        ShapeCollector shapeCollector = new ShapeCollector(circle);
        shapeCollector.showFigures();
        shapeCollector.countField();

        Shape square = new Square(4.5);
        ShapeCollector shapeCollector1 = new ShapeCollector(square);
        shapeCollector1.showFigures();
        shapeCollector1.countField();

        Shape triangle = new Triangle(2.0, 4.5);
        ShapeCollector shapeCollector2 = new ShapeCollector(triangle);
        shapeCollector2.showFigures();

        List<String> strings = Arrays.asList(circle.getShapeName(),triangle.getShapeName(), square.getShapeName());
        System.out.println(strings);
    }
}