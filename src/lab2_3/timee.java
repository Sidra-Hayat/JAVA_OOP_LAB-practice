package lab2_3;

public class timee {


        int hr;
        int min;
        int seconds;

        public timee() {
            int hr = 0;
            int min = 0;
            int seconds = 0;

        }

        public timee(int h, int m, int s) {

            hr = h;
            min = m;
            seconds = s;
            if (hr >= 0 && hr < 24) {
                hr = h;
            } else {
                System.out.println("the time is not valid!!!");

            }

            if (min >= 0 && min < 60) {
                min = m;
            } else {
                System.out.println("the time is not valid!!!");

            }

            if (seconds >= 0 && seconds < 60) {
                seconds = s;
            } else {
                System.out.println("the time is not valid!!!");

            }
        }

        public void displayTime() {
            System.out.println("the time is valid");

            System.out.println("("+hr+":"+min+":"+seconds+")");

        }
    }



