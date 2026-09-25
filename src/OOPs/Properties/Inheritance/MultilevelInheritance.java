package OOPs.Properties.Inheritance;

//    2. Multilevel Inheritance — University 🎓
//    Create:
//      Person
//        ↓
//      Student
//        ↓
//    CollegeStudent

//    Person
//    Fields: name, age
//            Constructor
//    Method displayPerson()

//    Student
//    Field: rollNumber
//    Constructor using super()
//    Method displayStudent() using super.displayPerson()

//    CollegeStudent
//    Field: department
//    Constructor using super()
//    Method displayCollegeStudent() using super.displayStudent()

//    Expected:
//    Name: Michal
//    Age: 21
//    Roll Number: 10
//    Department: Computer Science

class Person {  // Grand Parent Class
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void displayPerson(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {  // Parent Class
    int rollNo;

    Student(String name, int age, int rollNo){
        super(name, age);
        this.rollNo = rollNo;
    }

    void displayStudent(){
        super.displayPerson();
        System.out.println("Roll Number: " + rollNo);
    }
}

class CollegeStudent extends Student {  // Children Class
    String department;

    CollegeStudent(String name, int age, int rollNo, String department){
        super(name, age, rollNo);
        this.department = department;
    }

    void displayCollegeStudent(){
        super.displayStudent();
        System.out.println("Department: " + department);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args){
        CollegeStudent clgStud = new CollegeStudent("Michal", 21, 10, "Computer Science");
        clgStud.displayCollegeStudent();
    }
}
