package io.artisancodes.oop.classes.constructors;

public class Main {

    // Create a class attribute
    int x;

    // Create a class constructor for the Main class
    public Main() {
        // Set the initial value for the class attribute x
        x = 5;
    }

    public Main(int y) {
        // Set x to y, when the constructor is called.
        x = y;
    }

    public static void main(String[] args) {
        // Create an object of class Main (This will call the constructor)
        Main obj = new Main();

        // Print the value of x
        System.out.println(obj.x);

        // Create an object of class Main that takes one parameter.
        Main obj2 = new Main(10);

        // Print the value x = 10;
        System.out.println(obj2.x);
    }
}
