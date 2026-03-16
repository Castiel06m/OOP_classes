package lab2.task5.animal.pets;

import lab2.task5.animal.model.Animal;

public class Fish extends Animal {

    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Бульк...";
    }
}
