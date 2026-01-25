package basic_codes;

public class Account_Encapsulation {

	private long acc_no;
	private String name;
	private String email;
	private double amount;
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
		if(amount >0) {
			System.out.println("Your amount is "+ amount);
		}
		else {
			System.out.println("Enter valid amount !!!");
		}
	}
	public void userDetails(long acc_no, String name, String email, double amount) {
		this.acc_no= acc_no;
		this.name= name;
		this.email= email;
		this.amount = amount;
	}

}
