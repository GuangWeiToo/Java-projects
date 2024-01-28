import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;

public class BlackJack extends JFrame {
    double userAmount;
    int cardnum,cardValue,user,dealer;
    int aceAmount;
    int yourChoice;
    String yourInput;
    int playerHand[] = new int[6];
    int dealerHand[] = new int[6];
    int playerCardValue[] = new int[6];
    int dealerCardValue[] = new int[6];

   
    Cards cards = new Cards();
    Random random = new Random();
    int playerDraw = 0;
    int dealerDraw = 0;

    double betAmount;
    boolean playerStand, dealerStand,playAgain;


    public JLabel change_img_res(String res_dir){
        // utility func
        String img_res = res_dir;
        java.net.URL card_back_red = this.getClass().getResource(img_res);
        ImageIcon back_red_Icon = new ImageIcon(card_back_red);
        return new JLabel(back_red_Icon);
    }

    public BlackJack(){
        setTitle("BlackJack");
        setSize(600,400);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
// JPanel Resize method:
// .setPreferredSize(new Dimension(100,500));

        //Jpanel player onto frame
        JPanel player = new JPanel();
        JTextArea pa = new JTextArea(30,700);
        pa.setBackground(Color.green);
        pa.setEditable(true);
        player.add(pa);
        add(player, BorderLayout.WEST);

        //Jpanel Dealer onto frame
        JPanel dealer = new JPanel();
        JTextArea da = new JTextArea(30,80);
        da.setBackground(Color.green);
        da.setEditable(true);
        dealer.add(da);
        add(dealer, BorderLayout.EAST);

        //Jpanel for buttons
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(1,3));
        JButton stand=new JButton("Stand");
        JButton hit=new JButton("Hit");
        JButton bet=new JButton("Bet");
        
        //buttons onto panel
        buttons.add(hit);
        buttons.add(stand);
        buttons.add(bet);

        //buttons panel onto frame
        add(buttons, BorderLayout.SOUTH);

        //Jpanel for bet area
        JPanel ba = new JPanel();
        JLabel la = new JLabel("Enter bet amount:");
        JTextField tf= new JTextField(8);
        JLabel la2 = new JLabel("Total Bets:");
        JTextArea ta = new JTextArea(1,20);
        ta.setEditable(false);
        JLabel d = new JLabel("Dealer:");
        JTextArea ta1 = new JTextArea(1,20);
        ta1.setEditable(false);
        JLabel p = new JLabel("Player:");
        JTextArea ta2 = new JTextArea(1,20);
        ta1.setEditable(false);
        ba.add(d);
        ba.add(ta1);
        ba.add(la);
        ba.add(tf);
        ba.add(la2);
        ba.add(ta);
        ba.add(p);
        ba.add(ta2);

        add(ba, BorderLayout.NORTH);
        //
        ta1.setText("?"); 

       
        //Action Listeners
        stand.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                playerStand=true;
                dealerStand=false;
                stand.setEnabled(false);
                hit.setEnabled(false);
                bet.setEnabled(false);
            }
        });
        hit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RandomCard();
                PlayersDraw();//store list
                user=user+cardValue;
                
            }
        });
        bet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            String s2=tf.getText();
            double b=Double.parseDouble(s2);
            betAmount=betAmount+b;
            String d=Double.toString(betAmount);  
            ta.setText(d); 
            }
        });

        JPanel dealer_panel = new JPanel();
        
        // init the card back (red)
        JLabel temp_dealer_card = change_img_res("card back red.png");

        

        dealer_panel.add(temp_dealer_card);
        dealer_panel.setPreferredSize(new Dimension(300, 600));
        add(dealer_panel, BorderLayout.WEST);

        JPanel player_panel = new JPanel();

        player_panel.add(change_img_res("./"));
        add(player_panel, BorderLayout.EAST);
        /////////////////////////////////////////////////////////////////////////////////
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
        

               //ace check 
               if(playerHand.contains("0.png")){
                getAceValue();
            }
            if(playerHand.contains("13.png")){
                getAceValue();
            }
            if(playerHand.contains("26.png")){
                getAceValue();
            }
            if(playerHand.contains("39.png")){
                getAceValue();
            }
            if(dealerHand.contains("0.png")){
                dealerAce();
            }if(dealerHand.contains("13.png")){
                dealerAce();
            }if(dealerHand.contains("26.png")){
                dealerAce();
            }if(dealerHand.contains("39.png")){
                dealerAce();
            }
        if(dealerStand==true && playerStand==true){
            //front.setVisible(false);
            //cardrandom.setVisible(true)
            String c=Integer.toString(this.dealer);
            ta1.setText(c);

            // change the card resource dir
            temp_dealer_card = change_img_res("./");
            
        }       
        }
        public void DealerAI() {
            //dealer draw until he exceeds or reaches amount 17
            for(int i=dealer;i<17 ;i++){
                RandomCard();
                DealersDraw();
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

        
public void PlayersDraw(){
    playerHand[playerDraw] = cardnum;
    playerCardValue[playerDraw] = checkCardValue();
}

public void DealersDraw(){ 
    dealerHand[dealerDraw] = cardnum;
    dealerCardValue[dealerDraw] = checkCardValue();
    

}  
    public ImageIcon RandomCard () {
        ImageIcon pickedcard = null;
        cardnum = random.nextInt(13);
        int cardsuit = random.nextInt(4);
        
    switch(cardsuit){
        case 1: pickedcard = cards.heart[cardnum];
        break;
        case 2: pickedcard = cards.diamond[cardnum];
        break;
        case 3: pickedcard = cards.spade[cardnum];
        break;
        case 4: pickedcard = cards.club[cardnum];
        break;
    }
    return pickedcard;
    }

    public int checkCardValue(){
        int cardValue = cardnum;
        if (cardnum > 10){
            cardValue = 10;
        }
        return cardValue;
    }

public void getAceValue() {
    do{
        try {
            yourInput = JOptionPane.showInputDialog("You have an Ace, choose to set 11 or 1. You cannot change later.");
            yourChoice = Integer.parseInt(yourInput);
            if(yourChoice==11){
                user=user+11;
            }
            if(yourChoice==1){
                user=user+1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter A Number");
        }
    }while(yourChoice !=11 || yourChoice!=1);
}
public void dealerAce() {
    if(dealer==10){
        aceAmount=11;
        dealer=dealer+aceAmount;
    }else if(dealer>10){
        aceAmount=1;
        dealer=dealer+aceAmount;
    }else if(dealer<10){
        aceAmount=11;
        dealer=dealer+aceAmount;
    }
}
   
    //random
 public static void main(String[] args) {
        new BlackJack();
    }

}