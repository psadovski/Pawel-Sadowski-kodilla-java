package com.kodilla.testing.shape;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    Shape shape;
    List<Shape> figures = new ArrayList<>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure(Shape shape){
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape) {

        if (figures.size() > 0) {
            figures.remove(shape);
            return true;
        }

        return false;
    }

    public int getFiguresQuantity(){
        return figures.size();
    }

    public Shape getFigure(int figureNumber) {
        Shape figure = null;
        if (figureNumber >= 0 && figureNumber < figures.size()) {
            figure = figures.get(figureNumber);
        }
        return figure;
    }

    public void showFigures() {
        System.out.println(this.shape.getShapeName());
    }

    public void countField() {
        System.out.println(BigDecimal.valueOf(this.shape.getField()).setScale(2, RoundingMode.HALF_UP).doubleValue());
    }
}
