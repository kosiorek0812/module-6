package com.kodilla.spring2.calculator;

import org.springframework.stereotype.Service;

@Service
public final class Display {


    public void displayValue(double val) {
        System.out.println(val);

    }
}
