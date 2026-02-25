package laboratory1;

import java.util.Scanner;
import pr2.Student;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Course myCourse = new Course("CS101", "Object-oriented Programming", 5, "None");
        GradeBook gb = new GradeBook(myCourse);

        gb.displayMessage();

        Student[] students = {
            new Student("Student A", 101),
            new Student("Student B", 102),
            new Student("Student C", 103),
            new Student("Student D", 104),
            new Student("Student E", 105),
            new Student("Student F", 106)
        };

        System.out.println("Please, input grades for students:");
        for (Student s : students) {
            System.out.print(s.getName() + ": ");
            int grade = sc.nextInt();
            gb.addGrade(s, grade);
        }

        gb.displayGradeReport();

        sc.close();
    }
}