package theory_assignment_02;

public class Hot_Dog_Stand {
        // Private instance variables
        private String standId;
        private int hotDogsSold;

        // Constructor to initialize the values
        public Hot_Dog_Stand(String standId) {
            this.standId = standId;
            this.hotDogsSold = 0; // Initial count of hot dogs sold
        }

        // Method to increment the number of hot dogs sold
        public void justSold() {
            hotDogsSold++; // Increment the sold count by 1
        }

        // Getter method to retrieve the number of hot dogs sold
        public int getHotDogsSold() {
            return hotDogsSold;
        }

        // Getter for standId (optional, for identification purposes)
        public String getStandId() {
            return standId;
        }

        public static void main(String[] args) {
            // Create three hot dog stands with unique stand IDs
            Hot_Dog_Stand stand1 = new Hot_Dog_Stand("Stand 1");
            Hot_Dog_Stand stand2 = new Hot_Dog_Stand("Stand 2");
            Hot_Dog_Stand stand3 = new Hot_Dog_Stand("Stand 3");

            // Simulate sales at each stand
            stand1.justSold();
            stand1.justSold();
            stand2.justSold();
            stand2.justSold();
            stand2.justSold();
            stand3.justSold();

            // Display the total number of hot dogs sold per stand
            System.out.println(stand1.getStandId() + " sold " + stand1.getHotDogsSold() + " hot dogs.");
            System.out.println(stand2.getStandId() + " sold " + stand2.getHotDogsSold() + " hot dogs.");
            System.out.println(stand3.getStandId() + " sold " + stand3.getHotDogsSold() + " hot dogs.");
        }
    }




