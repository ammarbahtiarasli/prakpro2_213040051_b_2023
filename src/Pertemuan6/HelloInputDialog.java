package Pertemuan6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloInputDialog extends JFrame {
    // Constructor
    public HelloInputDialog () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit saat close
        this.setLayout(new FlowLayout());

        JButton btn = new JButton("input"); // Create button
        btn.setBounds(130, 100, 100, 40); // x, y, width, height
        // Event listener
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = JOptionPane.showInputDialog(HelloInputDialog.this, "Masukkan nama anda");
                JOptionPane.showMessageDialog(HelloInputDialog.this, "Hello " + nama);
            }
        });
        this.add(btn);
        this.setSize(200, 200);
    }
 // Main method
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloInputDialog h = new HelloInputDialog();
                h.setVisible(true);
            }
        });
    }
}
