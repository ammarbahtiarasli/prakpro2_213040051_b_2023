package Pertemuan3;

import javax.swing.*;
import java.awt.event.*;
public class HelloRadioButton extends JFrame {
    public HelloRadioButton(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelInput = new JLabel("Nama :");
        labelInput.setBounds(15, 40, 350, 10);

        JTextField textField = new JTextField();
        textField.setBounds(15, 60, 350, 30);

        JLabel labelRadio = new JLabel("Jenis Member :");
        labelRadio.setBounds(15, 100, 350, 10);

        JRadioButton radio1 = new JRadioButton("Premium");
        radio1.setBounds(15, 115, 350, 30);

        JRadioButton radio2 = new JRadioButton("Gold");
        radio2.setBounds(15, 145, 350, 30);

        JRadioButton radio3 = new JRadioButton("Silver");
        radio3.setBounds(15, 175, 350, 30);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);

        JButton button = new JButton("Simpan");
        button.setBounds(15, 205, 100, 40);

        JTextArea txtOutput = new JTextArea();
        txtOutput.setBounds(15, 250, 350, 100);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = textField.getText();
                String jenisMember = "";
                if (radio1.isSelected()) {
                    jenisMember = "Premium";
                } else if (radio2.isSelected()) {
                    jenisMember = "Gold";
                } else if (radio3.isSelected()) {
                    jenisMember = "Silver";
                }
                txtOutput.setText("Nama : " + nama + "\nJenis Member : " + jenisMember);
            }
        });

        this.add(labelInput);
        this.add(textField);
        this.add(labelRadio);
        this.add(radio1);
        this.add(radio2);
        this.add(radio3);
        this.add(button);
        this.add(txtOutput);

        this.setSize(400, 500);
        this.setLayout(null);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloRadioButton helloRadioButton = new HelloRadioButton();
                helloRadioButton.setVisible(true);
            }
        });
    }
}
