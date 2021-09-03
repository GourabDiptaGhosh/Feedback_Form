package com.company;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    static int heightAccumulator= 10;

    public void setBounds(int x, int width, int height) {
        super.setBounds(x, heightAccumulator, width, height);
        heightAccumulator+= height;
        heightAccumulator+= 10; //for spacing
    }

    public void setBackground(Color bg) {
        super.setBackground(bg);
    }

}
