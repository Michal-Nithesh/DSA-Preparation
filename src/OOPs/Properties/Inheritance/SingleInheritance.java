package OOPs.Properties.Inheritance;


//    1. Single Inheritance — Vehicle 🚗
//    Create:  Vehicle
//                ↓
//            ElectricCar

//    Vehicle
//    Fields: brand, speed
//    Constructor to initialize them
//    Method displayVehicle()

//    ElectricCar
//    Field: batteryCapacity
//    Constructor should use super() to initialize brand and speed
//    Method displayElectricCar() should use super.displayVehicle()

//    Expected:
//      Brand: Tesla
//      Speed: 200 km/h
//      Battery: 75 kWh

class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    void displayVehicle(){
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + "km/h");
    }
}

class ElectricCar extends Vehicle {
    int batteryCapacity;

    ElectricCar(String brand, int speed, int batteryCapacity){
        super(brand,speed);
        this.batteryCapacity = batteryCapacity;
    }

    void displayElectricCar(){
        super.displayVehicle();
        System.out.println("Battery: " + batteryCapacity + "kWh");
    }
}

public class SingleInheritance {
    public static void main(String[] args){
        System.out.println("Vehicle Information: ");
        ElectricCar tesla = new ElectricCar("Tesla", 200, 75);
        tesla.displayElectricCar();
    }
}
