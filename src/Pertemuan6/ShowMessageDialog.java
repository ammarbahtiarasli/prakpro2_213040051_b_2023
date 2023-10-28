package Pertemuan6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowMessageDialog extends JFrame {
    public ShowMessageDialog() {
        setTitle("Show Message Dialog Title");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JButton button = new JButton("confirm");
        button.setBounds(130, 100, 100, 40);

        JButton button2 = new JButton("error");
        button2.setBounds(130, 100, 100, 40);

        JButton button3 = new JButton("warning");
        button3.setBounds(130, 100, 100, 40);

        JButton button4 = new JButton("question");
        button3.setBounds(130, 100, 100, 40);

        JButton button5 = new JButton("plain");
        button3.setBounds(130, 100, 100, 40);


        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(ShowMessageDialog.this, "Apakah anda yakin ingin bayar praktikum lewat saku ?", "Pesan Penting", JOptionPane.YES_NO_OPTION);
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ShowMessageDialog.this, "Maaf, Saldo anda tidak mencukupi", "Pesan Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ShowMessageDialog.this, "Peringatan Bencana", "Pesan Error", JOptionPane.WARNING_MESSAGE);
            }
        });

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ShowMessageDialog.this, "Apakah anda yakin ingin bayar praktikum lewat saku ?", "Pesan Penting", JOptionPane.QUESTION_MESSAGE);
            }
        });

        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(ShowMessageDialog.this, "test", "Pesan", JOptionPane.PLAIN_MESSAGE);
            }
        });

        this.add(button);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.setSize(200, 200);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ShowMessageDialog helloMessageDialog = new ShowMessageDialog();
                helloMessageDialog.setVisible(true);
            }
        });
    }
}
