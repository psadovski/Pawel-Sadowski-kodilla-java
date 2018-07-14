package com.kodilla.testing.shape;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> figures = new ArrayList<>();

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
        for(Shape figure : figures) {
            System.out.println(figure.toString());
        }
    }

    public double countField(Shape shape) {
        return BigDecimal.valueOf(shape.getField()).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
