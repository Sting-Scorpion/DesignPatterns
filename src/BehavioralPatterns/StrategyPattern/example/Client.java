package BehavioralPatterns.StrategyPattern.example;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2, 5, 3, 7, 4, 9};
        ArrayHandler ah = new ArrayHandler();
        Sort sort = new InsertionSort();
        ah.setSortAlgorithm(sort);

        int[] result = ah.sort(arr);
        System.out.println(Arrays.toString(result));

        sort = new DeBubbleSort();
        ah.setSortAlgorithm(sort);

        result = ah.sort(arr);
        System.out.println(Arrays.toString(result));
    }
}
