import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class Card {
    //draw and set card a value
private int cardvalue;
private BufferedImage cardImage;

  public Card(int cv, BufferedImage card){
      this.cardvalue=cv;
      this.cardImage=card;
  }
  /*
  Card[]cards= new BufferedImage[13];
  public void readCard() throws IOException  {
    
      for(int i=1;i<14;i++){
        Card card[i]=new Card(12,ImageIO.read(new File("Clubs",i+".png")));
      }
      
  }
  */
  public int getCardvalue() {
      return cardvalue;
  }
  public BufferedImage getCardImage() {
      return cardImage;
  }
  public static void main(String[] args) throws IOException {
    Card card=new Card(12,ImageIO.read(new File("Clubs","12.png")));
      JFrame window=new JFrame("Card");
      window.setSize(400,600);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JPanel contentPane= new JPanel(new BorderLayout());
      JLabel cardJLabel=new JLabel(new ImageIcon(card.getCardImage()));
      cardJLabel.setSize(100,200);
      contentPane.add(cardJLabel);
      window.add(contentPane);
      window.setVisible(true);
      System.out.println(card.getCardvalue());
  }
}
