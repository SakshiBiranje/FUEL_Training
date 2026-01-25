package basic_codes;
import java.util.*;
public class printEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Print Even numbers from 1 to 50 : ");
		
		
		for(int i=1;i<=50;i++) {
			if(i % 2 ==0) {
				System.out.println(i);
			}
		}
	}

}
