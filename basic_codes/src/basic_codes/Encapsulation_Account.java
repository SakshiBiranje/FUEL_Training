package basic_codes;

public class Encapsulation_Account extends Account_Encapsulation{

	
	public static void main(String[] args) {
		Encapsulation_Account e= new Encapsulation_Account();
		e.setAcc_no(12345);
		System.out.println(e.getAcc_no());
		e.setName("Sakshi");
		System.out.println(e.getName());
		e.setEmail("sakshi@gmail.com");
		System.out.println(e.getEmail());
		e.setAmount(50000);
		System.out.println(e.getAmount());
		
		e.userDetails(12345," sudarshan", "Suda@gmail.com", 5000);
		System.out.println("Account :"+ e.getAcc_no()+" Name"+e.getName()+" Email: "+ e.getEmail()+" Amount :"+ e.getAmount());
	}

}
