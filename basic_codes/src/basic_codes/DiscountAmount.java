package basic_codes;
import java.util.*;
public class DiscountAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount of product : ");
		double amount = sc.nextInt();
		double discount =0;
		if(amount >=10000) {
			discount =amount * 0.30;
		}
		else if(amount >= 5000) {
			discount = amount * 0.20;
		}
		else {
			discount =0;
		}
		double final_amount = amount - discount;
		System.out.println("Discount = "+ discount);
		System.out.println("Final discounted amount : "+ final_amount);
	}

}
