package practice4.bonus.interfaces.main;

import practice4.bonus.interfaces.services.CountingSortService;

public class Main {
    public static void main(String[] args) {
        CountingSortService service = new CountingSortService();

        int[] testArray = {10, 10, 3, 9, 1, 3, 2, 8, 7, 5};

        System.out.println("Original array -> 10, 10, 3, 9, 1, 3, 2, 8, 7, 5");
        service.sortAndPrint(testArray);
    }
}