package com.kodilla.testing.shapes;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapes;

    public ShapeCollector() {
        this.shapes = new ArrayList<Shape>();
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public int getCollectorQuantity() {
        return shapes.size();

    }
    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public Shape getFigure(int n) {
        return shapes.get(n); }

    public String showFigures() {
        String figures = "";
        for (Shape shape : shapes) {
            figures += shape.getShapeName();
        }
        return figures;


    }
}
