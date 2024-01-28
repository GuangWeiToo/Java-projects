/* 
Guang Wei Too
Dr.Wenjia Li
CSCI 185 Fall 2021
November 23, 2021
*/
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class UpperCaseLowerCaseConverter extends JFrame {
public UpperCaseLowerCaseConverter(String name){
  super(name);
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
   }
  public static void main(String args[]){
       UpperCaseLowerCaseConverter b =new UpperCaseLowerCaseConverter("BorderLayout Example");
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.setVisible(true);
    }
}
