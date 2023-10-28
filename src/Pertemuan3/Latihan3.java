package Pertemuan3;

import javax.swing.*;
import java.awt.event.*;

public class Latihan3 extends JFrame {
    public Latihan3(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // berfungsi untuk membuat label input nama
        JLabel labelInput = new JLabel("Nama :");
        labelInput.setBounds(15, 40, 350, 10);
        // berfungsi untuk membuat textfield
        JTextField textField = new JTextField();
        textField.setBounds(15, 60, 350, 30);
        // berfungsi untuk membuat label input nomor hp
        JLabel labelInput2 = new JLabel("Nomor HP :");
        labelInput2.setBounds(15, 100, 350, 10);
        // berfungsi untuk membuat textfield
        JTextField textField2 = new JTextField();
        textField2.setBounds(15, 120, 350, 30);
        // berfungsi untuk membuat label jenis kelamin
        JLabel labelRadio = new JLabel("Jenis Kelamin :");
        labelRadio.setBounds(15, 140, 350, 10);
        // berfungsi untuk membuat radio button
        JRadioButton radio1 = new JRadioButton("Laki-laki");
        radio1.setBounds(15, 155, 350, 30);
        // berfungsi untuk membuat radio button
        JRadioButton radio2 = new JRadioButton("Perempuan");
        radio2.setBounds(15, 175, 350, 30);
        // berfungsi untuk membuat checkbox
        JCheckBox checkBox = new JCheckBox("Warga Negara Asing");
        checkBox.setBounds(15, 215, 350, 30);
        // berfungsi untuk membuat button
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

        // berfungsi untuk membuat button
        JButton button = new JButton("Simpan");
        button.setBounds(15, 240, 100, 40);
        // berfungsi untuk membuat textarea
        JTextArea txtOutput = new JTextArea();
        txtOutput.setBounds(15, 285, 350, 100);
        // berfungsi untuk ngecek apakah radio button atau checkbox sudah di klik
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = textField.getText();
                String no = textField2.getText();
                String jenisKelamin = "";
                if (radio1.isSelected()) {
                    jenisKelamin = "Laki-laki";
                } else if (radio2.isSelected()) {
                    jenisKelamin = "Perempuan";
                }
                String wargaNegara = "";
                if (checkBox.isSelected()) {
                    wargaNegara = "Warga Negara Asing";
                } else if (!checkBox.isSelected()) {
                wargaNegara = "Warga Negara Indonesia";
                }
                txtOutput.setText("Nama : " + nama + "\n" +
                        "Nomor Hp : " + no + "\n" +
                        "Jenis Kelamin : " + jenisKelamin + "\n" +
                        "Kewarganegaraan : " + wargaNegara + "\n" +
                        "============================================" );
            }
        });
        // berfungsi untuk menambahkan label input, textfield, label radio, radio button, checkbox, button,
        // dan textarea
        this.add(labelInput);
        this.add(labelInput2);
        this.add(textField);
        this.add(textField2);
        this.add(labelRadio);
        this.add(radio1);
        this.add(radio2);
        this.add(checkBox);
        this.add(button);
        this.add(txtOutput);
        // berfungsi untuk menentukan ukuran window
        this.setSize(400, 500);
        this.setLayout(null);
    }

    // berfungsi untuk menjalankan program
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                Latihan3 latihan3 = new Latihan3();
                latihan3.setVisible(true);
            }
        });
    }
}
