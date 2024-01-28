import javax.swing.*;

public class Cards{
	ImageIcon [] heart = new ImageIcon[13];
	ImageIcon [] diamond = new ImageIcon[13];
	ImageIcon [] spade = new ImageIcon[13];
	ImageIcon [] club = new ImageIcon[13];
	ImageIcon back=new ImageIcon(getClass().getClassLoader().getResource("card back red.png"));


public Cards() {
	try{
		// heart cards
		for(int i=1; i<13; i++) {
			heart[i]  = new ImageIcon(getClass().getClassLoader().getResource(i + "h.PNG"));
		}
	}catch(Exception e){
		System.out.println("heart Cards not found");
	}
	try{
        // diamond cards
		for(int i=1; i<13; i++) {
			diamond[i]  = new ImageIcon(getClass().getClassLoader().getResource(i + "d.PNG"));
		}
	}catch(Exception e){
		System.out.println("diamond Cards not found");
	}
	try{
        // spade cards
		for(int i=1; i<13; i++) {
			spade[i]  = new ImageIcon(getClass().getClassLoader().getResource(i + "s.PNG"));
		}
	}catch(Exception e){
		System.out.println("spade Cards not found");
	}
	try{
        // club cards
		for(int i=1; i<13; i++) {
			club[i]  = new ImageIcon(getClass().getClassLoader().getResource(i + "c.PNG"));
		}
	}catch(Exception e){
		System.out.println("club Cards not found");
	}
	//card values 2-10	 jqk
	//if(cardnumber>10){cardvalue=10}
}

}