package lab12;

import javax.swing.*;
import java.awt.*;

public class task1_CalculatorGUI {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Calculator");
        frame.setSize(250, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel with GridLayout for buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        // Add buttons 0-9 and other controls
        for (int i = 1; i <= 9; i++) {
            panel.add(new JButton(String.valueOf(i)));
        }
        panel.add(new JButton("0"));
        panel.add(new JButton("."));
        panel.add(new JButton("="));
        panel.add(new JButton("+"));
        panel.add(new JButton("-"));
        panel.add(new JButton("*"));
        panel.add(new JButton("/"));

        // Add display text field at the top
        JTextField display = new JTextField();
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        // Make frame visible
        frame.setVisible(true);
    }
}