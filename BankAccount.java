public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = (initialBalance >= 0) ? initialBalance : 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("You've successfully deposited ₹%.2f%n", amount);
        } else {
            System.out.println("Please enter a valid amount to deposit.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("You've successfully withdrawn ₹%.2f%n", amount);
        } else if (amount > balance) {
            System.out.printf("Insufficient funds. You only have ₹%.2f in your account.%n", balance);
        } else {
            System.out.println("Please enter a valid amount to withdraw.");
        }
    }

    public void checkBalance() {
        System.out.printf("Your current balance is ₹%.2f%n", balance);
    }
}
