package code._4_student_effort._2_strategy;

public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(Integer[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j].compareTo(list[j + 1]) > 0) {
                    int aux = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = aux;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
