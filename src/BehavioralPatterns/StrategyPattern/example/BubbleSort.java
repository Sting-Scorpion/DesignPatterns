package BehavioralPatterns.StrategyPattern.example;

public class BubbleSort implements Sort{
    @Override
    public int[] sort(int[] arr) {
        System.out.println("-- [Bubble Sort] --");
        int len = arr.length;
        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len; j++){
                int tmp;
                if(arr[i] > arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}
