package pr3.animal.model;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // колим конструктор animal
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }

    @Override
    public void getInfo() { 
        super.getInfo(); // тоже через animal
        System.out.println("Breed: " + breed);
    }
}