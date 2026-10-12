package OOPs.Properties.Abstract;

public class Main {
    public static void main(String[] args) {

//        Vehicle v = new Vehicle(); // Compilation error

        Vehicle vehicle = new Car(); // Valid
        vehicle.start();
        vehicle.stop();

        vehicle = new Bike();
        vehicle.start();
        vehicle.stop();
    }
}
