package basic_codes;
import java.util.*;
// ATM using do while loop
public class doWhileBasics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* do {
		// code to be executed}
		while(condition);
		do while loop used - when specific actions need to be 
		executed at least once before checking the condition
	*/
		int correct_pin = 1234;
		System.out.print("Enter the ATM pin : ");
		int pin = sc.nextInt();
		int choice;
		double ammount ;
		double balance = 5000;
		if(pin == correct_pin) {
			do {
			System.out.println("Welcome to HDFC ATM !!!");
			System.out.println("Correct pin !!! U can proceed !!");
			System.out.println("1.Check Balance.");
			System.out.println("2.Deposit Balance.");
			System.out.println("3.Withdraw Balnce.");
			System.out.println("4.Exit");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Your account balance is "+ balance);
				break;
			case 2:
				System.out.println("Enter the ammount to deposited : ");
				ammount =sc.nextInt();
				System.out.println("Ammount deposited successfully!!!");
				balance += ammount;
				System.out.println("Your current balnce is "+ balance);
				break;
			case 3:
				System.out.println("Enter the ammount to withdraw : ");
				ammount =sc.nextInt();
				System.out.println("Ammount withdraw successfully!!!");
				balance -= ammount;
				System.out.println("Your current balnce is "+ balance);
				break;
			default :
				// to exit the code we can use return break or System.exit(0);
				System.out.println("Exited");
				//return;
				System.exit(0);
				
			}
		} while(choice >0 && choice <=4);
		}
		else {
			System.out.println("Incorrect pin !! Please try again !!!");
		}
	}

}
