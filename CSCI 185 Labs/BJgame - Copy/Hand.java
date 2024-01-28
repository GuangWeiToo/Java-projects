/*
Jonathan Urquia, Guang Wei Too, Gurpinder Singh
Dr.Wenjia Li
Fall 2021 CSCI 185
12/19/2021
*/
public class Hand{
    public int count = 0;
    private Card[] Hand;
    public Hand() {
        Hand = new Card[20];
    }
    public void add(Card card){
        Hand[count++] = card;
    }
    public Card getTopCard(){
        return Hand[0];
    }
    public int totalValue(){
        int sum=0;
        int cardvalue;
        int count2= count;
        int aces = 0;
        for(int i=0; i< count2; i++){
            cardvalue = Hand[i].totalValue();
            sum += cardvalue;
            if( cardvalue == 11){
                aces++;
            }
        }
        while (aces > 0 && sum >21){
            sum -= 10;
            aces--;
        }
        return sum;
    }
    public boolean hasBlackJack(){
        int total = Hand[0].totalValue() + Hand[1].totalValue();
        return total ==21;
    }

    public boolean isBusted(){
        return totalValue() > 21;
    }
    public String toString(){
        String string ="";
        int count3 = count;
        for(int i=0; i< count3; i++){
            string += Hand[i].toString();
            string += " ";
        }
        return string;
    }
}


