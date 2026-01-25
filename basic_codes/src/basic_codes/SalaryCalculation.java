package basic_codes;

import java.util.Scanner;

public class SalaryCalculation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter salary : ");
		double salary = sc.nextInt();
		double tax = 0;
		if(salary <= 500000) {
			tax =0;
		}
		else if(salary <= 1000000) {
			tax = salary * 0.18;
		}
		else if(salary < 2000000) {
			tax = salary * 0.36;
		}
		else if(salary >= 2000000) {
			tax = salary * 0.45;
		}
		double final_amount = salary - tax;
		System.out.println("Tax :"+ tax);
		System.out.println("Final salary amount : "+ final_amount);
	}

}
