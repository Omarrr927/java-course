// This program demonstrates Abstract Classes.
// An abstract class cannot be instantiated (you cannot do 'new Shape()').
// It acts as a strict contract for subclasses.

// Abstract Superclass
abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // Abstract method: has no body. Any concrete subclass MUST implement it.
    public abstract double calculateArea();

    // Concrete method: has a body. Inherited by subclasses.
    public void displayName() {
        System.out.println("Shape: " + name);
    }
}

// Concrete Subclass 1
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");   // call the abstract parent constructor
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete Subclass 2
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        // Shape s = new Shape("Test");   // ERROR! Cannot instantiate an abstract class.

        // Polymorphism again: the abstract class is used as a reference type.
        Shape myCircle = new Circle(5.0);
        Shape myRect = new Rectangle(4.0, 6.0);

        myCircle.displayName();
        System.out.println("Area: " + myCircle.calculateArea());
        System.out.println();

        myRect.displayName();
        System.out.println("Area: " + myRect.calculateArea());
    }
}
