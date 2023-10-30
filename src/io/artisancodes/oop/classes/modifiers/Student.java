package io.artisancodes.oop.classes.modifiers;

class Person {
    protected String firstName = "John";
    protected String lastName = "Doe";
    protected String email = "john@doe.com";
}

public class Student extends Person {
    private int graduationYear = 2018;

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Name: " + student.firstName + " " + student.lastName);
        System.out.println("Email: " + student.email);
        System.out.println("Graduation Year: " + student.graduationYear);
    }
}