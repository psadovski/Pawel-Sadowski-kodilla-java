package com.kodilla.testing;

import com.kodilla.testing.shape.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestingMain {
    public static void main(String[] args){

        Shape circle = new Circle(5);
        Shape square = new Square(4.5);
        Shape triangle = new Triangle(2.0, 4.5);
        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        shapeCollector.showFigures();
        shapeCollector.countField(circle);

        List<String> strings = Arrays.asList(circle.getShapeName(),triangle.getShapeName(), square.getShapeName());
        System.out.println(strings);
    }
}