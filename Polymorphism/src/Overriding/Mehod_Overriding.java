package Overriding;
import java.util.*;
public class Mehod_Overriding {

	public static void main(String[] args) {
		RBI bank1;
		bank1 = new SBI();
		System.out.println("SBI Interest rate is "+ bank1.getInterest());
		
		bank1 = new HDFC();
		System.out.println("HDFC Interest rate is "+ bank1.getInterest());
		
	}

}
