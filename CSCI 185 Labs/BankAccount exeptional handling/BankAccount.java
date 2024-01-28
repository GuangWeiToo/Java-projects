

/*
Guang Wei Too
Wenjia Li
CSCI 185 Fall 2021
November 12, 2021
*/
public class BankAccount {
	private String name;
	private double balance;
	double withdraw;
	double deposit;
	double overdraft;

	BankAccount(String n, double b) {
		this.name = n;
		this.balance = b;
		try{
		if (balance < 0.0) {
			throw new IllegalArgumentException("Accounts created cannot be less than zero");
		}
		}catch(IllegalArgumentException e){
			System.out.println("Input at least 100 dollars");
		}
	}

	public void Overdraft(double withdraw){
		try{
		
			overdraft = balance - withdraw;
			this.balance=overdraft;
			System.out.println("\n\n" + name + "\nOverdraft:" +"-"+ withdraw + "\n\n");
		
		if(balance<=-100){
			throw new MyOwnException("Overdraft limit cannot withdraw after reaching balance:-100");
		}
		} catch (MyOwnException s) {
			System.out.println(s.getMessage());
		}
	}
	public void Withdraw(double withdraw) {
		try {
			if (balance >= withdraw && withdraw >= 0.0) {
				this.balance = balance - withdraw;
				System.out.println(name + "\nWithdraw Amount:" + "-" + withdraw);
			}
			//exception of negative withdraw
			if(withdraw<0.0){
				throw new MyOwnException("Cannot withdraw negative numbers");
			}
		}
		
		 catch (Exception e) {
		System.out.println("Invalid Withdraw value");
		}

	}

	public void Deposit(double deposit) {
		try{
			this.balance = this.balance + deposit;
			System.out.println("\n\n" + name + "\nDeposit Amount:" + "+" + deposit + "\n\n");
			//exception negative amount
			
			if(deposit<0.0){
					throw new MyOwnException("Cannot deposit negative amount");
			}

		}catch(MyOwnException b) {
			System.out.println(b.getMessage());
		} 
		catch (Exception e) {
			System.out.println("Invalid Deposit Value");
		}
	}

	public String toString() {
		return this.name + "\nBalance:" + this.balance + "\n\n";
	}

	

}
