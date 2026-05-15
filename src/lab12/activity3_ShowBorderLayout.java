package lab12;


import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class activity3_ShowBorderLayout extends JFrame {

    public activity3_ShowBorderLayout() {
        //Set BorderLayout with horizontal gaps 5 and vertical gap 10
        setLayout(new BorderLayout(5, 10));
        //Add buttons to the frame
        add(new JButton("EAST"),
                BorderLayout.EAST);
        add(new JButton("SOUTH"),
                BorderLayout.SOUTH);
        add(new JButton("WEST"),
                BorderLayout.WEST);
        add(new JButton("NORTH"),
                BorderLayout.NORTH);
        add(new JButton("CENTER"),
                BorderLayout.CENTER);
    }
}