package lab1;
//The example below represents a Date class. As date is composed of three attributes, namely month,
//year and day; so, the class contains three Data Members. Now every date object will have these three
//attributes, but each object can have different values for these three

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
