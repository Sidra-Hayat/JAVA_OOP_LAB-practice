package lab_ass_02;

public class time_management_system {

        public static void main(String[] args) {

// Create Time objects with valid and invalid values
            TMS_time time1 = new TMS_time(); // Default time
            TMS_time time2 = new TMS_time(10, 30, 45);
            // Valid time
            TMS_time time3 = new TMS_time(25, 61, 75);
            // Invalid time

            // Display times
            System.out.print("Time 1: ");
            time1.displayTime(); // Expected: 00:00:00

            System.out.print("Time 2: ");
            time2.displayTime(); // Expected: 10:30:45

            System.out.print("Time 3: ");
            time3.displayTime(); // Expected: 00:00:00 (due to invalid input)

            System.out.println("sp24_bcs_093");
        }


}
