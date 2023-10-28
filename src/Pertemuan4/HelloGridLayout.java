package Pertemuan4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloGridLayout extends JFrame implements ActionListener {
    // berfungsi untuk membuat button
    private JButton buttonA, buttonB, buttonC, buttonD, buttonE, buttonF, buttonG, buttonH, buttonI;
    // berfungsi untuk membuat array button
    private JButton[] buttons;
    // berfungsi untuk membuat boolean
    private boolean gameOver;

    // berfungsi untuk membuat HelloGridLayout
    public HelloGridLayout() {
        // berfungsi untuk menutup program
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // berfungsi untuk membuat boolean false
        gameOver = false;

        // berfungsi untuk membuat button
        buttonA = new JButton("");
        buttonB = new JButton("");
        buttonC = new JButton("");
        buttonD = new JButton("");
        buttonE = new JButton("");
        buttonF = new JButton("");
        buttonG = new JButton("");
        buttonH = new JButton("");
        buttonI = new JButton("");
        buttons = new JButton[9];
        buttons[0] = buttonA;
        buttons[1] = buttonB;
        buttons[2] = buttonC;
        buttons[3] = buttonD;
        buttons[4] = buttonE;
        buttons[5] = buttonF;
        buttons[6] = buttonG;
        buttons[7] = buttonH;
        buttons[8] = buttonI;

        // berfungsi untuk membuat button action
        buttonA.addActionListener(this);
        buttonB.addActionListener(this);
        buttonC.addActionListener(this);
        buttonD.addActionListener(this);
        buttonE.addActionListener(this);
        buttonF.addActionListener(this);
        buttonG.addActionListener(this);
        buttonH.addActionListener(this);
        buttonI.addActionListener(this);

        // berfungsi untuk menambahkan button
        this.setLayout(new GridLayout(3, 3));
        this.add(buttonA);
        this.add(buttonB);
        this.add(buttonC);
        this.add(buttonD);
        this.add(buttonE);
        this.add(buttonF);
        this.add(buttonG);
        this.add(buttonH);
        this.add(buttonI);

        // berfungsi untuk menampilkan frame
        this.setSize(300, 300);
    }

    // berfungsi untuk menjalankan program
    public void actionPerformed(ActionEvent e) {
        if (!gameOver) {
            JButton button = (JButton) e.getSource();
            if (button.getText().isEmpty()) {
                button.setText("O");
                checkWinner();
                if (!gameOver) {
                    for (int i = 0; i < buttons.length; i++) {
                        if (buttons[i].getText().isEmpty()) {
                            buttons[i].setText("X");
                            break;
                        }
                        checkWinner();
                    }
                }
            }
        }
    }

    // berfungsi untuk mengecek pemenang
    public void checkWinner()
    {
        String winner = "";
        if (!buttonA.getText().isEmpty()
                && buttonA.getText().equals(buttonB.getText())
                && buttonA.getText().equals(buttonC.getText()))
        {
            winner =buttonA.getText();
            buttonA.setForeground(Color.RED);
            buttonB.setForeground(Color.RED);
            buttonC.setForeground(Color.RED);
        } else if (!buttonD.getText().isEmpty()
                && buttonD.getText().equals(buttonE.getText())
                && buttonD.getText().equals(buttonF.getText()))
        {
            winner = buttonD.getText();
            buttonD.setForeground(Color.RED);
            buttonE.setForeground(Color.RED);
            buttonF.setForeground(Color.RED);
        } else if (!buttonG.getText().isEmpty()
                && buttonG.getText().equals(buttonH.getText())
                && buttonG.getText().equals(buttonI.getText()))
        {
            winner = buttonG.getText();
            buttonG.setForeground(Color.RED);
            buttonH.setForeground(Color.RED);
            buttonI.setForeground(Color.RED);
        } else if (!buttonA.getText().isEmpty()
                && buttonA.getText().equals(buttonD.getText())
                && buttonA.getText().equals(buttonG.getText()))
        {
            winner = buttonA.getText();
            buttonA.setForeground(Color.RED);
            buttonD.setForeground(Color.RED);
            buttonG.setForeground(Color.RED);
        } else if (!buttonB.getText().isEmpty()
                && buttonB.getText().equals(buttonE.getText())
                && buttonB.getText().equals(buttonH.getText()))
        {
            winner = buttonB.getText();
            buttonB.setForeground(Color.RED);
            buttonE.setForeground(Color.RED);
            buttonH.setForeground(Color.RED);
        } else if (!buttonC.getText().isEmpty()
                && buttonC.getText().equals(buttonF.getText())
                && buttonC.getText().equals(buttonI.getText()))
        {
            winner = buttonC.getText();
            buttonC.setForeground(Color.RED);
            buttonF.setForeground(Color.RED);
            buttonI.setForeground(Color.RED);
        } else if (!buttonA.getText().isEmpty()
                && buttonA.getText().equals(buttonE.getText())
                && buttonA.getText().equals(buttonI.getText()))
        {
            winner = buttonA.getText();
            buttonA.setForeground(Color.RED);
            buttonE.setForeground(Color.RED);
            buttonI.setForeground(Color.RED);
        } else if (!buttonC.getText().isEmpty()
                && buttonC.getText().equals(buttonE.getText())
                && buttonC.getText().equals(buttonG.getText()))
        {
            winner = buttonC.getText();
            buttonC.setForeground(Color.RED);
            buttonE.setForeground(Color.RED);
            buttonG.setForeground(Color.RED);
        }

        gameOver = !winner.isEmpty();
    }

    // berfungsi untuk menjalankan program
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                HelloGridLayout helloGridLayout = new HelloGridLayout();
                helloGridLayout.setVisible(true);
            }
        });
    }
}
