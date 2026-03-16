package lab2.task5.animal.model;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract String getSound();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{name=" + name + ", age=" + age + "}";
    }
}
