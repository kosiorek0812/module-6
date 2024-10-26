package com.kodilla.testing.shapes;

import java.util.Objects;

public class Square implements Shape {
    private double side;
    private String name;

    public Square(double side, String name) {
        this.side = side;
        this.name = name;
    }
    public double getField() {
        return side * side;
    }
    public String getShapeName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(side, square.side) == 0 && Objects.equals(name, square.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(side, name);
    }
}
