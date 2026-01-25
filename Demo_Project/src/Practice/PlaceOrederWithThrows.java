package Practice;
import java.util.*;
public class PlaceOrederWithThrows {
	static void placeOrder(int q) throws Exception {
		if(q<=0 || q>20) {
			throw new Exception("Quantity either less than or equal to zero Or greater than 20!");
		}
		System.out.println("Order placed Successfully !!");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int q;
			System.out.println("Enter quantity Numbers : ");
			q= sc.nextInt();
			placeOrder(q);
		}
		catch(Exception e) {
			System.out.println("Error occured !!"+ e);
		}
	}

}
