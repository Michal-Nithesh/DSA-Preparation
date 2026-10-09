package OOPs.Properties.Polymorphism.RunTime;

//  Runtime polymorphism
//  Method Overriding

//  The overridden method implementation is selected at runtime based on the actual object.

public class Main {
    static void main(String[] args) {
        Payment payment;
        payment = new UPIPayment();
        payment.pay();

        payment = new CardPayment();
        payment.pay();

        payment = new NetBankingPayment();
        payment.pay();
    }
}

//  Runtime Polymorphism — Payment System
//  Imagine you're building an application that supports UPI, credit cards, and net banking.
//  The customer clicks Pay. The application should execute the correct payment method depending on which payment object is being used.

//  1. Class structure

//  Payment => pay()

//UPI           Card            Net Banking
//pay()         pay()           pay()

//All three classes have the same method, pay(), but each implements it differently.

class Payment {
    void pay(){
        System.out.println("Processing payment");
    }
}
class UPIPayment extends Payment {
    @Override
    void pay(){
        System.out.println("Processing UPI payment");
    }
}
class CardPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Processing card payment");
    }
}
class NetBankingPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Processing net banking payment");
    }
}