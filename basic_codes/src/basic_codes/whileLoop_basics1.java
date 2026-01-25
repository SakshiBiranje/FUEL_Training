package basic_codes;
import java.util.*;
public class whileLoop_basics1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while(true) {
			System.out.print("Enter customer Number : ");
			n = sc.nextInt();
			if(n<=100) {
				System.out.println("Offer is available!!!");
			}
			else {
				System.out.println("Offer is unavailable!!!Only 100 customers !!");
				break;
			}
		}

	}

}
