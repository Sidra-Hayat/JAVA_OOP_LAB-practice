package lab1;
//Activity 3:
//Consider the concept of a Car Part. After analyzing this concept we may consider that it can be
//described by three data members: modelNumber, partNumber and cost.
//The methods should facilitate the user to assign values to these data members and show the values
//for each object.
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