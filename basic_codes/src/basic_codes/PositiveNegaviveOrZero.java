package basic_codes;

import java.util.*;
public class PositiveNegaviveOrZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		if(n > 0) {
			System.out.println("Positive");
	} else if(n == 0) {
		System.out.println("Zero");
	}
	else if(n < 0) {
		System.out.println("Negative");
	}
	}
}
