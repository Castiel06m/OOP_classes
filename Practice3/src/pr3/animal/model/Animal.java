package pr3.animal.model;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("The animal makes a generic sound.");
    }

    // eat overload
    public void eat() {
        System.out.println(name + " is eating.");
    }
    public void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }


    public void getInfo() {
        System.out.println("Animal Name: " + name + ", Age: " + age);
    }
}