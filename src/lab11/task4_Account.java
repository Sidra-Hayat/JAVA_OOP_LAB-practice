package lab11;

    import java.io.Serializable;

    public class task4_Account implements Serializable {
        private static final long serialVersionUID = 1L;

        private int accountNumber;
        private String name;
        private double balance;

        public task4_Account(int accountNumber, String name, double balance) {
            this.accountNumber = accountNumber;
            this.name = name;
            this.balance = balance;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public String getName() {
            return name;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if(amount > 0) {
                balance += amount;
            }
        }

        public boolean withdraw(double amount) {
            if(amount > 0 && amount <= balance) {
                balance -= amount;
                return true;
            }
            return false;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "accountNumber=" + accountNumber +
                    ", name='" + name + '\'' +
                    ", balance=" + balance +
                    '}';
        }
    }

