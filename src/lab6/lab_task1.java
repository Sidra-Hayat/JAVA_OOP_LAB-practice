package lab6;

public class lab_task1 {
    public static void main(String[] args) {
        task1_date_hired dateHired = new task1_date_hired(2020,2,26);

        // Create instances of Student, Faculty, and Staff
        activity1_Student student = new activity1_Student("John Doe", "123 Main St", 90000, "johndoe@email.com", 67);
        task1_faculty faculty = new task1_faculty("Dr. Smith", "456 College Ave", "987-654-3210", "drsmith@email.com", "Room 101", 75000, dateHired, "Mon-Fri 9-12", "Professor");
        task1_staff staff = new task1_staff("Jane Lee", "789 University Blvd", "654-321-9870", "janelee@email.com", "Admin Office", 50000, dateHired, "Secretary");

        // Display the information
        System.out.println("Student Information:");
        student.display();
        System.out.println("\nFaculty Information:");
        faculty.display();
        System.out.println("\nStaff Information:");
        staff.display();
   }
}
