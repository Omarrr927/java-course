// This program demonstrates Polymorphism ("Many Forms").
// It shows how a superclass reference can point to a subclass object.

// Superclass
class Animal {
    public void makeSound() {
        // Default sound for a generic animal.
        System.out.println("Some generic animal sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Subclass 3
class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo!");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // An array of type Animal can hold Dogs, Cats, and Cows.
        Animal[] myAnimals = new Animal[3];

        // Upcasting: assigning a subclass object to a superclass reference.
        myAnimals[0] = new Dog();   // A Dog IS-AN Animal.
        myAnimals[1] = new Cat();   // A Cat IS-AN Animal.
        myAnimals[2] = new Cow();   // A Cow IS-AN Animal.

        System.out.println("=== ANIMAL SOUNDS ===");

        for (int i = 0; i < myAnimals.length; i++) {
            // Polymorphism in action: the JVM looks at the ACTUAL object type
            // (Dog, Cat, Cow) at runtime, not the reference type (Animal).
            myAnimals[i].makeSound();
        }
    }
}
