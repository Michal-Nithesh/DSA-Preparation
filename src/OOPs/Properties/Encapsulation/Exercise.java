package OOPs.Properties.Encapsulation;

// Create a BankAccount class with:
//  private String accountHolder
//  private double balance
//  Constructor
//  getAccountHolder()
//  getBalance()
//  deposit(double amount)
//  withdraw(double amount)

//Rules:
//deposit → amount must be > 0
//withdraw → amount must be > 0 AND <= balance

public class Exercise {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Michal Nithesh");
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(1000);
        System.out.println("After Deposit: " + account.getBalance());

        account.deposit(500);
        System.out.println("After Second Deposit: " + account.getBalance());

        account.withdraw(300);
        System.out.println("After Withdrawal: " + account.getBalance());

        // Invalid deposit
        account.deposit(-100);
        System.out.println("After Invalid Deposit: " + account.getBalance());

        // Invalid withdrawal
        account.withdraw(2000);
        System.out.println("After Invalid Withdrawal: " + account.getBalance());
    }
}
class BankAccount {
    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder){
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount > 0) {
            this.balance += amount;
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            this.balance -= amount;
        }
    }
}