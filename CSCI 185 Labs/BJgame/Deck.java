import java.util.*;

public class Deck{
    private Card[] Deck = new Card[52];
    private int index = 0;

    public Deck() {
        int index2 = 0;
        for(int i =0; i<4; i++){
            for(int j=0; j<13; j++){
                Card a = new Card(i,j);
                Deck[index2] = a;
                index2++;
            }
        }
    }
    public void shuffle(){
        index = 0;
        int shuffleAmount=0;
        while (shuffleAmount<1000){
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
        if(index<52){
            index++;
            return Deck[index-1];

        }
        else{
            return null;
        }
    }
}