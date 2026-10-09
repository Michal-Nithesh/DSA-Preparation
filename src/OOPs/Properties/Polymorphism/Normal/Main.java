package OOPs.Properties.Polymorphism.Normal;

public class Main {
    static void main(String[] args) {
        Shapes shape = new Shapes();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();

        shape.area();
    }
}
