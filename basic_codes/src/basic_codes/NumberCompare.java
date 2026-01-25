package basic_codes;

import java.util.Scanner;

public class NumberCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int n = sc.nextInt();
	if(n > 100) {
			System.out.println("Greater than 100");
	} else if(n == 100) {
		System.out.println("Equals to 100");
	}
	else if(n < 100) {
		System.out.println("smaller than 100");
	}
	}
}
