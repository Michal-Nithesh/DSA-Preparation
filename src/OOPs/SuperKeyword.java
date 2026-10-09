package OOPs;

//  Remember:

//  super() — calls the parent constructor.
//  super.sound() — calls the parent method.
//  super.number — accesses the parent variable.

public class SuperKeyword {
    public static void main(String[] args) {
        Child obj = new Child();

        System.out.println("Methods: ");
        obj.display();
    }
}
class Parent {
    // Variable
    int number = 10;

    // Parent constructor
    Parent() {
        System.out.println("Parent constructor");
    }

    // Parent method
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Child extends Parent {
    int number = 20;

    // Child constructor
    Child() {
        super(); // Calls parent constructor
        System.out.println("Child constructor");
    }

    // Overriding parent method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void display() {
        // Calling parent and child methods
        super.sound();
        sound();

        // Accessing parent and child variables
        System.out.println("Parent number: " + super.number);
        System.out.println("Child number: " + this.number);
    }
}