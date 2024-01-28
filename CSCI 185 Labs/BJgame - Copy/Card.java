/*
Jonathan Urquia, Guang Wei Too, Gurpinder Singh
Dr.Wenjia Li
Fall 2021 CSCI 185
12/19/2021
*/

public class Card {
    private int cardsuit;
    private int cardvalue;
    private String[] suits = {"♥", "♠", "♦", "♣"};
    private String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public Card(int suit, int rank){
        this.cardsuit = suit;
        this.cardvalue = rank;
    }
    public int totalValue(){
        if (this.cardvalue ==0){
            return 11;
        }
        if (this.cardvalue < 10){
            return cardvalue + 1;
        }
        if(this.cardvalue >=10){
            return 10;
        }
        else{
            return 0;
        }
    }
    public String toString(){
        return  "["+suits[this.cardsuit] + values[this.cardvalue]+"]" ;
    }
    }
