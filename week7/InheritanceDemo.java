// Basics of inheritance using 'extends'.
class Animal {
    protected String name;   // accessible in this class and subclasses

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Dog inherits everything from Animal.
class Dog extends Animal {
    public Dog(String name) {
        super(name);   // call the Animal constructor (must be the first line)
    }

    public void bark() {   // unique to Dog
        System.out.println(name + " is barking: Woof! Woof!");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.eat();     // inherited
        myDog.sleep();   // inherited
        myDog.bark();    // Dog only
    }
}
