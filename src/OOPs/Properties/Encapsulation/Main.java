package OOPs.Properties.Encapsulation;

// Encapsulation is also defined as bundling of data members and methods

public class Main {
    public static void main(String[] args){
        Programmer Pro = new Programmer();
        Pro.setName("Michal");
        System.out.println("Programmer Name: " + Pro.getName());
        BankAccountExp acc = new BankAccountExp();
        acc.setBalance(100);
        System.out.println("Balance: " + acc.getBalance());
    }
}
// Encapsulation → Getters & Setters
class Programmer {
    private String name;
    // Getter method used to get the data
    public String getName() {
        return name;
    }

    // Setter method is used to set or modify the data
    public void setName(String name) {
        this.name = name;
    }
}

class BankAccountExp {
    private double balance;
    // Getter => Used to read a private field:
    public double getBalance(){
        return balance;
    }
    // get → get/read the value

    // Setter => Used to change a private field:
    public void setBalance(double balance){
        if(balance >= 0) {
            this.balance = balance;
        }
    }
    // set → set/change the value
}