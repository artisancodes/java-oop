package io.artisancodes.oop.classes.interfaces.ex03;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(10);
        shape.draw();
        System.out.println("Area = " + shape.getArea());

        shape = new Reactable(10, 10);
        shape.draw();
        System.out.println("Area = " + shape.getArea());
    }
}
