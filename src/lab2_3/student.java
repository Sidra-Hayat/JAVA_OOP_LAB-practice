package lab2_3;

public class student {
    String std_name;
    int std_roll;
    int smester;
    public void parameters(String n,int r,int s){
        std_name=n;
        std_roll=r;
        smester=s;
    }
    public void display(){
        System.out.println("name: "+std_name+" roll no: "+std_roll+" smester: "+smester);
    }

}
