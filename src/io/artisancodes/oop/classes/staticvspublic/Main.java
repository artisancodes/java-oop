package io.artisancodes.oop.classes.staticvspublic;
public class Main {
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        // Call the static method
        myStaticMethod();
        // myPublicMethod(); This would compile an error

        // Create an object of Main
        Main obj = new Main();
        // Call the public method on the object
        obj.myPublicMethod();
    }
}
