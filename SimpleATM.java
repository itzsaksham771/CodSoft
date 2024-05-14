//                                              TASK 3
import java.util.Scanner;
public class SimpleATM {
    private static double balance = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney(scanner);
                    break;
                case 3:
                    withdrawMoney(scanner);
                    break;
                case 4:
                    System.out.println("Exiting ATM. Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
    private static void checkBalance() {
        System.out.printf("Your current balance is: $%.2f\n", balance);
    }
    private static void depositMoney(Scanner scanner) {
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            checkBalance();
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }
    private static void withdrawMoney(Scanner scanner) {
        System.out.print("Enter amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            if (balance >= amount) {
                balance = balance-amount;
                System.out.println("Withdrawn: $" + amount);
                checkBalance();
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }
}
