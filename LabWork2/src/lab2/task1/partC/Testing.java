package lab2.task1.partC;

import java.util.HashSet;

public class Testing {
    public static void main(String[] args) {
        HashSet<Food> eda = new HashSet<>();

        Pizza p1 = new Pizza("Peperonni Margaritti", 1200, "Cheeeeeese");
        Pizza p2 = new Pizza("Peperonni Margaritti", 1200, "Cheeeeeese");
        Pizza p3 = new Pizza("Peperonni Margaritti", 1200, "Cheeeeeese");
        Pizza p4 = new Pizza("4etire Sira", 1000, "Extra cheesy");

        Food f1 = new Food("Nuggets", 500);

        eda.add(p1);
        eda.add(p2);
        eda.add(p3);
        eda.add(p4);
        eda.add(f1);

        for(Food f : eda){
            System.out.println(f);
        }

        System.out.println("---------");
        System.out.println(eda.size());

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(f1));
    }
}
