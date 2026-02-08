import java.util.LinkedList;

public class SumOfSalaryExample {
    public static void main(String[] args) {

        // Create LinkedList of Employee objects
        LinkedList<Employees> empList = new LinkedList<>();

        // Add employees
        empList.add(new Employees(101, "Rahul", 35000));
        empList.add(new Employees(102, "Anita", 42000));
        empList.add(new Employees(103, "Suresh", 50000));

        // Calculate sum of salaries
        double totalSalary = 0;

        for (Employees e : empList) {
            totalSalary += e.salary;
        }

        // Display result
        System.out.println("Total Salary of all employees: " + totalSalary);
    }
}