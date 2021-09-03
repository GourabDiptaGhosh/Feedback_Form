package com.company;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class MySlider extends JPanel implements ChangeListener {

    JLabel labelRating;
    JSlider slider;

    public MySlider(){
        setLayout(null);
        setBackground(Color.lightGray);
        setBounds(20, 325, 500, 140);

        JLabel textRating= new JLabel("Rate your experience at Xilinx (higher the better)");
        textRating.setBounds(30, 10, 450, 20);
        add(textRating);

        slider= new JSlider(0,10,5);
        labelRating= new JLabel();

        slider.setBounds(25,40,450,50);
        labelRating.setBounds(130,80,240,40);

        slider.setBackground(Color.lightGray);
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(1);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(2);
        slider.setPaintLabels(true);

        slider.setFont(new Font("MV Boli",Font.PLAIN,15));
        labelRating.setFont(new Font("MV Boli",Font.PLAIN,25));

        labelRating.setText("Chosen Rating: "+ slider.getValue());
        slider.addChangeListener(this);


        add(slider);
        add(labelRating);
    }

    @Override
    public void stateChanged(ChangeEvent e) {

        labelRating.setText("Chosen Rating: "+ slider.getValue());

    }
}
