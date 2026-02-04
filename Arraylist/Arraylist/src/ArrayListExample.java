import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>();

        student.add(new Student(101, "shubham", 23));
        student.add(new Student(102, "Deepak", 24));
        student.add(new Student(103, "Akash", 24));

        for (Student e : student) {
            e.display();
        }
    }
}