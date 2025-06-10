package lab5;

public class task3_point {

        private double x;
        private double y;

        // Argument constructor
        public task3_point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        // Getter for x
        public double getX() {
            return x;
        }

        // Setter for x
        public void setX(double x) {
            this.x = x;
        }

        // Getter for y
        public double getY() {
            return y;
        }

        // Setter for y
        public void setY(double y) {
            this.y = y;
        }

        // Display function
        public void display() {
            System.out.println("Point(" + x + ", " + y + ")");
        }
    }


