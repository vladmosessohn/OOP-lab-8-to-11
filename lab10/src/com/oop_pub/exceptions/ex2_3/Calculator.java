package com.oop_pub.exceptions.ex2_3;

import org.w3c.dom.ls.LSOutput;

import java.util.Collection;

public interface Calculator {
    class NullParameterException extends RuntimeException {
        NullParameterException(){
            System.out.println("NullParameterException");
        }
    }

    class UnderflowException extends RuntimeException {
        UnderflowException(){
            System.out.println("UnderflowException");
        }
    }

    class OverflowException extends RuntimeException {
        OverflowException(){
            System.out.println("OverflowException");
        }
    }

    Double add(Double nr1, Double nr2);

    Double divide(Double nr1, Double nr2);

    Double average(Collection<Double> numbers);
}
