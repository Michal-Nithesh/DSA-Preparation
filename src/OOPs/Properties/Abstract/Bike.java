package OOPs.Properties.Abstract;

public class Bike extends Vehicle{

    @Override
    void start(){
        System.out.println("Bike starts");
    }

    @Override
    void method(){
        System.out.println("A concrete child class must implement all inherited abstract methods");
    }
}
