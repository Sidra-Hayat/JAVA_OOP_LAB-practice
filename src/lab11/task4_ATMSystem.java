package lab11;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class task4_ATMSystem {




        private static final String FILE_NAME = "accounts.dat";

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Create 10 accounts once, comment out after first run
            // createSampleAccounts();

            while (true) {
                System.out.println("\nATM System Menu:");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Transfer");
                System.out.println("4. Balance Inquiry");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int option = scanner.nextInt();

                switch (option) {
                    case 1 -> withdraw(scanner);
                    case 2 -> deposit(scanner);
                    case 3 -> transfer(scanner);
                    case 4 -> balanceInquiry(scanner);
                    case 5 -> {
                        System.out.println("Thank you for using the ATM System.");
                        System.exit(0);
                    }
                    default -> System.out.println("Invalid option. Try again.");
                }
            }
        }

        private static void createSampleAccounts() {
            ArrayList<task4_Account> accounts = new ArrayList<>();
            for (int i = 1; i <= 10; i++) {
                accounts.add(new task4_Account(1000 + i, "User" + i, 1000.0));
            }
            saveAccounts(accounts);
            System.out.println("Sample accounts created.");
        }

        private static ArrayList<task4_Account> loadAccounts() {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
                return (ArrayList<task4_Account>) in.readObject();
            } catch (FileNotFoundException e) {
                return new ArrayList<>(); // File not found, return empty list
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                return new ArrayList<>();
            }
        }

        private static void saveAccounts(ArrayList<task4_Account> accounts) {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
                out.writeObject(accounts);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static task4_Account findAccount(ArrayList<task4_Account> accounts, int accountNumber) {
            for (task4_Account acc : accounts) {
                if (acc.getAccountNumber() == accountNumber) {
                    return acc;
                }
            }
            return null;
        }

        private static void withdraw(Scanner scanner) {
            System.out.print("Enter account number: ");
            int accNum = scanner.nextInt();
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();

            ArrayList<task4_Account> accounts = loadAccounts();
            task4_Account acc = findAccount(accounts, accNum);
            if (acc == null) {
                System.out.println("Account not found.");
                return;
            }
            if (acc.withdraw(amount)) {
                saveAccounts(accounts);
                System.out.println("Withdrawal successful. New balance: " + acc.getBalance());
            } else {
                System.out.println("Insufficient balance or invalid amount.");
            }
        }

        private static void deposit(Scanner scanner) {
            System.out.print("Enter account number: ");
            int accNum = scanner.nextInt();
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();

            ArrayList<task4_Account> accounts = loadAccounts();
            task4_Account acc = findAccount(accounts, accNum);
            if (acc == null) {
                System.out.println("Account not found.");
                return;
            }
            acc.deposit(amount);
            saveAccounts(accounts);
            System.out.println("Deposit successful. New balance: " + acc.getBalance());
        }

        private static void transfer(Scanner scanner) {
            System.out.print("Enter source account number: ");
            int fromAccNum = scanner.nextInt();
            System.out.print("Enter destination account number: ");
            int toAccNum = scanner.nextInt();
            System.out.print("Enter amount to transfer: ");
            double amount = scanner.nextDouble();

            if (fromAccNum == toAccNum) {
                System.out.println("Source and destination account numbers must be different.");
                return;
            }

            ArrayList<task4_Account> accounts = loadAccounts();
            task4_Account fromAcc = findAccount(accounts, fromAccNum);
            task4_Account toAcc = findAccount(accounts, toAccNum);

            if (fromAcc == null || toAcc == null) {
                System.out.println("One or both accounts not found.");
                return;
            }

            if (fromAcc.withdraw(amount)) {
                toAcc.deposit(amount);
                saveAccounts(accounts);
                System.out.println("Transfer successful.");
                System.out.println("New balance of source account: " + fromAcc.getBalance());
                System.out.println("New balance of destination account: " + toAcc.getBalance());
            } else {
                System.out.println("Insufficient balance in source account or invalid amount.");
            }
        }

        private static void balanceInquiry(Scanner scanner) {
            System.out.print("Enter account number: ");
            int accNum = scanner.nextInt();

            ArrayList<task4_Account> accounts = loadAccounts();
            task4_Account acc = findAccount(accounts, accNum);
            if (acc == null) {
                System.out.println("Account not found.");
            } else {
                System.out.println("Account holder: " + acc.getName());
                System.out.println("Account balance: " + acc.getBalance());
            }
        }
    }


