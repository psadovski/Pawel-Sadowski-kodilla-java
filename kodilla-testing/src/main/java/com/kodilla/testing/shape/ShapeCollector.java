package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private Shape shape;
    private List<Shape> figures = new ArrayList<>();

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure(Shape shape){
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (figures.contains(shape)){
            figures.remove(shape);
            result = true;
        }
        return result;
    }

    public int getFiguresQuantity(){
        return figures.size();
    }

    public Shape getFigure(int figureNumber) {
        Shape figure = null;
        if(figureNumber >= 0 && figureNumber < figures.size()) {
            figure = figures.get(figureNumber);
        }
        return figure;
    }

    public void showFigures() {
        System.out.println(this.shape.getShapeName());
    }
}
