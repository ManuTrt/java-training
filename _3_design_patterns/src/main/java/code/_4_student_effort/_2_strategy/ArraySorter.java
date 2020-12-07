package code._4_student_effort._2_strategy;

public class ArraySorter {
    public void displaySorted(SortingStrategy strategy, Integer[] arr){
        strategy.sort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
