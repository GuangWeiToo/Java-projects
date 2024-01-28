/*
Jonathan Urquia, Guang Wei Too, Gurpinder Singh
Dr.Wenjia Li
Fall 2021 CSCI 185
12/19/2021
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BlackJack extends JFrame {
    Container container;
    JPanel panel = new JPanel();
    JLabel betAmount = new JLabel("Enter bet amount: $");
    JTextArea amount= new JTextArea(1,8);
    JLabel totalWinnings = new JLabel("Total Winnings: $");
    JTextArea betArea = new JTextArea(1,8);

    JPanel panel2 = new JPanel();
    JTextArea playerArea = new JTextArea();
    JTextArea dealerArea = new JTextArea();
    JPanel panel3 = new JPanel();
    JButton play = new JButton("Play ");
    JButton hit = new JButton("Hit");
    JButton stand = new JButton("Stand");

    public BlackJack() {
        setTitle("BlackJack");
        container = getContentPane();
        container.setLayout(new BorderLayout());
        panel2.setLayout(new BorderLayout());
        setSize(new Dimension(600, 400));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        panel.add(betAmount);
        panel.add(amount);
        panel.add(totalWinnings);
        panel.add(betArea);
        betArea.setEditable(false);
        container.add(panel,BorderLayout.NORTH);


        panel2.setLayout(new FlowLayout());
        panel2.add(playerArea);
        playerArea.setEditable(false);
        panel2.add(dealerArea);
        dealerArea.setEditable(false);
        playerArea.setPreferredSize(new Dimension(200,700));
        dealerArea.setPreferredSize(new Dimension(200,700));
        container.add(panel2, BorderLayout.CENTER);


        panel3.add(play);
        panel3.add(hit);
        panel3.add(stand);
        container.add(panel3, BorderLayout.SOUTH);


    }

    public void play(ActionListener listener) {
        play.addActionListener(listener);
    }

    public void hit(ActionListener listener) {
        hit.addActionListener(listener);
    }

    public void stand(ActionListener listener) {
        stand.addActionListener(listener);
    }

    public void setBetArea(String money){
        betArea.setText(money);
    }

    public String getAmount(){
        return amount.getText();
    }

    public void playerHand(Hand hand) {
        playerArea.setText("Players Hand:\n" + hand + "\n" + "Total value: " + hand.totalValue());
    }

    public void dealerHand(Hand hand) {
        dealerArea.setText("Dealer Hand:\n" + hand + "\n" + "Total Value: " + hand.totalValue());
        dealerArea.setForeground(Color.red);
    }

    public void dealerCard(Card card) {
        dealerArea.setText("Dealer Card Reveal:\n" + card);
    }

    public void outcome(String outcome) {
        playerArea.setText(playerArea.getText() + "\n\n" + outcome);
    }

    public void hitAndStandButton() {
        play.setEnabled(false);
        hit.setEnabled(true);
        stand.setEnabled(true);
        amount.setEnabled(false);
    }

    public void playButton() {
        play.setEnabled(true);
        hit.setEnabled(false);
        stand.setEnabled(false);
        amount.setEnabled(true);
    }

    static public void main(String[] args) {
        new BlackJack();
    }
}

