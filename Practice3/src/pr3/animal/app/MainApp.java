package pr3.animal.app;

import pr3.animal.model.*;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("Definietly not a dog", 10000));
        animals.add(new Dog("Pablo", 3, "Golden Retriever"));
        animals.add(new Dog("Jobik", 2, "Beagle"));

        for (Animal a : animals) {
            a.getInfo();
            a.makeSound();
            a.eat("biscuits");
            System.out.println("--------------------");
        }
    }
}