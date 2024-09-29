package com.task4.java;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0, "blue");
        Cylinder cylinder = new Cylinder(circle, 5.0);

        System.out.println(cylinder.toString());
        System.out.println("Volume: " + cylinder.getVolume());

        Cylinder defaultCylinder = new Cylinder();
        System.out.println(defaultCylinder.toString());
        System.out.println("Volume: " + defaultCylinder.getVolume());
    }
}