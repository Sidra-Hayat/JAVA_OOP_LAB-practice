package lab5;

public class task3_pointmain {

        public static void main(String[] args) {

                    // Create two Point objects
            task3_point point1 = new task3_point(1, 2);
            task3_point point2 = new task3_point(4, 6);
            task3_point point3 = new task3_point(0, 0);
            task3_point point4 = new task3_point(3, 4);

                    // Create two Line objects
            task3_line line1 = new task3_line(point1, point2);
            task3_line line2 = new task3_line(point3, point4);

                    // Display information about the lines
                    line1.display();
                    line2.display();
                }
            }



