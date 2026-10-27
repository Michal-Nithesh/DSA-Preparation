
package OOPs.Generics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaFunctions {

    public static void main(String[] args) {

        // Runnable without lambda
        r.run();

        // Runnable with lambda
        r1.run();

        // Lambda with parameters
        System.out.println(c.add(10, 20));

        // Lambda with multiple statements
        System.out.println(cal.add(20, 20));

        // Lambda with collections
        names.forEach(name -> System.out.println(name));

        // Custom Operation functional interface
        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a - b;

        System.out.println("Sum: " + sum.operation(10, 25));
        System.out.println("Product: " + prod.operation(10, 25));
        System.out.println("Subtraction: " + sub.operation(10, 25));

        // Consumer functional interface
        fun.accept(10);

        // Using a custom operation method
        LambdaFunctions myCal = new LambdaFunctions();

        System.out.println("Using operate(): "
                + myCal.operate(10, 20, sum));
    }

    // Method must be declared outside main()
    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }

    static Runnable r = new Runnable() {
        @Override
        public void run() {
            System.out.println("Without Lambda");
        }
    };

    // Runnable using lambda
    static Runnable r1 =
            () -> System.out.println("With Lambda");

    interface Calculator {
        int add(int a, int b);
    }

    static Calculator c = (a, b) -> a + b;

    static Calculator cal = (a, b) -> {
        int result = a + b;
        return result;
    };

    static List<String> names =
            Arrays.asList("Michal", "Roy", "Max");

    // Consumer: accepts a parameter and returns nothing
    static Consumer<Integer> fun =
            item -> System.out.println(item * 2);
}

interface Operation {
    int operation(int a, int b);
}
