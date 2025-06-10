package theory_assignment_02;

public class EMS_employee {
        private String name;
        private String employeeId;
        private EMS_Address  address;

        // Constructor to initialize Employee with Address
        public EMS_employee(String name, String employeeId, EMS_Address  address) {
            this.name = name;
            this.employeeId = employeeId;
            this.address = address;
        }

        // Method to display employee and address details
        public void displayInfo() {
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Address: ");
            System.out.println("Street: " + address.getStreet());
            System.out.println("City: " + address.getCity());
            System.out.println("Zip Code: " + address.getZipCode());
        }
    }


