package lab1;
import java.util.Scanner;
public class Activity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Activity3_CarPart car1 = new Activity3_CarPart();
        System.out.println("What is Model Number?");
        String x = sc.nextLine();
        System.out.println("What is Part Number?");
        String y = sc.nextLine();
        System.out.println("What is Cost?");
        String z = sc.nextLine();
        car1.setparameter(x, y, z);
        car1.display();
    }
}