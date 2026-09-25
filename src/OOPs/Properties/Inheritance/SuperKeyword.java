package OOPs.Properties.Inheritance;

//super Keyword
//If this means:  =>   current object
//then super means: =>   parent-class part of the current object


//  1. Single Inheritance
//  Scenario: E-commerce
//  Create:
//      Product
//        ↓
//      Laptop

//  Parent Product:
//  Fields: name, price
//  Constructor to initialize both
//  Method displayProduct()

//  Child Laptop:
//  Field: ram
//  Constructor should use super() to initialize name and price
//  Method displayLaptop() should use super.displayProduct() and then display RAM.

//  Expected output:
//      Product: Dell Laptop
//      Price: 75000
//      RAM: 16 GB


class Product {
    String name;
    double price;

    Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Product: " + name);
        System.out.println("Price: ₹" + price);
    }
}

class Laptop extends Product {
    int ram;
    String processor;

    Laptop(String name, double price, int ram, String processor){

        super(name, price); // This calls the parent constructor

        this.ram = ram;
        this.processor = processor;
    }

    void displayLaptopDetails(){

        super.displayDetails(); // Run the displayDetails() method from the parent Product class.

        System.out.println("RAM: " + ram + " GB");
        System.out.println("Processor: " + processor);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {

        Laptop laptop = new Laptop("ThinkPad", 75000, 16, "Intel i7");

        laptop.displayLaptopDetails();
    }
}

//      The 3 things you should remember:
//        super();              // parent constructor
//        super.method();       // parent method
//        super.variable;       // parent field
