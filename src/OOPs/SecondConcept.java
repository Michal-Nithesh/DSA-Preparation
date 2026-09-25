package OOPs;

public class SecondConcept {
    public static void main(String[] args) {
//        staticConcept();
//        withAndWithoutStatic();
        important();
    }

    public static void staticConcept() {
//      Static means something belongs to the class/type or has a fixed/shared lifetime, rather than belonging to each individual object.
        // Example:
//        class Student{
//            String name;
//            int rollNo;
//        }
        // Now the name & rollNo belongs to an individual ObJ
//        Student s1 = new Student();
//        s1.name = "Michal";
//        s1.rollNo = 10;

        // Every student belongs to the same college:
//        Static variable
//        A variable declared with static is called a static variable or class variable in Java.
        class Student {
            String name;
            int rollNo;
            static String college = "Stella Mary's College of Engineering"; // Here the static can be useful.
        }

        // You can access it directly:
        System.out.println(Student.college);

        // Example:
        class Count {
            static int count = 0;

            Count() {
                count++;
            }
        }
        Count c1 = new Count();
        Count c2 = new Count();
        Count c3 = new Count();

        System.out.println(Count.count);

        // Static Method
        class Addition {
            static int add(int a, int b) {
                return a + b;
            }
        }
        System.out.println(Addition.add(10, 20));

        // Without Static Method
        class Subtract {
            int sub(int a, int b) {
                return a + b;
            }
        }
//        System.out.println(Subtract.sub(a, b); // Can't, I want to create a OBJ
        Subtract s = new Subtract();
        int result = s.sub(10, 20);
        System.out.println(result);
    }

    public static void withAndWithoutStatic() {
        // Why main method wants to be Static, cuz without creating an object it wants to execute

//       1. Static method cannot directly access non-static variables
        class Student {
            String name; // Non - Static variable

            static void display() {
//                System.out.println(name); // This produces an error.
            }
        }
//        Why ?
//        Because name belongs to an object, but display() belongs to the class.
//        Imagine:

//        Student
//                |
//                +--- name → which student's name?
//                |
//                +--- display()
//        Java doesn't know which object's name you mean.
//        There could be:
//        Student 1 → Rahul
//        Student 2 → Priya
//        Student 3 → Amit
//        Which one should display() use?
//                That's why this doesn't work directly.

//        2. Static method can access static variables
        class Steps {
            static int count = 0;

            static void displayCount() {
                System.out.println(Steps.count);
            }
        }
        Steps.displayCount();

//    3. But a static method CAN access an object if you give it one
        class Employee {
            String name;

            static void displayName(Employee emp) {
                System.out.println(emp.name);
            }
        }
        Employee emp = new Employee();
        emp.name = "Michal";
        Employee.displayName(emp);

//        Static block
        class Database {
            static String url;

            static {
                url = "jdbc:mysql://localhost:3306/test";
            }
        }

//  Static doesn't always mean "constant"
//  This is a very common beginner mistake.

//  These are different:
//  static int count;
//  and:
//  static final int MAX = 100;

//  static means class-level/shared.
//  final means the variable cannot be reassigned after initialization.
//  Together:
//      static final int MAX = 100;
//  means a class-level constant.

//For example:
//Math.PI  =>  is a famous example of a class-level constant.

    }

    public static void important(){
        // Change a static variable
        class Community {
            static String name = "Belmonts";
        }
        Community com1 = new Community();
        Community com2 = new Community();
        System.out.println("Before change the Static variable: " + com1.name);
        System.out.println("Before change the Static variable: " + com2.name);

        Community.name = "Byte-Bash-Blitz";

        System.out.println("After change the Static variable: " + com1.name);
        System.out.println("After change the Static variable: " + com2.name);

//        But prefer:
        System.out.println("Class level call: " + Community.name);
//        because it makes the class-level nature clear.
    }
}

