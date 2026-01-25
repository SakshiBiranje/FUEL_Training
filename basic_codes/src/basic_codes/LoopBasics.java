package basic_codes;
import java.util.*;
public class LoopBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		System.out.println(n+"'s table : ");
		for(int i=1;i<=10;i++) {
			System.out.println(n +" X "+i +"= "+n*i);
		}
		
	}

}
