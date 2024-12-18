package com.ctseducare.java.j08_interfaces;

public class Rectangle implements Polygon {

    private Double length;
    private Double breadth;

    Rectangle(Double length, Double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public Double getArea() {
        return length * breadth;
    }

}