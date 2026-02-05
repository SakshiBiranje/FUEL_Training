package Overriding;

public class SBI extends RBI{
public int getInterest() 
{
	return 7;
}
public int HomeLoanInt() {
	System.out.println("SBI is offering low interest loans!!");
	return 6;
}
}
