package lab1;

public class Activity1 {
    public static void main(String[] args) {
        Activity1_Courseresult c1 = new Activity1_Courseresult();
        c1.studentname = "Ali";
        c1.coursename = "OOP";
        c1.grade = "A";
        c1.display();
        Activity1_Courseresult c2 = new Activity1_Courseresult();
        c2.studentname = "Saba";
        c2.coursename = "ICP";
        c2.grade = "A+";
        c2.display();
    }
}
