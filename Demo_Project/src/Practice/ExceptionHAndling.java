package Practice;

public class ExceptionHAndling {

	public static void main(String[] args) {
		/*
		 * to handle runtime errors so that normal flow of execution can be maintained
		 * It is unexpected/unwanted/abnormal situation at runtime 
		 * try - Block where code may cause exception is written
		 * catch Block that handles exception
		 * finally - block of code always executes
		 * throw - used to throw exception manually
		 * throws- declares exception that method might throw error
		 * 
		 * imp-
		 * Compile-time errors (syntax errors, missing semicolons, type mismatch, etc.) 
		 * are caught by the compiler before the program runs.
		 *  Runtime errors happen while the program is running 
		 *  (like division by zero, null pointer access, file not found).
		 *  
		 */
		
		int a=10, b=20, c=0;
		try {
		System.out.println(a+b);
		System.out.println(b-a);
		System.out.println(b/c);
		}
		catch(Exception e) {
			System.out.println("Exception handled successfully !!"+ e);
		}
		System.out.println(b/a);
		System.out.println(a*b*c);
	}

}
