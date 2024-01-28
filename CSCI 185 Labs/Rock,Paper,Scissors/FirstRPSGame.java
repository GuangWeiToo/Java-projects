/* Program name: Paper, Scissor and Rock Version 0.1
Initially created by Dr. Wenjia Li
Finished by _Guang Wei Too__ 
______4 November, 2021___ 
*/

import javax.swing.JOptionPane;

public class FirstRPSGame {
	public static void main(String args[]) {
		// Variable declaration
		int yourChoice, computerChoice; // number choosen by both participants
		String yourInput; // number chosen by player
		yourChoice = -1;
		boolean flag = true;
		// Welcome screen and show the basic rule to the user
		JOptionPane.showMessageDialog(null, "Welcome to Paper, Scissor and Rock");
		JOptionPane.showMessageDialog(null,
				"Let me remind you the rule first:\nScissor cuts paper, paper covers rock, and rock breaks scissors.");
		JOptionPane.showMessageDialog(null, "0: Rock\n1: Paper\n2: Scissor");

		// Get your choice

		// exception handling
		do {

			try {
				yourInput = JOptionPane.showInputDialog("Now tell me your choice!");
				yourChoice = Integer.parseInt(yourInput);
				if (yourChoice != 0 && yourChoice != 1 && yourChoice != 2) {
					flag = false;
				}
				System.out.println("Your Choice: " + yourChoice+" Choose from numbers 0,1,or 2");
			} catch (Exception e) {
				flag = false;
				System.out.println("Something went wrong. Choose from numbers 0,1,or 2");
			} 
		} while ((yourChoice != 0) && (yourChoice != 1) && (yourChoice != 2));
		// Get computer choice
		System.out.println("Executed this line");
		computerChoice = (int) (Math.random() * 10); // generate a random number
		computerChoice %= 3; // Why we need to modulus 3 here? Think about it. Returns 0,1,2 remainder for
								// generated num of 0 to 10

		// Compare your Choice with computer’s choice and output the result
		JOptionPane.showMessageDialog(null, "Computer Choice:"+computerChoice + "\nYour Choice: " + yourChoice);
		// Case I: Both you and computer pick the same choice, then it’s a tie!
		if (yourChoice == computerChoice) {
			JOptionPane.showMessageDialog(null, "It’s a tie!");
		} // Case II: You WIN :)

		/**
		 * WIN: {0:2} {2:1} {1:0}
		 */
		if ((yourChoice == 0 && computerChoice == 2) || (yourChoice == 2 && computerChoice == 1)||(yourChoice == 1 && computerChoice == 0)) {
			JOptionPane.showMessageDialog(null, yourChoice + " beats " + computerChoice + "\n You win!");
		}
		

		/**
		 * LOSE: {:}
		 */
		// Case III: You Lose :(
		if ((yourChoice == 2 && computerChoice == 0) || (yourChoice == 1 && computerChoice == 2) || (yourChoice == 0 && computerChoice == 1)) {
			JOptionPane.showMessageDialog(null,  computerChoice+ " beats " + yourChoice  + "\n You lost!");
		}


	}
}
   
