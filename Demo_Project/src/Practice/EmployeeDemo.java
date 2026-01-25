package Practice;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for Employee " + i);

            Employee emp = new Employee();

            System.out.print("Employee ID: ");
            emp.setEmpId(sc.nextInt());
            sc.nextLine(); 

            System.out.print("Employee Name: ");
            emp.setEmpName(sc.nextLine());

            while (true) {
                try {
                    System.out.print("Basic Salary: ");
                    double salary = sc.nextDouble();
                    emp.setBasicSalary(salary);
                    break; 
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Error: Please enter a valid number");
                    sc.next(); 
                }
            }

            System.out.println("\nEmployee Details:");
            System.out.println("ID: " + emp.getEmpId());
            System.out.println("Name: " + emp.getEmpName());
            System.out.println("Calculated Salary: " + emp.calculateSalary());
        }

        sc.close();
    }
}
