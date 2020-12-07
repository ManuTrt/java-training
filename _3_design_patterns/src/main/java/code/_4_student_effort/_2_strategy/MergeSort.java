package code._4_student_effort._2_strategy;

public class MergeSort implements SortingStrategy {
    @Override
    public void sort(Integer[] list) {
        mergesort(list, 0, list.length - 1);
    }

    public void mergesort(Integer[] v, int left, int right){
        if (left >= right)
            return;
        int middle = (left + right) / 2;

        mergesort(v, left, middle);
        mergesort(v, middle + 1, right);
        merge(v, left, middle, right);
    }

    private static void merge(Integer[] v, int left, int middle, int right) {
        int n = right - left + 1;
        Integer[] aux = new Integer[n];

        int Lidx = left; //indexul ce va parcurge jumatatea stanga
        int Ridx = middle + 1; //indexul ce va parcurge jumatatea dreapta
        int AXidx = 0; //indexul ce parcurge vectorul auxiliar

        while (Lidx <= middle && Ridx <= right) {
            if (v[Lidx].compareTo(v[Ridx]) < 0)
                aux[AXidx++] = v[Lidx++];
            else
                aux[AXidx++] = v[Ridx++];
        }

        while (Lidx <= middle) {
            aux[AXidx++] = v[Lidx++];
        }

        while (Ridx <= right) {
            aux[AXidx++] = v[Ridx++];
        }

        for (int i = left; i <= right; i++) {
            v[i] = aux[i - left];
        }
    }
}
