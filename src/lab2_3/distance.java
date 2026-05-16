package lab2_3;

public class distance {

        double feet;
        double inches;
        public distance(){
            feet=0.0;
            inches=0.0;

        }
        public distance(double f,double i) {
            feet = f;
            inches = i;
        }
        public void display(){
            System.out.println(feet+","+inches);


        }

    }



