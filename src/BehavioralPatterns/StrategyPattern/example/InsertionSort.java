package BehavioralPatterns.StrategyPattern.example;

public class InsertionSort implements Sort{
    @Override
    public int[] sort(int[] arr) {
        System.out.println("-- [Insertion Sort] --");
        int len = arr.length;
        for(int i = 1; i < len; i++){
            int j;
            int tmp = arr[i];
            for(j = i; j > 0; j--){
                if(arr[j - 1] > tmp){
                    arr[j] = arr[j - 1];
                }
                else{
                    break;
                }
            }
            arr[j] = tmp;
        }
        return arr;
    }
}
