package Overriding;

public class Manager extends Employee{
public double bonus= 5000;
@Override
public double calculateSalary() {
	return basicSalary + bonus;
}
}
