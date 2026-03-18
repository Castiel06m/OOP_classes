package practice4.pr2;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Cat myCat = new Cat();
        Student me = new Student();

        System.out.println("serving a Cat <3");
        restaurant.servePizza(myCat);

        System.out.println("serving a Student :(");
        restaurant.servePizza(me);
    }
}