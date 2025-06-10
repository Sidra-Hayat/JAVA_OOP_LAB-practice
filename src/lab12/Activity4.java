package lab12;

import javax.swing.*;

public class Activity4  {
    public static void main(String[] args) {
        TestPanels frame = new TestPanels();
        frame.setTitle("The Front View of a Microwave Oven");
                frame.setSize(400, 250);
        frame.setLocationRelativeTo(null);
//Center the frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
