import java.util.*;

class Main {
    float balance = 0;
    int PIN = 5674;

    public void checkPin() {
        System.out.println("Enter PIN:");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();

        if (enteredPin == PIN) {
            menu();
        } else {
            System.out.println("Wrong PIN");
        }
    }

    public void menu() {
        System.out.println("\n1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1) {
            checkBalance();
        } else if (choice == 2) {
            depositMoney();
        } else if (choice == 3) {
            withdrawMoney();
        } else if (choice == 4) {
            System.out.println("Thank you!");
        } else {
            System.out.println("Invalid choice");
            menu();
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
        menu();
    }

    public void depositMoney() {
        System.out.println("Enter amount:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        balance = balance + amount;
        System.out.println("Money deposited");
        menu();
    }

    public void withdrawMoney() {
        System.out.println("Enter amount:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Money withdrawn");
        }
        menu();
    }
}

public class ATMmachine {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.checkPin();
    }
}