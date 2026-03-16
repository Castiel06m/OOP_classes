package lab2.task5.people.roles;

import lab2.task5.people.human.Person;

public class Employee extends Person {
    private String job;

    public Employee(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    @Override
    public String getOccupation() {
        return "Employee with " + job + " job";
    }
}
