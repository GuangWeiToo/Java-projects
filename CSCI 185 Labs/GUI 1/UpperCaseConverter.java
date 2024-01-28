/*
Guang Wei Too
Dr.Wenjia Li
CSCI 185 Fall 2021
November 18,2021
*/ 

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

public class UpperCaseConverter extends JFrame {
  public UpperCaseConverter() {
    // Get the content pane of the frame
    Container container = getContentPane();

    // Set FlowLayout, aligned left with horizontal gap 10
    // and vertical gap 20 between components
    container.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

    // Add buttons to the frame
      container.add(new JButton("Uppercase "));
      container.add(new JButton("Lowercase "));
      container.add(new JButton("Clear "));
    //set text area
    JTextArea textdisplay= new JTextArea();
    textdisplay.setEditable(false);
    add(textdisplay,BorderLayout.CENTER);
    //Add field label and text

    container.add(new JLabel ("Enter text"),BorderLayout.SOUTH);
    container.add(new JTextField(8),BorderLayout.SOUTH);
  }

  /** Main method */
  public static void main(String[] args) {
    UpperCaseConverter frame = new UpperCaseConverter();
    frame.setTitle("Upper and Lower case converter");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 300);
    frame.setVisible(true);
  }
}

