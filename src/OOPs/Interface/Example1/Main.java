package OOPs.Interface.Example1;

public class Main {
    public static void main(String[] args) {

        Payment p1 = new UPIPayment();
        p1.pay(500);

        Payment p2 = new CardPayment();
        p2.pay(1000);
        p2.checkBalance();
    }
}
