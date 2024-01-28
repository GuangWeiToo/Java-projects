import javax.swing.JOptionPane;

public class game extends BlackJack{
double userAmount;

public game(){
dealerStand=true;
//front first card
    //if user has a ace or multiple ace can set 11 or 1
  
    //run dealer Ai once player stand and disable dealer stand
    if(dealerStand==false){
        DealerAI();
    }
    //when both stand true check winning conditions
    if(dealerStand==true && playerStand==true){
        checkResults();
    }

    
    
}
public void DealerAI() {
    //dealer draw until he exceeds or reaches amount 17
    for(int i=dealer;i<17 ;i++){
        RandomCard();
        dealer=dealer+cardValue;
    }
    if(dealer>=17){
        dealerStand=true;
    }
    //dealer adjust best value if has ace
    
}
public void checkResults() {
    if(user<22 && user>dealer){
        JOptionPane.showMessageDialog(null,"You Win!");
        userAmount=userAmount+betAmount;
        betAmount=0;
    }else if(user==21){
        JOptionPane.showMessageDialog(null,"You got Blackjack!");
        userAmount=userAmount+betAmount;
        betAmount=0;
    }
    
    //Loss
    
    else if(user<21 && user<dealer){
        JOptionPane.showMessageDialog(null,"You Lose!");
        userAmount=userAmount-betAmount;
        betAmount=0;
    }else if(user>22){
        JOptionPane.showMessageDialog(null,"You Busted!");
        userAmount=userAmount-betAmount;
        betAmount=0;
    }
    }

}   






