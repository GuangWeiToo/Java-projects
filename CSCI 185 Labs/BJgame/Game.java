import java.awt.event.*;

public class Game {
    public Hand player;
    public Hand dealer;
    public Deck deck;
    public BlackJack display;

    public Game(){
        display =  new BlackJack();
        display.setPlayAction(new PlayAction());
        display.setHitAction(new HitAction());
        display.setStandAction(new StandAction());
        display.enablePlayButton();
    }

    class PlayAction implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            deck = new Deck();
            deck.shuffle();
            player = new Hand();
            dealer = new Hand();
            player.add(deck.nextCard());
            dealer.add(deck.nextCard());
            player.add(deck.nextCard());
            dealer.add(deck.nextCard());
            display.displayPlayer(player);
            display.displayDealerCard(dealer.getTopCard());
            if(!player.hasBlackJack() && !dealer.hasBlackJack() && !player.isBusted()){
                display.enableHitAndStandButtons();}
            if(player.hasBlackJack() || dealer.hasBlackJack() || player.isBusted()){
                finishGame();
            }
        }
    }

    class HitAction implements ActionListener{
        public void actionPerformed (ActionEvent e) {

            if(!player.isBusted() && player.valueOf() !=21){
                player.add(deck.nextCard());
                display.displayPlayer(player);
            }
            if(player.isBusted() || player.valueOf()==21){
                finishGame();}
        }
    }
    class StandAction implements ActionListener{
        public void actionPerformed (ActionEvent e) {

            finishGame();
        }
    }
    private void finishGame(){
        if(player.hasBlackJack()){
            display.displayDealer(dealer);
            display.displayPlayer(player);
            display.displayOutcome("You have blackjack you  win!!!");}
        else if (dealer.hasBlackJack() && player.hasBlackJack()){
            display.displayDealer(dealer);
            display.displayPlayer(player);
            display.displayOutcome("Dealer and player tie");}
        else if(dealer.hasBlackJack()){
            display.displayDealer(dealer);
            display.displayPlayer(player);
            display.displayOutcome("Dealer has black jack they win");}
        else if (player.isBusted()){
            display.displayDealer(dealer);
            display.displayPlayer(player);
            display.displayOutcome("You lose");}
        else {
            while( dealer.valueOf()<17 && !dealer.isBusted() ){
                dealer.add(deck.nextCard());
            }
            if(dealer.isBusted())
            {display.displayDealer(dealer);
                display.displayPlayer(player);
                display.displayOutcome("You win!!");}
            else if (dealer.hasBlackJack()){
                display.displayDealer(dealer);
                display.displayPlayer(player);
                display.displayOutcome("You lose");
            }
            else if (dealer.valueOf() == player.valueOf())
            {display.displayDealer(dealer);
                display.displayPlayer(player);
                display.displayOutcome("Dealer and player tie");}
            else if (dealer.valueOf() > player.valueOf()){
                display.displayDealer(dealer);
                display.displayPlayer(player);
                display.displayOutcome("You lose");}
            else if (player.valueOf() > dealer.valueOf()){
                display.displayDealer(dealer);
                display.displayPlayer(player);
                display.displayOutcome("You win!!");}

        }
        display.enablePlayButton();
    }
    public static void main(String[] args){
        new Game();
    }

}
