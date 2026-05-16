package lab2_3;

public class Student3 {
    String name;
    int[] Result_array=new int[5];
    public Student3(String n,int[] b){
        this.name=n;
        Result_array=b;

    }
    public double average() {
        int sum = 0;
        for (int i = 0; i < Result_array.length; i++) {
            sum += Result_array[i];

        }
        return (sum/ Result_array.length);

        }

}
