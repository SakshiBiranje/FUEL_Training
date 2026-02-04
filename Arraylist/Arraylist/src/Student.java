public class Student {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Id is " + id);
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
    }
}