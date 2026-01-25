package Abstraction;

public class MainClass {

	public static void main(String[] args) {
		Payment p;
		p = new CreditCard();
		p.pay();
		p = new DebitCard();
		p.pay();
		p = new UPI();
		p.pay();
		
	}

}
