package lab2_3;

public class circle {
     private double radius;
    public circle(){
        radius=5;

    }
    public circle(int r){
        this.radius=r;
    }
    public double calculatecircumference(){
        return(2*3.14*radius);


    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
