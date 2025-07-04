import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(500.00);
        ATM atm = new ATM(userAccount);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            atm.displayMenu();
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter a number between 1-4: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            atm.processChoice(choice);
        } while (choice != 4);

        scanner.close();
    }
}
