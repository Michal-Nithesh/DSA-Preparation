package OOPs;

public class FirstConcept {
    public static void main(String[] args){
        topicClass();
        topicMethdo();
        topicConstructor();
    }

    public static void topicClass(){
        // What is OOP's
        // Suppose we want to create a program for students.
        // 1. Without OOP's
        String name = "Michal";
        int age = 21;
        int marks = 85;

//        Now imagine 100 students.
//        We would have lots of separate variables:
//        String name1;
//        int age1;
//        int marks1;
//        String name2;
//        int age2;
//        int marks2;
//
//        String name3;
//        int age3;
//        int marks3;
//        That's messy.


//        OOP lets us create a Student type. (like Custom Datatype)
        class Student{
            String name;
            int age;
            int mark;
        }
        // Now I can create a Students and give them a data
        Student s1 = new Student();  // Object => 1
        Student s2 = new Student();  // Object => 2
        s1.name = "Roy";
        s1.age = 21;
        s1.mark = 91;
        s2.name = "Joel";
        s2.age = 21;
        s2.mark = 78;
        System.out.println("Object 1: " + s1);
        System.out.println("Object 2: " + s2);
    }
    public static void topicMethdo(){
        class Car{
            String brand;
            int speed;

            void display(){
                System.out.println("Car is driving");
            }
        }
    }
    public static void topicConstructor(){
        // A constructor is a special part of a class used to initialize an object when it is created.
        class Student {
            String name;
            int age;
            int mark;

            // Default / no-argument constructor
            Student() {
                System.out.println("Hey, It's me Default Constructor");
            }

            // Parameterized constructor
            Student(String name, int age, int mark) {
                this.name = name;
                this.age = age;
                this.mark = mark;
            }
        }

//            Why do we need constructors?
//            Without a constructor:
//            Student s1 = new Student();

//            s1.name = "Michal";
//            s1.age = 21;
//            s1.marks = 85;

//            We need to initialize each field separately.
//            With a constructor:
            Student s1 = new Student("Michal", 21, 85);

//            this keyword
//            this.name = name;
//              ↑          ↑
//            field    parameter
//            Constructor Rules:
//                1. Has the same name as the class
//                2. Has no return type eg:
//                      Student() {       => Valid
//                      }
//                      void Student() {  => Not Valid
//                      }
//                3. Runs automatically when using new

            // Default constructor (without parameter value)
        // Using default constructor
        Student s2 = new Student();

        // Using parameterized constructor
        Student s3 = new Student("Michal", 21, 85);

        System.out.println(s1);
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.mark);
        System.out.println(s3);
    }
}
