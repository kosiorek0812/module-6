package com.kodilla.spring2.calculator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Calculator {


    @Autowired
    private Display display;


    public double add(double a, double b) {
        display.displayValue(a + b);
        return a + b;
    }
    public double subtract(double a, double b) {
        display.displayValue(a - b);
        return a - b;
    }
    public double multiply(double a, double b) {
        display.displayValue(a * b);
        return a * b;
    }
    public double divide(double a, double b) {
        display.displayValue(a / b);
        return a / b;
    }

}
