package com.oop_pub.exceptions.ex2_3;

import java.util.ArrayList;
import java.util.List;

public class MainEx2 {
    public static void main(String[] args) {
        // TODO: Initialize the calculator
        Calculator calculator = null;
        calculator = new ImplementareCalculator();
        System.out.println(calculator.add(null, 3d));
        System.out.println(calculator.divide(9d, 0d));
        System.out.println(calculator.average(List.of(1d, 2d, 3d, 4d)));
        // TODO: Test edge cases that would throw exceptions
    }
}
