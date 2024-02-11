package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SwingControlDemo {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public SwingControlDemo() {
        prepareGUI();
    }

    public static void main(String[] args) {
        SwingControlDemo scd1 = new SwingControlDemo();
        scd1.showEventDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java Swing Example Demo");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3,1));

        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350,100);

        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showEventDemo() {
        headerLabel.setText("Control in action");

        JButton liaButton = new JButton("lia");
        JButton soneyButton = new JButton("Soney");
        JButton monhingyaButton = new JButton("Monhingya");

        liaButton.setActionCommand("lia");
        soneyButton.setActionCommand("soney");
        monhingyaButton.setActionCommand("monhingya");

        liaButton.addActionListener(new ButtonListener());
        soneyButton.addActionListener(new ButtonListener());
        monhingyaButton.addActionListener(new ButtonListener());

        controlPanel.add(liaButton);
        controlPanel.add(soneyButton);
        controlPanel.add(monhingyaButton);

        mainFrame.setVisible(true);

    }

    private class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(e);

            String command = e.getActionCommand();

            if (command.equals("lia")) {
                statusLabel.setText("Lia is being selected");
            } else if (command.equals("soney")) {
                statusLabel.setText("Soney is being selected");
            } else if (command.equals("monhingya")) {
                statusLabel.setText("Monhingya is being selected");
            }
        }
    }
}
