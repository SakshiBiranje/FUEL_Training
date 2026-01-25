package Practice;

public class Finally {

	public static void main(String[] args) {
	int [] arr = { 1,2,3,4};
	try {
		System.out.println(arr[2]);
		System.out.println(arr[4]);
	}
	catch(Exception e )
	{
		System.out.println("Excetion handled!!"+e);
	}
	finally {
		System.out.println("code written in finally block always executes!!");
	}
	}

}
