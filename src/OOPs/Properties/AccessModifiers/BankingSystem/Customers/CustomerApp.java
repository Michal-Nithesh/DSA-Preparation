package OOPs.Properties.AccessModifiers.BankingSystem.Customers;

import OOPs.Properties.AccessModifiers.BankingSystem.Accounts.BankAccount;

public class CustomerApp {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        System.out.println(account.bankName);
        // ✅ public

        System.out.println(account.getBalance());
        // ✅ public method

        account.deposit(2000);
        // ✅ public method


        // account.balance = 1000000;
        // ❌ private

        // account.accountNumber;
        // ❌ default

        // account.accountType;
        // ❌ protected
    }
}
