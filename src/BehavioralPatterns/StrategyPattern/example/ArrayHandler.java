package BehavioralPatterns.StrategyPattern.example;

public class ArrayHandler {
    private Sort sortAlgorithm;

    public int[] sort(int[] arr){
        sortAlgorithm.sort(arr);
        return arr;
    }

    public void setSortAlgorithm(Sort sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
}
