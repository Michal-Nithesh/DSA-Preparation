package OOPs.Properties.Inheritance;

//    Scenario: Payment System
//    Create:
//             Payment
//           /         \
//          ↓           ↓
//    UPIPayment     CardPayment

//    Payment:
//    Field: amount
//    Constructor
//    Method displayAmount()

//    UPIPayment:
//    Field: upiId
//    Constructor using super()
//    Method displayUPI() using super.displayAmount()

//    CardPayment:
//    Field: cardNumber
//    Constructor using super()
//    Method displayCard() using super.displayAmount()

//    Expected output for UPI:
//    Amount: ₹2500
//    UPI ID: user@upi
//
//    Expected output for Card:
//    Amount: ₹5000
//    Card: 1234

class Payment {
    int amount;

    Payment(int amount){
        this.amount = amount;
    }
    void displayAmount(){
        System.out.println("Amount: ₹" + amount);
    }
}

class UPIPayment extends Payment {
    String upiId;

    UPIPayment(int amount, String upiId){
        super(amount);
        this.upiId = upiId;
    }
    void displayUPI(){
        super.displayAmount();
        System.out.println("UPI ID: " + upiId);
    }
}

class CardPayment extends Payment {
    long cardNumber;

    CardPayment(int amount, long cardNumber){
        super(amount);
        this.cardNumber = cardNumber;
    }

    void displayCard(){
        super.displayAmount();
        System.out.println("Card: " + cardNumber);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        UPIPayment payment1 = new UPIPayment(2500, "user@upi");
        CardPayment payment2 = new CardPayment(5000, 123456789);
        System.out.println("Information about UPI: ");
        payment1.displayUPI();
        System.out.println("Information about Card: ");
        payment2.displayCard();
    }
}
