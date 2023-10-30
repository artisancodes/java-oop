package io.artisancodes.oop.classes.interfaces.ex03;

public class Reactable implements Shape {

    private double width;
    private double height;

    public Reactable(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }
}
