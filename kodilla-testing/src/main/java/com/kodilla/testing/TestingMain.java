package com.kodilla.testing;

import com.kodilla.testing.shape.*;

public class TestingMain {
    public static void main(String[] args){

        Shape circle = new Circle(5);
        ShapeCollector shapeCollector = new ShapeCollector(circle);
        shapeCollector.showFigures();

        Shape square = new Square(4.5);
        ShapeCollector shapeCollector1 = new ShapeCollector(square);
        shapeCollector1.showFigures();

        Shape triangle = new Triangle(2.0, 4.5);
        ShapeCollector shapeCollector2 = new ShapeCollector(triangle);
        shapeCollector2.showFigures();
    }
}