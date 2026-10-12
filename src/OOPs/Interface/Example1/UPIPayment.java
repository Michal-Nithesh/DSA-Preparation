package OOPs.Interface.Example1;

public class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
    @Override
    public void checkBalance(){
        System.out.println("UPI balance: ₹5000");
    }
}
