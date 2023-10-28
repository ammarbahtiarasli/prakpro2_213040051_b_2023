package Pertemuan6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloScrollPane extends JFrame {
    public HelloScrollPane () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel labelInput = new JLabel("Input Nama : ");
        labelInput.setBounds(130, 40, 100, 10);

        JTextField textField = new JTextField();
        textField.setBounds(130, 60, 100, 30);

        JButton button = new JButton("Klik");
        button.setBounds(130, 100, 100, 40);

        JTextArea txtOutput = new JTextArea("");
        JScrollPane scrolLableTextArea = new JScrollPane(txtOutput);
        scrolLableTextArea.setBounds(130, 150, 100, 100);
        scrolLableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrolLableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtOutput.append("Hello " + textField.getText() + "\n");
                textField.setText("");
            }
        });
        this.add(labelInput);
        this.add(textField);
        this.add(button);
        this.add(scrolLableTextArea);
        this.setSize(400, 500);
        this.setLayout(null);
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloScrollPane helloScrollPane = new HelloScrollPane();
                helloScrollPane.setVisible(true);
            }
        });
    }
}
