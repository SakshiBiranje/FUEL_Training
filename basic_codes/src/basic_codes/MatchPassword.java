package basic_codes;
import java.util.*;
public class MatchPassword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Set password : ");
		int setPassword = sc.nextInt();
		while(true) {
			System.out.print("Enter password : ");
			int Password = sc.nextInt();
			if(Password == setPassword) {
			System.out.println("Correct password !! Login successful !!!");
			break;
		}
			else {
				System.out.println("Incorrect password !! Login unsuccessful !!!");
			}
		}		
	}

}
