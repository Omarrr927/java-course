// Demonstrates the 'this' keyword and constructor chaining.
public class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    // Master constructor: takes everything
    public Employee(int id, String name, double salary, String department) {
        this.id = id;           // 'this' separates the field from the parameter
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // Chains to the master constructor with a default department
    public Employee(int id, String name, double salary) {
        this(id, name, salary, "Unassigned");   // must be the first line
    }

    // Chains to the previous constructor with a default salary
    public Employee(int id, String name) {
        this(id, name, 25000.0);
    }

    public void giveRaise(double amount) {
        if (amount > 0) {
            this.salary += amount;
            System.out.println(name + " received a raise. New salary: " + this.salary);
        }
    }

    public void displayInfo() {
        System.out.println("ID: " + id + " | Name: " + name +
                " | Salary: " + salary + " | Dept: " + department);
    }
}
