package com.austin.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    JButton button  = new JButton("Hallo!");
    JLabel label = new JLabel("WoW");
    JTextField number = new JTextField(7);
    public GuessFrame(){
        super();
        setSize(300,200);
        setLocation(650,450);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num = Integer.parseInt(number.getText());
                System.out.println(number);
               // System.out.println("Hi");
               // label.setText("Hi");
            }
        });
        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        setVisible(true);
    }

    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
    }
}
