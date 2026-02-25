package laboratory1;

import java.util.*;
import pr2.Student;

public class GradeBook {
    private Course course;
    private Map<Student, Integer> grades; 

    public GradeBook(Course course) {
        this.course = course;
        this.grades = new HashMap<>();
    }

    public void addGrade(Student student, int grade) {
        grades.put(student, grade);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course);
    }

    public void displayGradeReport() {
        if (grades.isEmpty()) {
            System.out.println("No grades entered yet.");
            return;
        }

        double average = determineClassAverage();
        
        Student best = null;
        Student worst = null;
        for (Student s : grades.keySet()) {
            if (best == null || grades.get(s) > grades.get(best)) best = s;
            if (worst == null || grades.get(s) < grades.get(worst)) worst = s;
        }

        System.out.printf("Class average is %.2f. Lowest grade is %d (%s).%n", average, grades.get(worst), worst.getName());
        System.out.printf("Highest grade is %d (%s).%n", grades.get(best), best.getName());

        outputBarChart();
    }

    private double determineClassAverage() {
        int total = 0;
        for (int g : grades.values()) total += g;
        return (double) total / grades.size(); // doublik чтобы не округлял 
    }

    private void outputBarChart() {
        System.out.println("Grades distribution:");
        int[] frequency = new int[11]; 

        for (int grade : grades.values()) 
            frequency[grade / 10]++;

        for (int i = 0; i < frequency.length; i++) {
            if (i == 10) System.out.print("  100: ");
            else System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            for (int stars = 0; stars < frequency[i]; stars++)
                System.out.print("*");
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "GradeBook for " + course.toString();
    }
}