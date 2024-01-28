import javax.swing.*;

public class Tester {
        public static void main(String args[])
    {
    JFrame frame = new JFrame();

    final int FRAME_WIDTH = 300;
    final int FRAME_HEIGHT = 400;

 frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// final SelectionSortComponent component = new SelectionSortComponent();
 //frame.add(component, BorderLayout.CENTER);
 frame.setVisible(true);

 
        Sorter myAnimation5=new Sorter();
        Sorter myAnimation4=new Sorter();
        Sorter myAnimation3=new Sorter();
        Sorter myAnimation2=new Sorter();
        Sorter myAnimation1=new Sorter();

        myAnimation1.run();
        myAnimation2.run();
        myAnimation3.run();
        myAnimation4.run();
        myAnimation5.run();
    }

    
}
