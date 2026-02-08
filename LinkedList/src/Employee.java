import java.util.Objects;

public class Employee {

    long adharno;
    String name;
    double salary;

    public Employee(long adharno, String name, double salary) {
        this.adharno = adharno;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return adharno == employee.adharno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(adharno);
    }

    @Override
    public String toString() {
        return name + " " + adharno + " salary is " + salary;
    }
}
