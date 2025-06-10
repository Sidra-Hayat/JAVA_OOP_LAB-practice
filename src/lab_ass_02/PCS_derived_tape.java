package lab_ass_02;

    public class  PCS_derived_tape extends PCS_publication {
        private int playingTime;

        // Setter and Getter methods for playingTime
        public void setPlayingTime(int playingTime) {
            this.playingTime = playingTime;
        }

        public int getPlayingTime() {
            return playingTime;
        }

        // Override the display method to include playingTime
        @Override
        public void display() {
            super.display();  // Display the title and price from the Publication class
            System.out.println("Playing Time: " + playingTime + " minutes");
        }
    }


