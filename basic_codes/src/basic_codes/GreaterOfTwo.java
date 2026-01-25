package basic_codes;
import java.util.Scanner;
public class GreaterOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		if(n > m) {
			System.out.println("greater number :"+ n);
		}
		else {
			System.out.println("greater number :"+ m);
		}
		

	}

}
