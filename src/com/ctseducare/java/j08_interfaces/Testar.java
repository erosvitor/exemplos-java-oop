package com.ctseducare.java.j08_interfaces;

import java.util.ArrayList;

public class Testar {

    public static void main(String[] args) {

        var s1 = new Square(4.0);
        var r1 = new Rectangle(5.0, 7.0);

        //List<Polygon> polygons = new ArrayList<>();
        var polygons = new ArrayList<Polygon>();
        polygons.add(s1);
        polygons.add(r1);

        for (Polygon polygon : polygons) {
            System.out.println(polygon.getArea());
        }
        
    }

}
