package lab6;

public class task1_employee extends task1_person{

        protected String office;
        protected double salary;
        protected task1_date_hired dateHired;

        // Constructor
        public task1_employee(String name, String address, String phoneNumber, String email, String office, double salary, task1_date_hired dateHired) {
            super(name, address, phoneNumber, email);
            this.office = office;
            this.salary = salary;
            this.dateHired = dateHired;
        }

        // Method to display employee information
        @Override
        public void display() {
            super.display();
            System.out.println("Office: " + office);
            System.out.println("Salary: $" + salary);
            System.out.println("Date Hired: " + dateHired);
        }
    }



