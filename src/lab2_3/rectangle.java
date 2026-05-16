package lab2_3;

public class rectangle {
   private  double length;
    private double width;
 public rectangle(){
        length=0.0;
        width=0.0;
    }
    public rectangle(double l,double w){
        this.length=l;
        this.width=w;

    }
    public double calculateArea(){
return(length*width);


    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
