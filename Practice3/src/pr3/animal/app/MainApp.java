package pr3.animal.app;

import java.util.ArrayList;
import java.util.List;
import pr3.animal.model.*;

public class MainApp {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        
        Animal hooper = new Dog("Hoopa", 2, "Boba");

        animals.add(hooper);
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