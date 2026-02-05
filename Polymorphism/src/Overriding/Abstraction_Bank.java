package Overriding;

public class Abstraction_Bank extends GooglePay {

	public double balance = 10000;
	public double amount;
	public static void main(String[] args) {
		GooglePay b1=new Abstraction_Bank();
		b1.check_Balance();
		b1.Withdraw_Amount(1000);
		b1.Deposit_Amount(2000);
	

	}
	
	@Override
	public void check_Balance() {
		
		System.out.println();
		System.out.println("Balance : "+ balance);
	}

	@Override
	public void Deposit_Amount(double amount) {
		amount= amount + balance;
		System.out.println("Amount after Deposit: "+ amount);
	}

	@Override
	public void Withdraw_Amount(double amount) {
		amount = balance - amount;
		System.out.println("Amount after withdrawl: "+ amount);
	}

}
