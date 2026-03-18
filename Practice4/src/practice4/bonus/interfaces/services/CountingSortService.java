package practice4.bonus.interfaces.services;

import practice4.bonus.interfaces.model.SortConfig;

public class CountingSortService {
    public void sortAndPrint(int[] arr) {
        int[] count = new int[SortConfig.MAX_VALUE + 1];

        for (int num : arr) {
            if (num >= 0 && num <= SortConfig.MAX_VALUE) {
                count[num]++;
            }
        }

        System.out.print("Sorted Array -> ");
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                System.out.print(i + " ");
                count[i]--;
            }
        }
        System.out.println();
    }
}