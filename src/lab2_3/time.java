package lab2_3;

public class time {
    int hours;
    int seconds;
    int mins;

    public void display1(int h, int m, int s) {
        if (h <= 24) {
            hours = h;
        } else {
            System.out.println(" enter the valid hours");
        }
        if (m <= 60) {
            mins = m;
        } else {
            System.out.println("enters the valid minutes");
        }
        if (s <= 60) {

            seconds = s;

        } else {
            System.out.println("enter the valid seconds");
        }
    }
    public void display(){
        System.out.println("the time is "+hours+":"+mins+":"+seconds);
    }
}
