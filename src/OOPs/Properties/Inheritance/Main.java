package OOPs.Properties.Inheritance;

class Employee {
    String name;
    int empId;
    double salary;

    void login(){
        System.out.println(name + " logged In");
    }
    void logout(){
        System.out.println(name + " logged Out");
    }

    void displayDetails(){
        System.out.println("ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
class Developer extends Employee {
    void writeCode(){
        System.out.println(name + " is writing code");
    }
}
class Manager extends Employee {

    void conductMeeting() {
        System.out.println(name + " is conducting a meeting");
    }
}

public class Main {
    public static void main(String[] args){
        Developer dev = new Developer();

        dev.name = "Michal";
        dev.empId = 10;
        dev.salary = 260000;

        dev.login();
        System.out.println("Details about: " + dev.name);
        dev.displayDetails();

        Manager man = new Manager();

        man.name = "Roy";
        man.empId = 12;
        man.salary = 180000;

        man.login();
        System.out.println("Details about: " + man.name);
        man.conductMeeting();

        dev.logout();
        man.logout();
    }
}