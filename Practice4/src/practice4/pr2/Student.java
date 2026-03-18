package practice4.pr2;

public class Student extends Person implements CanHavePizza{
    @Override
    public void eatPizza() {
        System.out.println("Student eats Pizza ne yo...");
    }
}
