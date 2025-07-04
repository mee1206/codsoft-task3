import java.util.Scanner;

public class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("\nWelcome to the ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.print("Please choose an option: ");
    }

    public void processChoice(int choice) {
        Scanner scanner = new Scanner(System.in);
        switch (choice) {
            case 1:
                account.checkBalance();
                break;
            case 2:
                System.out.print("Enter the amount to deposit: ₹");
                double depAmt = scanner.nextDouble();
                account.deposit(depAmt);
                break;
            case 3:
                System.out.print("Enter the amount to withdraw: ₹");
                double wtdAmt = scanner.nextDouble();
                account.withdraw(wtdAmt);
                break;
            case 4:
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }
}
