package lab2.task5.people.roles;

import lab2.task5.animal.model.Animal;
import lab2.task5.animal.pets.Dog;
import lab2.task5.people.human.Person;

import java.util.Vector;

public class PhDStudent extends Person {
    private String researchTopic;
    public PhDStudent(String name, int age, String topic) {
        super(name, age);
        this.researchTopic = topic;
    }

    @Override
    public void assignPet(Animal pet) {
        if(pet instanceof Dog){
            System.out.println("PhDStudent is busy for dogs!");
        } else{
            super.assignPet(pet);
        }
    }

    @Override
    public String getOccupation() {
        return "PhDStudent is working on " + researchTopic;
    }
}
