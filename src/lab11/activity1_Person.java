package lab11;
import java.io.*;

public class activity1_Person implements Serializable {
    public String name = null;
    public int age = 0;

    public void setAge(int a) {
        age = a ;
    }

    public String getName() {
        return name ;
    }
}
