package OOPs.Properties.AccessModifiers.BankingSystem;

public class Main {
}

//  Access Modifiers in Java
//  Access modifiers control who can access a class, variable, method, or constructor.

//  Java has four levels:
//  private <=> default <=> protected <=> public
//  Think of them as levels of permission.
//  1. Real-world analogy — Bank
//  Imagine a bank account:
//
//                     BANK ACCOUNT
//                          │
//             ┌────────────┼────────────┐
//             │            │            │
//          private       default     protected
//             │            │            │
//        Only myself    My package  // My package
//                                     + subclasses
//             │
//             └───────────────────────────────┐
//                                             │
//                                           public
//                                             │
//                                          Everyone
//  For example:

//  private double balance;
//  The account's balance should be protected.
//  You don't want another class doing:

//  account.balance = -500000;
//  Instead, you provide controlled methods:

//  account.deposit(5000);
//  account.withdraw(1000);
//  This is where encapsulation and access modifiers work together.

//  2. Your project structure
//  I recommend creating this structure:
//
//  src/
//  └── OOPs/
//        └── Properties/
//            └── AccessModifiers/
//                └── BankingSystem/
//                    │
//                    ├── Main.java
//                    │
//                    ├── accounts/
//                    │   └── BankAccount.java
//                    │
//                    ├── employees/
//                    │   └── BankEmployee.java
//                    │
//                    └── customers/
//                          └── Customer.java

//  There are two important concepts here:

//  Package
//  For example:
//  package OOPs.Properties.AccessModifiers.BankingSystem.accounts;

//  Class
//  For example:
//  public class BankAccount {
//  }
//  Packages are important because default and protected access depend partly on the package.

//Memorize this:
//private   → SAME CLASS
//default   → SAME PACKAGE
//protected → SAME PACKAGE + SUBCLASS
//public    → EVERYWHERE

//And the progression is:
//
//  private  <  default  <  protected  <  public
//      🔒          🏢           👨‍👦          🌍
//  One final note: top-level classes have slightly different rules—at the top level, a class can be public or package-private, but not private or protected. Those two modifiers are allowed for nested classes.