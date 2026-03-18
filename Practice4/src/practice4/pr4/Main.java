package practice4.pr4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Miroslav", 3.16));
        students.add(new Student("Bekzat", 2.6));
        students.add(new Student("Bobik", 4.0));

        System.out.println("Original list: " + students);

        Collections.sort(students);
        System.out.println("Sorted by GPA (Default): " + students);

        Collections.sort(students, new NameComparator());
        System.out.println("Sorted by Name (Comparator): " + students);
    }
}