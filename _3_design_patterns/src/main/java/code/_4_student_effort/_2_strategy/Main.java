package code._4_student_effort._2_strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArraySorter as = new ArraySorter();
        Integer[] arr = new Integer[] {1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        as.displaySorted(new MergeSort(), copy01OfArr);
        as.displaySorted(new BubbleSort(), copy02OfArr);
    }
}
