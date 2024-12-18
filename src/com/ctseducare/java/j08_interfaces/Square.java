package com.ctseducare.java.j08_interfaces;

public class Square implements Polygon {
    
    private Double side;

    public Square(Double side) {
        this.side = side;
    }

    @Override
    public Double getArea() {
        return side * side;
    }
    
}