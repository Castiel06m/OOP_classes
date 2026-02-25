package laboratory1;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> victims;

    public DragonLaunch() {
        victims = new Vector<>();
    }

    public void kidnap(Person p) {
        victims.add(p);
    }

    public boolean willDragonEatOrNot() {
        int boysWaiting = 0;

        for (Person p : victims) {
            if (p.getGender() == Person.Gender.BOY) {
                boysWaiting++;
            } else {
                if (boysWaiting > 0) {
                    boysWaiting--;
                } else {
                    return true; 
                }
            }
        }

        return boysWaiting > 0;
    }

    public static void main(String[] args) {
        DragonLaunch launch = new DragonLaunch();

        launch.kidnap(new Person("B1", Person.Gender.BOY));
        launch.kidnap(new Person("B2", Person.Gender.BOY));
        launch.kidnap(new Person("G1", Person.Gender.GIRL));
        launch.kidnap(new Person("G2", Person.Gender.GIRL));

        System.out.println("BBGG схавает? " + (launch.willDragonEatOrNot() ? "Да" : "Нет"));

        DragonLaunch launch2 = new DragonLaunch();
        launch2.kidnap(new Person("G1", Person.Gender.GIRL));
        launch2.kidnap(new Person("B1", Person.Gender.BOY));
        launch2.kidnap(new Person("G2", Person.Gender.GIRL));
        launch2.kidnap(new Person("B2", Person.Gender.BOY));

        System.out.println("GBGB схавает? " + (launch2.willDragonEatOrNot() ? "Да" : "Нет"));
    }
}