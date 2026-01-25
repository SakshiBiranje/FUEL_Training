package basic_codes;

public class ConstructorBasics {
//BAnk Account using constructor
	String name;
	int id;
	
	ConstructorBasics(String name, int id) {
		this.name= name;
		this.id = id;
	}
	public static void main(String[] args) {
		/*Constructor is block similar to method with no return type
		 * use to reduce code length and achieve
		 * name same as class name 
		 * A method is a block of code or collection of statements grouped together to perform 
		 * certain tasks or operations
		 * we write function/ method once and use multiple times
		 * we do not require to write code again and again .It provide easy readability and modification
		 * */
		ConstructorBasics obj = new ConstructorBasics("Sakshi",1);
		 System.out.println("My name is "+ obj.name);
		 System.out.println("Id : "+ obj.id);
	}

}
