package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    JButton submitButton;
    JTextField getName;
    JRadioButton male, female, undisclosed;
    JComboBox date, month, year;
    MySlider panel5;

    MyFrame(){

        submitButton= new JButton();
        submitButton.setBounds(20, 490, 100, 30);
        submitButton.addActionListener(this);
        submitButton.setText("Submit"); // text showed inside the button
        submitButton.setFocusable(false); //gets rid of the border around the button text
        submitButton.setBackground(Color.cyan);

        this.setTitle("User Feedback Form");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(550,575);
        //this.setVisible(true);
        this.add(submitButton);

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
        panel1.setBackground(Color.lightGray);
        panel1.setBounds(20, 500, 50);
        JLabel labelHeading= new JLabel("FeedBack Form");
        labelHeading.setBounds(30, 0, 300, 50);
        labelHeading.setFont(new Font("MV Boli", Font.PLAIN, 20));
        panel1.add(labelHeading);

        /////////////////////////////////////////////////////////////////////////////////////////////
        MyPanel panel2= new MyPanel();
        panel2.setLayout(null);
        panel2.setBackground(Color.lightGray);
        panel2.setBounds(20, 500, 75);

        JLabel labelName= new JLabel("Employee Name"); // Text Field
        labelName.setBounds(30, 10, 300, 20);
        getName= new JTextField();
        getName.setBounds(30, 35, 300, 30);
        getName.setBackground(Color.lightGray);
        getName.setBorder(null);
        panel2.add(labelName);
        panel2.add(getName);

        ////////////////////////////////////////////////////////////////////////////////////////////
        MyPanel panel4= new MyPanel();
        panel4.setLayout(null);
        panel4.setBackground(Color.lightGray);
        panel4.setBounds(20, 500, 75);

        JLabel labelGender= new JLabel("Gender");
        labelGender.setBounds(30, 10, 300, 20);
        panel4.add(labelGender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(false);
        male.setBounds(30, 40, 60, 20);
        panel4.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setBounds(120, 40, 80, 20);
        panel4.add(female);

        undisclosed = new JRadioButton("Prefer not to say");
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
        panel3.setBackground(Color.lightGray);
        panel3.setBounds(20, 500, 75);

        JLabel joiningDate= new JLabel("Xilinx Joining Date"); // Text Field
        joiningDate.setBounds(30, 10, 300, 20);
        panel3.add(joiningDate);

        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setBounds(30, 40, 60, 20);
        panel3.add(date);

        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setBounds(95, 40, 80, 20);
        panel3.add(month);

        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setBounds(180, 40, 80, 20);
        panel3.add(year);

        //////////////////////////////////////////////////////////////////////////////////////////////
        panel5= new MySlider();

        add(panel1);
        add(panel2);
        add(panel4);
        add(panel3);
        add(panel5);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton)
        {
            //Write the code to show a progress bar followed by the entered details in core java
            System.out.println("Form Submitted");

            String data1;
            String data = "Name : " + getName.getText() + "\n";
            if (male.isSelected())
                data1 = "Gender : Male" + "\n";
            else if(female.isSelected())
                data1 = "Gender : Female" + "\n";
            else
                data1= "Gender : Undisclosed" + "\n";
            String data2 = "Joining Date : " + (String)date.getSelectedItem() + "/" + (String)month.getSelectedItem() + "/" + (String)year.getSelectedItem() + "\n";

            String data3 = "Rating : " + panel5.slider.getValue();
            String finalText=data + data1 + data2 + data3;
            //tout.setText(data + data1 + data2 + data3);
            /*tout.setText(data + data1 + data2);

            tout.setEditable(false);
            res.setText("Registration Successfully..");*/

            //System.out.println(finalText);

            this.dispose();
            Backend userData= new Backend(finalText);

            submitButton.setEnabled(false); // Putting it at the end makes the button clickable only once
        }
    }
}
