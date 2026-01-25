package basic_codes;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		if(n %2 == 0) {
			System.out.println("Even number");
		}
		else if(n %2 !=0) {
			System.out.println("Odd number ");
		}
	}

}
