package Pertemuan2;

import javax.swing.*;
import java.awt.event.*;

public class ButtonEventSwing extends JFrame {
    public ButtonEventSwing(){
        this. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World");
        label.setBounds(130, 40, 400, 10);

        JButton button = new JButton("Click");
        button.setBounds(130, 100, 100, 40);

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText("Hello Pemograman 2");
            }
        });

        this.add(button);
        this.add(label);

        this.setSize(400, 500);
        this.setLayout(null);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                ButtonEventSwing gui = new ButtonEventSwing();
                gui.setVisible(true);
            }
        });
    }
}
