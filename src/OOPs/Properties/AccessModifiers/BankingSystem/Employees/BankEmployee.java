package OOPs.Properties.AccessModifiers.BankingSystem.Employees;

import OOPs.Properties.AccessModifiers.BankingSystem.Accounts.BankAccount;

public class BankEmployee {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // private
        // account.balance = 100000;
        // ❌ Cannot access

        // default
        // account.accountNumber;
        // ❌ Cannot access

        // protected
        // account.accountType;
        // ❌ Cannot access
        // because BankEmployee is not a subclass

        // public
        System.out.println(account.bankName);
        // ✅ Can access

        System.out.println(account.getBalance());
        // ✅ Can access

        account.deposit(5000);
        // ✅ Can access
    }
}
