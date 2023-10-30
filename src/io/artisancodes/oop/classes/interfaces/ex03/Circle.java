package io.artisancodes.oop.classes.interfaces.ex03;

public class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle!");
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getRadius() {
        return radius;
    }
}
