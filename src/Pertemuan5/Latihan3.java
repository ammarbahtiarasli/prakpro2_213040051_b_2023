package Pertemuan5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Latihan3 extends JFrame{
    public Latihan3() { // constructor
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close ketika di close

        JLabel headerLabel = new JLabel("Form Biodata:", JLabel.CENTER); // membuat label
        JPanel panel = new JPanel(); // membuat panel
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel inputNama = new JLabel("Nama : "); // membuat label
        JTextField fieldNama = new JTextField(5); // membuat text field
        JLabel inputNoTelp = new JLabel("Nomor HP : ");
        JTextField fieldNoTelp = new JTextField(5);
        JLabel inputJenisKelamin = new JLabel("Jenis Kelamin : ");
        JRadioButton radioLaki = new JRadioButton("Laki-laki"); // membuat radio button
        JRadioButton radioPerempuan = new JRadioButton("Perempuan");
        JCheckBox checkWNA = new JCheckBox("Warga Negara Asing"); // membuat checkbox
        JButton buttonSimpan = new JButton("Simpan"); // membuat button
        JTextArea txtOuput = new JTextArea(10, 5); // membuat text area

        gbc.fill = GridBagConstraints.HORIZONTAL; // set fill
        gbc.gridx = 0; // set gridx
        gbc.gridy = 0; // set gridy
        panel.add(inputNama, gbc); // menambahkan label

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(fieldNama, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(inputNoTelp, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(fieldNoTelp, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(inputJenisKelamin, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(radioLaki, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(radioPerempuan, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(checkWNA, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        panel.add(buttonSimpan, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        panel.add(txtOuput, gbc);

        // Mengatur layout frame
        this.setLayout(new GridLayout(2, 1)); // membuat layout
        this.add(headerLabel);
        this.add(panel);
        this.setSize(600, 600); // ukuran window

        // Mengatur event untuk button simpan
        buttonSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = fieldNama.getText(); // Mengambil text dari text field
                String noTelp = fieldNoTelp.getText();
                String jenisKelamin = "";
                if (radioLaki.isSelected()) { // Jika radio button laki-laki dipilih
                    jenisKelamin = "Laki-laki";
                } else if (radioPerempuan.isSelected()) { // Jika radio button perempuan dipilih
                    jenisKelamin = "Perempuan";
                }
                String wna = checkWNA.isSelected() ? "Ya" : "Bukan"; // Jika checkbox dipilih
                String hasil = "Nama : " + nama + "\n" +
                        "Nomor HP : " + noTelp + "\n" +
                        "Jenis Kelamin : " + jenisKelamin + "\n" +
                        "Kewarganegaraan : " + wna + "\n" +
                        "============================================ \n";
                txtOuput.setText(hasil); // Menampilkan hasil ke text area
            }
        });
    }

    public static void main(String[] args) { // main method
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                Latihan3 latihan3 = new Latihan3();
                latihan3.setVisible(true);
            }
        });
    }
}
