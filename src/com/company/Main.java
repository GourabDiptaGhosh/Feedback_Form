package com.company;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Main{

    public static void main(String[] args) {
	// write your code here
        //MyFrame frame= new MyFrame();

        /*
        String dates[]
                = { "1", "2", "3", "4", "5",
                "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15",
                "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25",
                "26", "27", "28", "29", "30",
                "31" };
        String months[]
                = { "Jan", "feb", "Mar", "Apr",
                "May", "Jun", "July", "Aug",
                "Sep", "Oct", "Nov", "Dec" };
        String years[]
                = { "2000", "2001", "2002",
                "2003", "2004", "2005", "2006",
                "2007", "2008", "2009", "2010",
                "2011", "2012", "2013", "2014",
                "2015", "2016", "2017", "2018",
                "2019", "2020", "2021"};

        ///////////////////////////////////////////////////////////////////////////////////////////////
        MyPanel panel1= new MyPanel();
        panel1.setLayout(null);
        panel1.setBackground(Color.red);
        panel1.setBounds(20, 500, 50);
        JLabel labelHeading= new JLabel("FeedBack Form");
        labelHeading.setBounds(30, 0, 300, 50);
        labelHeading.setFont(new Font("MV Boli", Font.PLAIN, 20));
        panel1.add(labelHeading);

        /////////////////////////////////////////////////////////////////////////////////////////////
        MyPanel panel2= new MyPanel();
        panel2.setLayout(null);
        panel2.setBackground(Color.blue);
        panel2.setBounds(20, 500, 75);

        JLabel labelName= new JLabel("Employee Name"); // Text Field
        labelName.setBounds(30, 10, 300, 20);
        JTextField getName= new JTextField();
        getName.setBounds(30, 35, 300, 30);
        getName.setBackground(Color.blue);
        getName.setBorder(null);
        panel2.add(labelName);
        panel2.add(getName);

        ////////////////////////////////////////////////////////////////////////////////////////////
        MyPanel panel4= new MyPanel();
        panel4.setLayout(null);
        panel4.setBackground(Color.yellow);
        panel4.setBounds(20, 500, 75);

        JLabel labelGender= new JLabel("Gender");
        labelGender.setBounds(30, 10, 300, 20);
        panel4.add(labelGender);

        JRadioButton male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(false);
        male.setBounds(30, 40, 60, 20);
        panel4.add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setBounds(120, 40, 80, 20);
        panel4.add(female);

        JRadioButton undisclosed = new JRadioButton("Prefer not to say");
        undisclosed.setFont(new Font("Arial", Font.PLAIN, 15));
        undisclosed.setSelected(false);
        undisclosed.setBounds(230, 40, 150, 20);
        panel4.add(undisclosed);

        ButtonGroup groupGender= new ButtonGroup();
        groupGender.add(male);
        groupGender.add(female);
        groupGender.add(undisclosed);

        ////////////////////////////////////////////////////////////////////////////////////////////
        MyPanel panel3= new MyPanel();
        panel3.setLayout(null);
        panel3.setBackground(Color.green);
        panel3.setBounds(20, 500, 75);

        JLabel joiningDate= new JLabel("Xilinx Joining Date"); // Text Field
        joiningDate.setBounds(30, 10, 300, 20);
        panel3.add(joiningDate);

        JComboBox date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setBounds(30, 40, 60, 20);
        panel3.add(date);

        JComboBox month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setBounds(95, 40, 80, 20);
        panel3.add(month);

        JComboBox year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setBounds(180, 40, 80, 20);
        panel3.add(year);

        //////////////////////////////////////////////////////////////////////////////////////////////
        /*MyPanel panel4= new MyPanel();
        panel4.setLayout(null);
        panel4.setBackground(Color.MAGENTA);
        panel4.setBounds(20, 500, 120);

        JLabel labelRating= new JLabel("Rate your experience at Xilinx (higher the better)");
        labelRating.setBounds(30, 10, 450, 20);
        panel4.add(labelRating);*/

        /*JRadioButton rating1= new JRadioButton("1");
        rating1.setBounds(30, 40, 20, 20);
        panel4.add(rating1);
        JRadioButton rating2= new JRadioButton("2");
        panel4.add(rating1);
        JRadioButton rating3= new JRadioButton("3");
        panel4.add(rating1);
        JRadioButton rating4= new JRadioButton("4");
        panel4.add(rating1);
        JRadioButton rating5= new JRadioButton("5");
        panel4.add(rating1);*/

        /*JSlider slider= new JSlider(0,10,7);
        JLabel label= new JLabel();
        slider.setBounds(30, 40, 200, 50);
        slider.setBackground(Color.magenta);
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(1);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(2);
        slider.setPaintLabels(true);
        panel4.add(slider);*/

        //MySlider slide= new MySlider();
        //slide.setMinimum(0);
        //slide.setMaximum(10);
        //slide.setValue(7);
        //slide.setBounds(30, 40, 200, 50);
        /*slide.setPaintTicks(true);
        slide.setMinorTickSpacing(1);
        slide.setPaintTrack(true);
        slide.setMajorTickSpacing(2);
        slide.setPaintLabels(true);*/


        //MyPanel checking= new MyPanel();
        //panel4.add(new MySlider());
        MyFrame frame= new MyFrame();
        /*
        MySlider panel5= new MySlider();
        /////////////////////////////////////////////////////////////////////////////////////////////
        MyFrame frame= new MyFrame();

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel4);
        frame.add(panel3);
        //frame.add(panel4);
        frame.add(panel5);
        */
        //JButton submitButton= new JButton();


    }
}
