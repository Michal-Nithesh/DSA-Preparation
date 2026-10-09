package OOPs.Properties.AccessModifiers.BankingSystem.Accounts;

// Notice how this resembles a real bank.
//  private balance
//  private double balance;
//  A customer shouldn't be able to do this:

//  account.balance = 10000000;
//  That would be dangerous.
//  Instead, the bank controls it through:

//  account.deposit(5000);
//  That's encapsulation + private access.

public class BankAccount {
        // Only BankAccount itself can access this
        private double balance = 50000;

        // Available to classes inside the accounts package
        String accountNumber = "ABC12345";

        // Available to same package + subclasses
        protected String accountType = "Savings";

        // Available from anywhere
        public String bankName = "ABC Bank";


        // Public method to safely check balance
        public double getBalance() {
            return balance;
        }

        // Public method to deposit money
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        // Private method
        private void calculateInterest() {
            System.out.println("Calculating interest...");
        }
}
