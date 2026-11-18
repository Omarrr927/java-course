// Upcasting, downcasting, and how to prevent ClassCastException with 'instanceof'.

class Vehicle { }

class Car extends Vehicle {
    public void openTrunk() {
        System.out.println("Trunk opened.");
    }
}

class Bike extends Vehicle { }

public class CastingDemo {
    public static void main(String[] args) {
        // UPCASTING (implicit): subclass -> superclass reference. Always safe.
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        System.out.println("Upcasting successful.");

        // DOWNCASTING (explicit): superclass reference -> subclass. DANGEROUS without a check!
        // THE BUG: v2 is actually a Bike, but we are forcing it to be a Car.
        // If you uncomment the two lines below, the program CRASHES with a ClassCastException.
        // Car myCar = (Car) v2;
        // myCar.openTrunk();

        // THE FIX: always use 'instanceof' to check the type BEFORE downcasting.
        System.out.println("\nChecking types safely...");

        if (v1 instanceof Car) {
            // Safe to cast because v1 really is a Car.
            Car c1 = (Car) v1;
            c1.openTrunk();
        }

        if (v2 instanceof Car) {
            // This block will NOT execute because v2 is a Bike, not a Car.
            System.out.println("This will not print.");
        } else {
            System.out.println("v2 is not a Car, it is a Bike. Downcasting prevented!");
        }
    }
}
