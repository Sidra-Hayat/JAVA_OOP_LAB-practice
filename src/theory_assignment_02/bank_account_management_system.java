package theory_assignment_02;

public class bank_account_management_system {
        public static void main(String[] args) {
            // Create a BankAccount instance
            BMS_bank_account account1 = new BMS_bank_account("12345", "John Doe", 1000.0);

            // Demonstrate BankAccount transactions
            System.out.println("Bank Account: " + account1.getAccountHolderName());
            account1.deposit(500.0);
            account1.withdraw(200.0);
            System.out.println("Current Balance: " + account1.getBalance());
 BMS_savings_account account2 = new BMS_savings_account("67890", "Jane Smith",
         1500.0, 500.0);

            // Demonstrate SavingsAccount transactions
            System.out.println("\nSavings Account: " + account2.getAccountHolderName());
            account2.deposit(300.0);
            account2.withdraw(400.0); // Within withdrawal limit
            account2.withdraw(600.0); // Exceeds withdrawal limit
            System.out.println("Current Balance: " + account2.getBalance());
        }
    }


