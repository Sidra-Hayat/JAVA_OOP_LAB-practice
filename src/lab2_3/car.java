package lab2_3;

public class car {
    String part_name;
    String model_number;
    String cost;
    public void parameters(String n,String no, String cost){
        part_name=n;
        model_number=no;
       this.cost=cost;

    }
    public void display(){
        System.out.println(" model number is"+model_number+" part name is "+part_name+" cost is "+cost);


    }


}
