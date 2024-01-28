import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ImgAnimation extends JFrame implements Runnable{

JLabel text= new JLabel("");
static int winningCar=0;
boolean winner=false;
JProgressBar car =new JProgressBar(0,100);

public ImgAnimation(){
    setTitle("Car Race Program");
    setSize(900, 600);
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

JPanel Title= new JPanel();
add(Title,BorderLayout.NORTH);
text.setText("Race Cars ready?");
text.setForeground(Color.red);
Title.add(text);
JPanel window= new JPanel();
add(window,BorderLayout.CENTER);
JPanel Buttons=new JPanel();
add(Buttons,BorderLayout.SOUTH);
JButton play=new JButton("Play");
JButton reset=new JButton("Reset");
Buttons.add(play);
Buttons.add(reset);
//play button logic
play.addActionListener(new ActionListener(){         
    public void actionPerformed(ActionEvent e) {
    try{
            text.setForeground(Color.GREEN);
            text.setText("Go!");
            run();
               

    }catch(NumberFormatException s){
        JOptionPane.showMessageDialog(null,"Something went wrong...");
    }
    }
});
}

public void run(){
    Long min=1L;
    Long max=10L;
    for(int i=0; i<101; i++){
        if(winner){
            break;
        }
    //System.out.print("\n"+"Car Number "+i);
   car.setValue(i);
   car.repaint();
    if(i==100){
        winningCar=1;
        finish(i);
    }
    try {
        Long number = min + (long) (Math.random() * (max-min));
        Thread.sleep(number);
    } catch (InterruptedException e) {}
    }


}
public synchronized void finish(int i){

}


}

/* https://www.youtube.com/watch?v=8SkzzpJ2gkU&t=3s */