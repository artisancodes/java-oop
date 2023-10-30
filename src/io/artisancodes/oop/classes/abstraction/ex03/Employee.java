package io.artisancodes.oop.classes.abstraction.ex03;

public class Employee extends Person {

    private final int employeeId;

    public Employee(String name, String gender, int employeeId) {
        super(name, gender);
        this.employeeId = employeeId;
    }

    @Override
    public void work() {
        if (employeeId == 0) {
            System.out.println("Not working");
        } else {
            System.out.println("Working as employee!");
        }
    }

    public static void main(String[] args) {
        // Coding in terms of abstract classes
        Person student = new Employee("Dove", "Female", 0);
        Person employee = new Employee("Panka", "Male", 1);

        student.work();
        employee.work();

        // Using method implemented in Abstract class - inheritance
        employee.setName("Pankj Kumar");
        System.out.println(employee);
    }
}
