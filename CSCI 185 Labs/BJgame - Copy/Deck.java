
import java.util.*;

public class Deck{
    private Card[] Deck = new Card[52];
    private int cardAmount = 0;

    public Deck() {
        int cardAmount2 = 0;
        for(int i =0; i<4; i++){
            for(int j=0; j<13; j++){
                Card a = new Card(i,j);
                Deck[cardAmount2] = a;
                cardAmount2++;
            }
        }
    }

    public void shuffle(){
        cardAmount = 0;
        int shuffleAmount=0;
        while (shuffleAmount<900){
            Random rand = new Random();
            int x= rand.nextInt(52);
            int y= rand.nextInt(52);
            Card stored = Deck[x];
            Deck[x] = Deck[y];
            Deck[y] = stored;
            shuffleAmount++;
        }
    }

    public Card nextCard(){
        if(cardAmount<52){
            cardAmount++;
            return Deck[cardAmount-1];

        }
        else{
            return null;
        }
    }
}