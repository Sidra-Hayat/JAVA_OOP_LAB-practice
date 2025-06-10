package lab_ass_02;
class TMS_time {
    // Private attributes
        private int hours;
        private int minutes;
        private int seconds;
        public TMS_time() {  // Default constructor, initializes time to 00:00:00
            this.hours = 0;
            this.minutes = 0;
            this.seconds = 0;
        }
        public TMS_time(int hours, int minutes, int seconds) {   // Parameterized constructor
            // Validate hours
            if (hours >= 0 && hours <= 23) {
                this.hours = hours;
            } else {
                this.hours = 0;
                // Default to 00 if invalid
                System.out.println("Invalid hours input. Setting hours to 00.");
            }
            if (minutes >= 0 && minutes <= 59) {
                this.minutes = minutes;
            } else {
                this.minutes = 0;
                System.out.println("Invalid minutes input. Setting minutes to 00.");
            }
            if (seconds >= 0 && seconds <= 59) {
                this.seconds = seconds;
            } else {
                this.seconds = 0;
                System.out.println("Invalid seconds input. Setting seconds to 00.");
            }
        }
        public void displayTime() {
            System.out.println( hours+","+ minutes+","+ seconds);
        }


    }


