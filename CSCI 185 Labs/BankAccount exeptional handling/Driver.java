import javax.swing.JOptionPane;
public class Driver {
    public static void main(String[] args) {
		/*
		 * BankAccount b1 = new BankAccount("Joe Smith Checking Account", 100);
		 * BankAccount b2 = new BankAccount("Daniel Didyk Savings Account"); d
		 * b1.Deposit(-30.0);//invalid deposit b1.Withdraw(-1.0);//invalid withdraw
		 * b1.Deposit(30); b1.Withdraw(10); b1.Withdraw(140);//overdraft
		 * 
		 * 
		 * System.out.println(b1.toString()); System.out.println(b2.toString());
		 */
		String yourChoice = null;
		// assume there's a $100 on the client's account
		BankAccount b1 = new BankAccount("Joe Smith Checking Account", 100.0);
		do {

			yourChoice = JOptionPane
					.showInputDialog("Please enter 1 withdraw/deposit, 2 overdraft, 3 create new account,4 view balance, 5 exit");
			if (yourChoice.equals("1")) {
				String wORd = JOptionPane.showInputDialog("Please enter 9 for withdraw and 0 for deposit");
				if (wORd.equals("9")) {
					String userInput = JOptionPane.showInputDialog("How much you want to withdraw");
					double input = Double.parseDouble(userInput);
					b1.Withdraw(input);
				}
				else if(wORd.equals("0")) {
					String userInput = JOptionPane.showInputDialog("How much you want to deposit");
					double input = Double.parseDouble(userInput);
					b1.Deposit(input);
				}
			}
			if(yourChoice.equals("2")) {
				String userInput = JOptionPane.showInputDialog("How much you want to overdraft");
				double input = Double.parseDouble(userInput);
				b1.Overdraft(input);
			}
			if (yourChoice.equals("3")) {
				
				String nameInput = JOptionPane.showInputDialog("Enter your name");
				String amountinput=JOptionPane.showInputDialog("Enter amount");
				double input = Double.parseDouble(amountinput);
				BankAccount b2=new BankAccount(nameInput, input);
				System.out.println(b2);
			}
            if (yourChoice.equals("4")) {
				System.out.println(b1.toString());
			}
		} while (!yourChoice.equals("5"));

	}
}
