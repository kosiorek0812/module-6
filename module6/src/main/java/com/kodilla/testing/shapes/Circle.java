package com.kodilla.testing.shapes;

import java.util.Objects;

public class Circle implements Shape {
    private double radius;
    private String name;

    public Circle(double radius, String name) {
        this.radius = radius;
        this.name = name;
    }
    public double getField() {
        return radius * radius * 3.14159;
    }
    public String getShapeName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0 && Objects.equals(name, circle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, name);
    }
}
