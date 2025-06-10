package lab1;

public class Activity2 {
    public static void main(String[] args) {
        Activity2_Date date1, date2;
        date1 = new Activity2_Date();
        date1.month = "December";
        date1.day = 31;
        date1.year = 2012;
        System.out.println("date1:");
        date1.displayDate();
        date2 = new Activity2_Date();
        date2.month = "July";
        date2.day = 4;
        date2.year = 1776;
        System.out.println("date2:");
        date2.displayDate();
    }
}
