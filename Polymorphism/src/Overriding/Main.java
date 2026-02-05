package Overriding;

public class Main {

	public static void main(String[] args) {
		Employee e;
		e= new Employee();
		Employee e1;
		e1= new Manager();
		Employee e2;
		e2 = new Developer();

		System.out.println("Employee Salary : "+ e.calculateSalary());
		System.out.println("Manager Salary : "+ e1.calculateSalary());
		System.out.println("Developer Salary : "+ e2.calculateSalary());
		
	}
}
