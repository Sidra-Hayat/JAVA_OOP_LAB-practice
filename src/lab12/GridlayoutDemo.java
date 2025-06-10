package lab12;

import javax.swing.*;
import java.awt.*;

public class GridlayoutDemo {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("GridLayoutDemo");
        frame.setSize(250, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 3, 5, 5));
        for (int i = 1; i <= 2; i++) {
            panel.add(new JButton(String.valueOf(i)));
        }
        panel.add(new JButton("one"));
        panel.add(new JButton("two"));
        panel.add(new JButton("three"));
        panel.add(new JButton("four"));
        panel.add(new JButton("five"));
        panel.add(new JButton("six"));
        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
