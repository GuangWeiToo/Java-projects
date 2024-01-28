import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BlackJack extends JFrame {

    Container contentPane;
    JPanel Buttons = new JPanel();
    JButton Play = new JButton("Play ");
    JButton Hit = new JButton("Hit");
    JButton Stand = new JButton("Stand");
    JPanel output = new JPanel();
    JTextArea playerArea = new JTextArea();
    JTextArea dealerArea = new JTextArea();

    public BlackJack() {
        setTitle("BlackJack");
        contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        output.setLayout(new BorderLayout());
        setSize(new Dimension(600, 400));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        contentPane.add(Buttons, BorderLayout.SOUTH);
        Buttons.add(Play);
        Buttons.add(Hit);
        Buttons.add(Stand);
        contentPane.add(output, BorderLayout.CENTER);
        output.setLayout(new FlowLayout());
        output.add(playerArea);
        output.add(dealerArea);
        Hit.setEnabled(false);
        Stand.setEnabled(false);
        playerArea.setEditable(false);
        dealerArea.setEditable(false);
        playerArea.setPreferredSize(new Dimension(200,700));
        dealerArea.setPreferredSize(new Dimension(200,700));
    }

    public void setPlayAction(ActionListener listener) {
        Play.addActionListener(listener);
    }

    public void setHitAction(ActionListener listener) {
        Hit.addActionListener(listener);
    }

    public void setStandAction(ActionListener listener) {
        Stand.addActionListener(listener);
    }

    public void displayPlayer(Hand hand) {
        playerArea.setText("Player:\n" + hand + "\n" + "Total value: " + hand.valueOf());
    }

    public void displayDealer(Hand hand) {
        dealerArea.setText("Dealer:\n" + hand + "\n" + "Total Value: " + hand.valueOf());
    }

    public void displayDealerCard(Card card) {
        dealerArea.setText("Dealer Card Shown:\n" + card);
    }

    public void displayOutcome(String outcome) {
        playerArea.setText(playerArea.getText() + "\n\n" + outcome);
    }

    public void enableHitAndStandButtons() {
        Play.setEnabled(false);
        Hit.setEnabled(true);
        Stand.setEnabled(true);
    }

    public void enablePlayButton() {
        Play.setEnabled(true);
        Hit.setEnabled(false);
        Stand.setEnabled(false);
    }

    static public void main(String[] args) {
        new BlackJack();
    }
}

