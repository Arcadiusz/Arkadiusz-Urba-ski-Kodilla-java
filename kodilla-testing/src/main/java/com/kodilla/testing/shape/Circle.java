package com.kodilla.testing.shape;

public class Circle implements Shape {
    private double r;

    public Circle ( double r ){
        this.r = r;
    }

    public String getShapeName(){
        return "Circle";
    }

    public double getField(){
        return 3.14 * r * r;
    }
}
