package basic_codes;
import java.util.Scanner;
public class PassOrFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks : ");
		int n = sc.nextInt();
		if(n>= 40) {
			System.out.print("Pass");
		}
		else if(n<40) {
			System.out.println("Fail");
		}
	}
}
