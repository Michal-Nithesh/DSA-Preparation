package OOPs.Properties.AccessModifiers.BankingSystem.Premium;

import OOPs.Properties.AccessModifiers.BankingSystem.Accounts.BankAccount;

public class PremiumAccount extends BankAccount {

    public void showAccountType() {

        System.out.println(accountType);
        // ✅ protected is accessible
    }
}
