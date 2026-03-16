package lab2.task5.main;

import lab2.task5.animal.model.Animal;
import lab2.task5.animal.pets.Cat;
import lab2.task5.people.human.Person;
import lab2.task5.people.roles.Employee;
import lab2.task5.people.roles.PhDStudent;
import lab2.task5.registry.PersonRegistry;

public class MainApp {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science");
        Animal murka = new Cat("Murka", 5);
        john.assignPet(murka); // John owns Rex
        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
// John goes on vacation and leaves Rex with Alice
        john.leavePetWith(alice);
// Registry reflects that Alice is taking care of Rex
        System.out.println(registry);
// John returns from vacation and retrieves Rex
        john.retrievePetFrom(alice);
// Registry reflects that John has his dog back
        System.out.println(registry);
    }
}
