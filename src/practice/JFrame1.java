package practice;

import javax.swing.*;
import java.awt.*;

public class JFrame1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing JLabel");
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(1,1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


//        JButton button = new JButton("Website Click");
//        button.setBounds(150,200,220,100);
//        frame.add(button);

        JLabel label = new JLabel("This is the JLabel", JLabel.CENTER);
        label.setSize(350,100);
        JPanel panel = new JPanel();
        label.setText("Hello world");
        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);


    }
}
