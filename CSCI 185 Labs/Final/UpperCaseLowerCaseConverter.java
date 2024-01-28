/* 
Guang Wei Too
Dr.Wenjia Li
CSCI 185 Fall 2021
November 23, 2021
*/

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class UpperCaseLowerCaseConverter extends JFrame {
public UpperCaseLowerCaseConverter(){
        setSize(300, 300);
        JPanel panelNorth= new JPanel();
        JPanel panelSouth= new JPanel();
        JPanel panelCenter= new JPanel();
        add(panelNorth, BorderLayout.NORTH);
	    add(panelSouth, BorderLayout.SOUTH);
        add(panelCenter, BorderLayout.CENTER);
        JButton upper= new JButton("Uppercase");
        JButton lower= new JButton("Lowercase");
        JButton clear= new JButton("Clear");
        panelNorth.add(upper);
        panelNorth.add(lower);
        panelNorth.add(clear);
        JTextArea textarea= new JTextArea();
        JTextField textfield=new JTextField(8);
        JLabel jlable=new JLabel("Enter Text");
        panelCenter.add(textarea);
        panelSouth.add(jlable);
        panelSouth.add(textfield);
        upper.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              String s1=textfield.getText();
              String c=s1.toUpperCase();
              textarea.setText(c); 
          }
        });
        lower.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              String s1=textfield.getText();
              String c=s1.toLowerCase();
              textarea.setText(c);
          }
        });
        clear.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
           textarea.setText("");
           textfield.setText("");
          }
        });
   }
  public static void main(String args[]){
       UpperCaseLowerCaseConverter b =new UpperCaseLowerCaseConverter();
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.setVisible(true);
    }
}
