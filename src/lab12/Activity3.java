package lab12;

import javax.swing.*;

public class Activity3 {

        public static void main(String[] args) {
            ShowBorderLayout frame = new
                    ShowBorderLayout();
            frame.setTitle("Show BorderLayout");
            frame.setSize(300, 200);
            frame.setLocationRelativeTo(null);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
}
