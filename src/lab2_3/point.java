package lab2_3;

public class point {
   private int x;
 private   int y;
    public point(){
        x=0;
        y=0;
    }
    public point(int a,int b){
        this.x=a;
        this.y=b;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void movepoint(int a,int b){
        x=x+a;
        y+=b;
    }
    public void display(){
        System.out.println("the x coordinate = "+x +",  the y coordinate = "+y) ;
    }

}
