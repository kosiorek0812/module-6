package com.kodilla.testing.shapes;

import java.awt.*;
import java.util.Objects;

public class Triangle implements Shape {
    private double h;
    private double a;
    private String name;

    public Triangle(double h, double a, String name) {
        this.h = h;
        this.a = a;
        this.name = name;
    }
    public double getField() {
        return (a * h) / 2;
    }
    public String getShapeName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(h, triangle.h) == 0 && Double.compare(a, triangle.a) == 0 && Objects.equals(name, triangle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(h, a, name);
    }
}
