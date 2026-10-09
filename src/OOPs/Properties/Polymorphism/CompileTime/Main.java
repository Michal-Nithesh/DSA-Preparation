package OOPs.Properties.Polymorphism.CompileTime;

//  Compile-time polymorphism
//  Method Overloading

//  The method is selected based on the arguments during compilation.

public class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.send("Your order has been shipped!");
        service.send(
                "Your order has been shipped!",
                "customer@gmail.com"
        );
        service.send(
                "Your OTP is 123456",
                123456789L
        );
    }
}

//  Notification Service
//  Suppose Amazon-like shopping application needs to send notifications through email, SMS, or a simple in-app message.
//  We can use method overloading to create different versions of the same send() method.

//  Create a class called NotificationService with three overloaded methods named send():

//  send(String message) — prints a text message.
//  send(String message, String email) — prints the message and recipient email.
//  send(String message, long phoneNumber) — prints the message and recipient phone number.

class NotificationService {
    // Send an in-app message
    void send(String message){
        System.out.println("App notification: " + message);
    }
    // Send an Email
    void send(String message, String email){
        System.out.println("Email sent to: " + email);
        System.out.println("Message: " + message);
    }
    // Send an SMS
    void send(String message, long phoneNumber) {
        System.out.println("SMS sent to: " + phoneNumber);
        System.out.println("Message: " + message);
    }
}
