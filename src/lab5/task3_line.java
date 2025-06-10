package lab5;

public class task3_line {

        private task3_point startPoint;
        private task3_point endPoint;

        // Constructor to initialize startPoint and endPoint
        public task3_line(task3_point startPoint, task3_point endPoint) {
            this.startPoint = startPoint;
            this.endPoint = endPoint;
        }

        // Method to calculate the length of the line
        public double calculateLength() {
            double x1 = startPoint.getX();
            double y1 = startPoint.getY();
            double x2 = endPoint.getX();
            double y2 = endPoint.getY();

            // Applying the distance formula: sqrt((x2 - x1)^2 + (y2 - y1)^2)
            return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        }

        // Method to display the details of the line
        public void display() {
            System.out.println("Line from ");
            startPoint.display();
            System.out.println("to ");
            endPoint.display();
            System.out.println("Length of the line: " + calculateLength());
        }
    }


