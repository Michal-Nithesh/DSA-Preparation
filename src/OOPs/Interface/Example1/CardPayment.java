package OOPs.Interface.Example1;

public class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
    @Override
    public void checkBalance(){
        System.out.println("Card balance: ₹10000");
    }
}
