package Practice;
import java.util.*;
public class StudentMaeksValidation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	try {
	System.out.println("Enter the marks :");
	int marks= sc.nextInt();
	if(marks <0 || marks >100) {
		throw new IllegalArgumentException("Enter value betwwen 0 to 100!!");
	}
	
	
		if(marks >=80) {
			System.out.println("A Grade");
		}
		else if(marks >= 70) {
			System.out.println("B Grade");
		}
		else if(marks >=60) {
			System.out.println("C Grade");
		}
		else if(marks >=40) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	
	} catch(java.util.InputMismatchException e) {
		System.out.println("Enter numeric data!!");
	}
	catch(IllegalArgumentException e) {
		System.out.println("Error!!"+ e.getMessage());
	}
	finally {
		System.out.println("Marks validation process completed !!!");
	}
}	
}
