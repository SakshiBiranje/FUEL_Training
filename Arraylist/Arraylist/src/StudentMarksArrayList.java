import java.util.ArrayList;
import java.util.Scanner;

public class StudentMarksArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.println("Enter marks for 8 students:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            marks.add(sc.nextInt());
        }

        System.out.println("\nMarks entered:");
        System.out.println(marks);

        System.out.print("\nEnter index to update mark: ");
        int updateIndex = sc.nextInt();
        System.out.print("Enter new mark: ");
        int newMark = sc.nextInt();

        if (updateIndex >= 0 && updateIndex < marks.size()) {
            marks.set(updateIndex, newMark);
            System.out.println("Mark updated successfully.");
        } else {
            System.out.println("Invalid index!");
        }

        System.out.print("\nEnter index to remove mark: ");
        int removeIndex = sc.nextInt();

        if (removeIndex >= 0 && removeIndex < marks.size()) {
            marks.remove(removeIndex);
            System.out.println("Mark removed successfully.");
        } else {
            System.out.println("Invalid index!");
        }

        System.out.print("\nEnter mark to search: ");
        int searchMark = sc.nextInt();

        if (marks.contains(searchMark)) {
            System.out.println("Mark found in the list.");
        } else {
            System.out.println("Mark not found in the list.");
        }

        System.out.println("\nFinal list of marks:");
        System.out.println(marks);

        sc.close();
    }
}
