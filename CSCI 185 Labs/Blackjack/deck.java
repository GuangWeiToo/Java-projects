import javax.swing.ImageIcon;

public class deck{
    ImageIcon[] allCards;
    int[] cardValues;
deck(){
    ImageIcon[]allCards= new ImageIcon[52];
    for(int i=0;i<allCards.length;i++){
      allCards[i]= new ImageIcon(getClass().getClassLoader().getResource(i+".png"));
    }
    
}

}