package theory_assignment_02;

    public class BMS_savings_account extends BMS_bank_account {
        private double withdrawalLimit;

        // Constructor
        public BMS_savings_account(String accountNumber, String accountHolderName, double initialBalance, double withdrawalLimit) {
            super(accountNumber, accountHolderName, initialBalance); // Call the parent constructor
            this.withdrawalLimit = withdrawalLimit;
        }
        // Overridden withdraw method to include withdrawal limit
        @Override
        public void withdraw(double amount) {
            if (amount <= withdrawalLimit) {
                super.withdraw(amount); // Call the withdraw method from BankAccount class
            } else {
                System.out.println("Withdrawal limit exceeded. Max allowed withdrawal: " + withdrawalLimit);
            }
        }
        // Get the withdrawal limit
        public double getWithdrawalLimit() {
            return withdrawalLimit;
        }
    }



