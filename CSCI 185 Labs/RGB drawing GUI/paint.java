/*
Guang Wei Too and Jonathan Urquia
CSCI 185 Fall 2021
Dr.Wenjia Li
12/3/2021
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class paint extends JFrame implements MouseMotionListener{
    private Color color;

    public paint() {
        setTitle("Paint");
        setSize(600, 700);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //center panel as canvas
        JPanel p2= new JPanel();
        p2.setBackground(Color.white);
        add(p2,BorderLayout.CENTER);

        //buttons
        JPanel p1 = new JPanel();
        p1.setBackground(Color.white);
        p1.setLayout(new GridLayout(1, 5));
        JButton Green = new JButton("Green");
        JButton Red = new JButton("Red");
        JButton Blue = new JButton("Blue");
        JButton Eraser = new JButton("Eraser");
        JButton Clear = new JButton("Clear");

        //buttons onto panel
        p1.add(Green);
        p1.add(Red);
        p1.add(Blue);
        p1.add(Eraser);
        p1.add(Clear);

        //panel onto the frame
        add(p1, BorderLayout.SOUTH);

        addMouseMotionListener(this);

        //Action Listeners
        Green.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                color = Color.GREEN;
            }
        });

        Red.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                color= Color.RED;
            }
        });

        Blue.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                color=  Color.BLUE;
            }
        });

        Eraser.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                color=Color.white;
            }
        });

        Clear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               p2.updateUI();
            }
        });
    }

    // moving and dragging mouse
    public void mouseMoved(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(e.getX(),e.getY(),10,10);
    }

    public static void main(String[] args) {
        new paint();
    }
}