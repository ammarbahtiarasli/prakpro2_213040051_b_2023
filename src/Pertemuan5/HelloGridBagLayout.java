package Pertemuan5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloGridBagLayout extends JFrame {
    public HelloGridBagLayout(){ // constructor
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close ketika di close

        JLabel headerLabel = new JLabel("Layout in action: GridLayout", JLabel.CENTER); // membuat label
        JPanel controlPanel = new JPanel(); // membuat panel
        controlPanel.setLayout(new FlowLayout()); // membuat layout
        JPanel panel = new JPanel(); // membuat panel
        panel.setBackground(Color.darkGray); // set background
        panel.setSize(300,300); // set ukuran
        GridBagLayout layout = new GridBagLayout(); // membuat layout
        panel.setLayout(layout); // set layout
        GridBagConstraints gbc = new GridBagConstraints(); // membuat gridbagconstraints

        gbc.fill = GridBagConstraints.HORIZONTAL; // set fill
        gbc.gridx = 0; // set gridx
        gbc.gridy = 0; // set gridy
        panel.add(new JButton("Button 1"), gbc); // menambahkan button

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(new JButton("Button 2"), gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 20;
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JButton("Button 3"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(new JButton("Button 4"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        panel.add(new JButton("Button 5"), gbc);

        controlPanel.add(panel); // menambahkan panel

        this.setLayout(new GridLayout(2, 1)); // membuat layout
        this.add(headerLabel);
        this.add(controlPanel);
        this.setSize(400, 400); // ukuran window
    }

    public static void main(String[] args) { // main method
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                HelloGridBagLayout HG = new HelloGridBagLayout();
                HG.setVisible(true);
            }
        });
    }
}
