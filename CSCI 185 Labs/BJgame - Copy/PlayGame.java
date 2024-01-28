/*
Jonathan Urquia, Guang Wei Too, Gurpinder Singh
Dr.Wenjia Li
Fall 2021 CSCI 185
12/19/2021
*/
import javax.swing.*;
import java.awt.event.*;

public class PlayGame {
    int money=900;
    int userAmount;
    public Hand player;
    public Hand dealer;
    public Deck deck;
    public BlackJack display;

    public PlayGame() {
        display = new BlackJack();
        display.play(new PlayAction());
        display.hit(new HitAction());
        display.stand(new StandAction());
        display.setBetArea(String.valueOf(money));
        display.playButton();
    }

    class PlayAction implements ActionListener {
        public boolean makeBet() {
            String userAmountString = display.getAmount();

            try {
                userAmount = Integer.parseInt(userAmountString);
            }

            catch (NumberFormatException s) {
                JOptionPane.showMessageDialog(null,"Please enter a whole number");
                return false;
            }

            if (userAmount > money) {
                JOptionPane.showMessageDialog(null, "Not enough money to play");
                return false;
            }
            else if (userAmount <= 0) {
                JOptionPane.showMessageDialog(null, "Please enter a positive amount");
                return false;
            }
            else {
                money = money - userAmount;
                display.setBetArea(String.valueOf(money));
                return true;
            }
        }

        public void actionPerformed(ActionEvent e) {
            boolean success = makeBet();
                if (success) {
                    deck = new Deck();
                    deck.shuffle();
                    player = new Hand();
                    dealer = new Hand();
                    player.add(deck.nextCard());
                    dealer.add(deck.nextCard());
                    player.add(deck.nextCard());
                    dealer.add(deck.nextCard());
                    display.playerHand(player);
                    display.dealerCard(dealer.getTopCard());
                    if (!player.hasBlackJack() && !dealer.hasBlackJack() && !player.isBusted()) {
                        display.hitAndStandButton();
                    }
                    if (player.hasBlackJack() || dealer.hasBlackJack() || player.isBusted()) {
                        finishGame();
                    }
                }
            }
        }

    class HitAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (!player.isBusted() && player.totalValue() != 21) {
                player.add(deck.nextCard());
                display.playerHand(player);
            }
            if (player.isBusted() || player.totalValue() == 21) {
                finishGame();
            }
        }
    }

    class StandAction implements ActionListener{
        public void actionPerformed (ActionEvent e) {

            finishGame();
        }
    }
    private void finishGame(){
        if(player.hasBlackJack()){
            display.dealerHand(dealer);
            display.playerHand(player);
            display.outcome("You have blackjack you  win!!!");
             money += userAmount * 2 ;
        }


        else if (dealer.hasBlackJack() && player.hasBlackJack()){
            display.dealerHand(dealer);
            display.playerHand(player);
            display.outcome("Dealer and player tie");
            money += userAmount;
        }


        else if(dealer.hasBlackJack()){
            display.dealerHand(dealer);
            display.playerHand(player);
            display.outcome("Dealer has black jack they win");
        }

        else if (player.isBusted()){
            display.dealerHand(dealer);
            display.playerHand(player);
            display.outcome("You busted!!");
        }


        else {
            while( dealer.totalValue()<17 && !dealer.isBusted() ){
                dealer.add(deck.nextCard());
            }

            if(dealer.isBusted())
            {display.dealerHand(dealer);
                display.playerHand(player);
                display.outcome("You win!!");
                money += userAmount * 2;
            }

            else if (dealer.hasBlackJack()){
                display.dealerHand(dealer);
                display.playerHand(player);
                display.outcome("You lose");
            }

            else if (dealer.totalValue() == player.totalValue())
            {display.dealerHand(dealer);
                display.playerHand(player);
                display.outcome("Dealer and player tie");
                money += userAmount;
            }

            else if (dealer.totalValue() > player.totalValue()){
                display.dealerHand(dealer);
                display.playerHand(player);
                display.outcome("You lose");
            }

            else if (player.totalValue() > dealer.totalValue()){
                display.dealerHand(dealer);
                display.playerHand(player);
                display.outcome("You win!!");
                money += userAmount * 2;
            }

        }
        display.setBetArea(String.valueOf(money));
        display.playButton();
    }
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "Welcome to BlackJack!");

        JOptionPane.showMessageDialog(null, "To start game enter a number into bet amount");
        new PlayGame();
    }

}
