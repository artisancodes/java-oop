package io.artisancodes.oop.classes.inheritance;

import java.sql.SQLOutput;

public class Car extends Vehicle {
    private String modelName = "Class C";

    public static void main(String[] args) {
        // Create a car object
        Car car = new Car();

        // Call the honk() method (from the Vehicle class) on the car object
        car.honk();

        // Display the value of the brand attribute (from the Vehicle class)
        // and the value of the modelName from the Car class.
        System.out.println(car.brand + " " + car.modelName);
    }
}
