package com.oop_pub.exceptions.ex2_3;

import org.w3c.dom.ls.LSOutput;

import java.util.Collection;

public class ImplementareCalculator implements Calculator {
    double value;
    @Override
    public Double add(Double nr1, Double nr2) {
        if( nr1 == null || nr2 == null ) {
            throw new NullParameterException();
        }
        if (nr1 + nr2 == Double.POSITIVE_INFINITY) {
            throw new OverflowException();
        }
        if (nr1 + nr2 == Double.NEGATIVE_INFINITY) {
            throw new UnderflowException();
        }
        return nr1 + nr2;
    }

    @Override
    public Double divide(Double nr1, Double nr2) {
        if( nr1 == null || nr2 == null ) {
            throw new NullParameterException();
        }
        if( nr1/nr2 ==  Double.POSITIVE_INFINITY ){

            throw new OverflowException();
        }
        if (nr1/nr2 == Double.NEGATIVE_INFINITY ){
            throw  new UnderflowException();
        }
        //System.out.println(nr1 + " " + nr2 );
        return nr1/nr2;
    }

    @Override
    public Double average(Collection<Double> numbers) {
        if (numbers == null ) {
            throw new NullParameterException();
        }
        double sum = 0;
        double i = 0;
        for(Double d : numbers) {
            sum=add(sum, d);
            i=add(i, 1d);
        }
        return divide(sum, i);
    }
}
