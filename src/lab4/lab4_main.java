package lab4;



public class lab4_main {
    public static void main(String[] args) {

        // BOOK + MEMBER
        book b1 = new book("B1", "Java", "James");
        member m1 = new member("M1", "Ali");

        m1.borrowbooks(b1);
        m1.return_book(b1);

        // DISTANCE
        distance_lab_task1 d1 = new distance_lab_task1(5, 8);
        distance_lab_task1 d2 = new distance_lab_task1(3, 10);

        distance_lab_task1 result = d1.add(d2);
        result.display();

        // POINT
        point_activity3 p1 = new point_activity3(10, 20);
        point_activity3 p2 = new point_activity3(5, 5);

        point_activity3 p3 = p1.Add(p1, p2);
        p3.display();
    }
}