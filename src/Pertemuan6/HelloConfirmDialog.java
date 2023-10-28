package Pertemuan6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloConfirmDialog extends JFrame {
    // Constructor
    public HelloConfirmDialog (){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit saat close
        this.setLayout(new FlowLayout()); // Layout manager

        JButton btn = new JButton("Exit");
        btn.setBounds(130, 100, 100, 40); // x, y, width, height
        // Event listener
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(HelloConfirmDialog.this, "Apakah anda yakin ingin keluar dari app ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(HelloConfirmDialog.this, "Anda membatalkan keluar dari app");
                }
            }
        });
        // Add button to frame
        this.add(btn);
        this.setSize(200, 200);
    }
    // Main method
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloConfirmDialog frame = new HelloConfirmDialog();
                frame.setVisible(true);
            }
        });
    }
}
