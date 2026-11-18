// Difference between an Abstract Class and an Interface.

// ABSTRACT CLASS: an "IS-A" relationship with shared code (state/behaviour).
abstract class Animal {
    // Abstract classes can have fields (state).
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Concrete method: shared by all animals.
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Abstract method: must be implemented by subclasses.
    public abstract void makeSound();
}

// INTERFACE: a "CAN-DO" capability. A contract with NO instance state.
interface Flyable {
    // Interfaces can only have constants (public static final).
    int MAX_ALTITUDE = 10000;

    // Abstract method: must be implemented by any class that implements this interface.
    void fly();
}

// A Bird IS-AN Animal, and it CAN-DO Fly.
// 'extends' for the class, 'implements' for the interface.
class Bird extends Animal implements Flyable {
    public Bird(String name) {
        super(name);   // call the abstract class constructor
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet! Tweet!");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying up to " + MAX_ALTITUDE + " feet.");
    }
}

public class InterfaceVsAbstract {
    public static void main(String[] args) {
        Bird myBird = new Bird("Tweety");

        // Methods from Animal (abstract class)
        myBird.sleep();
        myBird.makeSound();

        // Method from Flyable (interface)
        myBird.fly();
    }
}
