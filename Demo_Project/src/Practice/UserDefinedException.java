package Practice;
import java.util.*;
public class UserDefinedException {

	public static void main(String[] args) {
/*
* throw- It is used to throw exception rather than 
* to print the message throw keyword creates the exception 
* and stops the further execution of code using throw keyword 
* it is used inside function
* throws- used with method , handles the unwanted exception in the software or system. 
* Any JVM internal error can be handled easily with throws keyword 
* It is used in method declarations to specify that 
* a method might throw one or more checked exceptions 
*/
Scanner sc = new Scanner(System.in);
try {
System.out.println("Enter your age : ");
int age = sc.nextInt();
if(age <18) {
	throw new ArithmeticException("Access Denied due to invalid age!"); 
}
System.out.println("Next user data : ");
}
catch(ArithmeticException e) {
	System.out.println(e.getMessage());
	
}
finally {
	sc.close();
}
	}
	

}
