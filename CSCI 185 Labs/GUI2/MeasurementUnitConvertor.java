/*
Guang Wei Too and Jonathan Urquia
Dr.Wenjia Li
CSCI 185 Fall 2021
11/27/2021
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeasurementUnitConvertor {
    private JTextField tf, tf2;
    private JLabel jl, jl2;
    private JFrame jf;
    private JPanel jp, jp2,jp3;


    public MeasurementUnitConvertor(){
        this.jf = new JFrame("Pounds to Kilograms Converter");
        jf.setSize(300,125);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Creating a panel
        this.jp = new JPanel();
        jp.setBackground(Color.blue);
      
        //Putting the Jpanel onto the JFrame
        jf.add(jp,BorderLayout.SOUTH);

        //Putting the 2 buttons onto JPanel
        JButton convertButton=new JButton("Convert");
        JButton clearButton=new JButton("Clear");
        jp.add(convertButton);
        jp.add(clearButton);
        
        //Creating a new panel
        jp2 = new JPanel(new GridLayout(2,2));

        //Creating a text field and label and adding it to Jpanel
        this.jl = new JLabel("Pounds:");
        this.tf = new JTextField(8);
        jp2.add(jl);
        jp2.add(tf);

        //Creating a text field and label and adding it to Jpanel
        this.jl2 = new JLabel("Kilograms:");
        this.tf2 = new JTextField(8);
        jp2.add(jl2);
        jp2.add(tf2);
        

        //Putting the Jpanel onto the JFrame
        jf.add(jp2,BorderLayout.CENTER);
        //Creating a new panel
        jp3 = new JPanel();
        jp3.setSize(100,100);
        jp3.setBackground(Color.black);
        //Putting the Jpanel onto the JFrame
        jf.add(jp3,BorderLayout.NORTH);
        //action adding
       
        convertButton.addActionListener(new ActionListener(){
            
            
            public void actionPerformed(ActionEvent e) {
                //tf2-kg//tf-lb
            try{
                  if(tf2.getText().length()==0){
                    String s1=tf.getText();
                    double lb=Double.parseDouble(s1);
                    double a=lb/2.205;
                    String c=Double.toString(a);
                    tf2.setText(c);
                }
               if(tf.getText().length()==0){
                    String s2=tf2.getText();
                    double kg=Double.parseDouble(s2);
                    double b=kg*2.205;
                    String d=Double.toString(b);
                    tf.setText(d);
                }
            }catch(NumberFormatException s){
                JOptionPane.showMessageDialog(null,"Invalid Input, Please enter a number!");
            }
            }
        });
        
        clearButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("");
                tf2.setText("");
                
            }
        });
    }
    public static void main(String[] args) {
        new MeasurementUnitConvertor();
    }
}