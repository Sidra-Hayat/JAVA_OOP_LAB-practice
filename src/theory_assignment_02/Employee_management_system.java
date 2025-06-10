package theory_assignment_02;

public class Employee_management_system {
    public static void main(String[] args) {

                // Create an Address object
        EMS_Address  employeeAddress = new EMS_Address ("123 Main St",
                "Springfield", "12345");

                // Create an Employee object with the Address
        EMS_employee employee = new EMS_employee("rija", "E123", employeeAddress);

                // Display the employee and address details
                employee.displayInfo();
            }
        }


