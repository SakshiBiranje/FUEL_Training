package Practice;
import java.util.*;
public class Thows_Keyword {

	static int divide(int a , int b) throws  ArithmeticException,IllegalArgumentException,InputMismatchException{
		return a/b;
	}
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter two numbers : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result = divide(a, b);
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println("Error cannot divide by zero ! "+e);
		}
		catch(IllegalArgumentException e) {
			System.out.println("Error incorrect data format ! "+e);
		}
		catch(InputMismatchException e) {
			System.out.println("Error Incorrect input "+e);
		}
		finally {
			sc.close();
		}
	}

}
