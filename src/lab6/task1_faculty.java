package lab6;

public class task1_faculty extends task1_employee{
    protected int office_hours;
    protected String rank;

        // Constructor
        public task1_faculty(String name, String address, String phoneNumber, String email, String office, double salary, task1_date_hired dateHired, String officeHours, String rank) {
            super(name, address, phoneNumber, email, office, salary, dateHired);
           // this.office_hours = officeHours;
            this.rank = rank;
        }

        // Method to display faculty information
        @Override
        public void display() {
            super.display();
            System.out.println("Office Hours: " + office_hours);
            System.out.println("Rank: " + rank);
        }
    }



