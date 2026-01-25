package basic_codes;
import java.util.*;
/*
 * Encapsulation- wrapping up data and info in a single unit
 * - binding together data & functions to manipulate them
 * Properties- 
 * 1. Data protection- protects internal state of object by keeping data members private
 * Access to and modification to this data members is restricted
 * 
 */

public class Encapsulation {

	public int age;
	public void setage(int age) {
		if(age >0) {
			this.age= age;
			System.out.println("My age is "+ age);
			
		}
		else {
			System.out.println("Age cannot be negative or Zero!!");
		}
		
	}
	public int getage() {
		this.age= age;
		
		return age;
	}
}
