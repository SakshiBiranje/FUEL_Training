package Overriding;

public class Developer extends Employee{
public double overPay=7000;
@Override
public double calculateSalary()
{
	return (overPay + basicSalary);
}
}
