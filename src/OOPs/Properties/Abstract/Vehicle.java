package OOPs.Properties.Abstract;

//  Parent class
public abstract  class Vehicle {

    //  An abstract class can have constructors
    Vehicle() {
        System.out.println("Vehicle constructor");
    }

    //  An abstract class can have abstract and concrete methods

    // Valid => No body
    abstract void start(); // Abstract method

    // Invalid => Has a body
    // abstract void stop() { }

    void stop(){    // Concrete method
        System.out.println("Vehicle is Stopped");
    }

    abstract void method();
    // If a class contains an abstract method, the class must be abstract
}
//  abstract class Vehicle — you cannot create a Vehicle object directly.
//  abstract void start(); — declares behavior without implementing it.
//  void stop() — provides a common implementation that subclasses can inherit.


//  An abstract class can have variables
abstract class Employee {
    String name;
    static int employeeCount;
    final int id = 101;

    //  An abstract class can have static and final methods
    static void category() {
        System.out.println("Employee");
    }

    final void Entry() {
        System.out.println("Welcome");
    }
}

//  An abstract class can extend another abstract class
abstract class ElectricVehicle extends Vehicle {
    abstract void charge();
}

class ElectricCar extends ElectricVehicle {
    @Override
    void start() {
        System.out.println("Starting electric car");
    }

    @Override
    void method() {
        System.out.println("A concrete child class must implement all inherited abstract methods");
    }

    @Override
    void charge() {
        System.out.println("Charging battery");
    }
}

//  An abstract class cannot be declared final
//  // abstract final class Vehicle { } // ❌ Invalid

//  An abstract method cannot be private, static, or final
//  abstract private void start();  ❌
//  abstract static void start();   ❌
//  abstract final void start();    ❌