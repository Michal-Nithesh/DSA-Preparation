package OOPs.Properties.Abstract;

public class Car extends Vehicle {

    Car() {
        System.out.println("Car constructor");
    }

    @Override
    void start() {
        System.out.println("Car starts");
    }

    @Override
    void method(){
        System.out.println("A concrete child class must implement all inherited abstract methods");
    }
}
