package lab2.task5.people.roles;

import lab2.task5.people.human.Person;

public class Student extends Person {
    private double gpa;

    public Student(String name, int age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    @Override
    public String getOccupation() {
        return "Student with " + gpa + " gpa";
    }
}
