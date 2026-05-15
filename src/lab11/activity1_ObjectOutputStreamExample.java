package lab11;

import java.io.*;

public class activity1_ObjectOutputStreamExample {

    public void writeToFile() {

        try
        {
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(new FileOutputStream("filename"));

            activity1_Person p = new activity1_Person();
            p.name = "Jakob Jenkov"; p.age = 40;

            objectOutputStream.writeObject(p);
        }
        catch (FileNotFoundException ex)
        { ex.printStackTrace();
        }
        catch (IOException ex)
        { ex.printStackTrace();
        } }
}
