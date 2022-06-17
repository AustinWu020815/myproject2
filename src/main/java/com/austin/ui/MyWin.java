package com.austin.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(500,300);
        frame.setLocation(700,400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button = new JButton("OK");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("WoW");
            }
        });
    //    MyActionListener listener = new MyActionListener();
    //    button.addActionListener(listener);
        //Layout
        //frame.setLayout(new BorderLayout());
        frame.setLayout(new FlowLayout());
        frame.add(button);

        frame.setVisible(true);
        System.out.println("END?");
    }
}
