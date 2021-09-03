package com.company;

import javax.swing.*;
import java.awt.*;

public class Backend {
    JFrame frame= new JFrame();
    JTextArea text;
    JLabel label= new JLabel("Form Submitted");
    Backend(String finalText){
        text= new JTextArea(finalText);
        text.setBackground(Color.LIGHT_GRAY);
        text.setBounds(10,40,250,60);
        frame.add(text);

        //label.setFont();
        label.setBounds(10, 10, 200, 25);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.white);
        frame.setSize(280,150);
        frame.setLayout(null);
        frame.setResizable(false);
        //frame.pack();
        frame.setVisible(true);
    }
}
