
import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<Employee> empdetail = new HashSet<>();

        empdetail.add(new Employee(676378686431L, "Deepak", 30000));
        empdetail.add(new Employee(676378686431L, "Akash", 20000));

        for (Employee e : empdetail) {
            System.out.println(e);
        }
    }
}
