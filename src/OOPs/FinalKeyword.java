package OOPs;

//  The final keyword is used to restrict changes.
//  It has three main uses:
//  1. final variable → cannot be reassigned.
//  2. final method → cannot be overridden.
//  3. final class → cannot be extended (inherited).

public class FinalKeyword {
    static void main(String[] args) {
        Room room = new Room();
        room.roomNumber = 20;   // Allowed
        System.out.println(room.roomNumber);

        Seat seat = new Seat();
//        seat.seatNumber = 20;   // Compilation error
        System.out.println(seat.seatNumber);

        final StringBuilder name = new StringBuilder("Michal");

        name.append(" Nithesh");  // ✅ Allowed

        // name = new StringBuilder("Arun"); // ❌
        System.out.println(name);
    }
}
//  Without final
class Room {
    int roomNumber = 10;
}
// With final
class Seat {
    final int seatNumber = 10;

//    Seat(int seatNumber){
//        this.seatNumber = seatNumber;
//    }
    //  final prevents reassignment; it doesn't automatically make every object immutable.
}

//  Without final method
class Payment {
    void verifyPayment() {
        System.out.println("Verifying payment securely");
    }
}
class UPIPayment extends Payment {
    @Override
    void verifyPayment() {
        System.out.println("Skipping verification");
    }
}
//  This is allowed. The child overrides the parent method.



// With final
class Payments {
    final void verifyPayment() {
        System.out.println("Verifying payment securely");
    }
}
class CardPayment extends Payments {
    // Compilation error if we override verifyPayment()
    // @Override
    // void verifyPayment() {
    //     System.out.println("Skipping verification");
    // }
}
//  Now UPIPayment can inherit and call verifyPayment(), but it cannot override that method.


//  Without final
class PaymentGateway {
    void process() {
        System.out.println("Processing payment");
    }
}
class CustomGateway extends PaymentGateway {
    // Allowed
}
//  This compiles because PaymentGateway isn't final.


// With final
final class PaymentGateways {
    void process() {
        System.out.println("Processing payment");
    }
}
// Compilation error
// class CustomGateway extends PaymentGateway {
//
// }
//  A final class cannot be inherited.



//  Usage	    Without final	    With final
//  Variable	Can be reassigned	Cannot be reassigned
//  Method	    Can be overridden	Cannot be overridden
//  Class	    Can be extended	    Cannot be extended

//  One extra concept: final with objects
//  Consider:
//    final StringBuilder name = new StringBuilder("Michal");
//    Check the Main function
//    name.append(" Nithesh"); // Allowed

// name = new StringBuilder("Arun"); // Compilation error
//  Why is append() allowed?
//  Because final prevents changing the reference to another object; it doesn't necessarily prevent changing the object's internal state.
//  This distinction becomes useful when learning immutable objects and collections.