package lab2.task5.registry;

import lab2.task5.people.human.Person;

import java.util.Vector;

public class PersonRegistry {
    private Vector<Person> people = new Vector<>();

    public void addPerson(Person person) {
        people.add(person);
    }
    public void removePerson(Person person) {
        people.remove(person);
    }
    public void printAll(){
        for(Person person : people){
            System.out.println(person);
        }
    }

    @Override
    public String toString() {
        String result = "Current Registry\n";
        for (Person p : people) {
            result += p.toString() + "\n";
        }
        return result;
    }
}
