package Pertemuan4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HelloBorderLayout extends JFrame {
    public HelloBorderLayout(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // berfungsi untuk membuat label input ibukota indonesia
        JLabel labelInput = new JLabel("Apakah ibukota Indonesia ? ");
        JLabel labelHasil = new JLabel("Jawab pertanyaan diatas");
        // berfungsi untuk membuat button
        JButton buttonA = new JButton("Jakarta");
        JButton buttonB = new JButton("Bandung");
        JButton buttonC = new JButton("Surabaya");
        // berfungsi untuk membuat button action
        buttonA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelHasil.setText("Jawaban anda benar");
            }
        });

        buttonB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelHasil.setText("Jawaban anda salah");
            }
        });

        buttonC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                labelHasil.setText("Jawaban anda salah");
            }
        });
        // berfungsi untuk menambahkan label dan button ditambah border layout
        this.add(labelInput, BorderLayout.NORTH);
        this.add(labelHasil, BorderLayout.SOUTH);
        this.add(buttonA, BorderLayout.WEST);
        this.add(buttonB, BorderLayout.CENTER);
        this.add(buttonC, BorderLayout.EAST);
        // berfungsi untuk menampilkan frame
        this.setSize(400, 200);
    }
    // berfungsi untuk menjalankan program
    public  static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                HelloBorderLayout helloBorderLayout = new HelloBorderLayout();
                helloBorderLayout.setVisible(true);
            }
        });
    }

}
