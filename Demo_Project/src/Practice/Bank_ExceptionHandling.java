package Practice;
import java.util.*;
public class Bank_ExceptionHandling {

	public static double withdraw(double amount, double w) {
		return amount - w;
	}
	public static void main(String[] args) throws InputMismatchException, ArithmeticException {
		Scanner sc = new Scanner(System.in);

		try {
			double amount=10000;
			System.out.println("Your account balance is "+ amount);
			System.out.println("Enter amount to withdraw : ");
			double w= sc.nextDouble();
			if(w>amount) {
				throw new ArithmeticException("Access Denied due to invalid withdraw amount!");
			}
			double ans= withdraw(amount, w);
			System.out.println("Remaining balance : "+ ans);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Error "+ e);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Error "+e);
		}
	}

}
