package theory_assignment_02;

public class BMS_bank_account {
        private String accountNumber;
        private double balance;
        private String accountHolderName;

        // Constructor
        public BMS_bank_account(String accountNumber, String accountHolderName, double initialBalance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = initialBalance;
        }

        // Deposit method to add money to the account
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        // Withdraw method to withdraw money from the account
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount);
            } else if (amount <= 0) {
                System.out.println("Withdrawal amount must be positive.");
            } else {
                System.out.println("Insufficient balance.");
            }
        }

        // Get the current balance
        public double getBalance() {
            return balance;
        }

        // Get account holder name
        public String getAccountHolderName() {
            return accountHolderName;
        }
        // Get account number
        public String getAccountNumber() {return accountNumber;
        }
    }



