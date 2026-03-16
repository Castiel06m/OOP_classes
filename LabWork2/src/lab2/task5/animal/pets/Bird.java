package lab2.task5.animal.pets;

import lab2.task5.animal.model.Animal;

public class Bird extends Animal {

    public Bird(String name,  int age) {
        super(name, age);
    }

    @Override
    public String getSound() {
        return "Tweek Tweek!";
    }
}
