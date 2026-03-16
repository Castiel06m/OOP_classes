package lab2.task5.people.human;

import lab2.task5.animal.model.Animal;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal pet) {
        this.pet = pet;
    }

    public void removePet() {
        this.pet = null;
    }

    public boolean hasPet() {
        return this.pet != null;
    }

    public Animal  getPet() {
        return this.pet;
    }

    public void leavePetWith(Person taker){
        if (!this.hasPet()) {
            System.out.println(name + " Don't have a pet!");
            return;
        }

        taker.assignPet(this.pet);

        if(taker.getPet() == this.pet){
            this.removePet();
            System.out.println("Pet left with " + taker.name);
        }
    }

    public abstract String getOccupation();

    @Override
    public String toString() {
        return name + " (" + getOccupation() + "), Pet: " + (hasPet() ? pet : "None");
    }

    public void retrievePetFrom(Person taker) {
        if (!taker.hasPet()) {
            System.out.println(taker.name + " doesn't have any pet to return!");
            return;
        }

        this.assignPet(taker.getPet());

        if (this.getPet() == taker.getPet()) {
            taker.removePet();
            System.out.println(this.name + " retrieved the pet from " + taker.name);
        }

    }
}
