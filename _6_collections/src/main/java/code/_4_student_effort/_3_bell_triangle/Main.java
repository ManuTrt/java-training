package code._4_student_effort._3_bell_triangle;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void generateBellTriangle(int n) {
        LinkedList<Integer> currentRow = new LinkedList<>(List.of(1));

        while (n >= 0) {
            printRow(currentRow, n);
            LinkedList<Integer> nextRow = new LinkedList<>();
            nextRow.add(currentRow.getLast());
            for (int i = 0; i < currentRow.size(); i++) {
                nextRow.add(i+1, currentRow.get(i) + nextRow.get(i));
            }
            currentRow = nextRow;
            n--;
        }
    }

    private static void printRow(LinkedList<Integer> list, int nthRow) {
        for (Integer elem : list) {
            if (!elem.equals(0)){
                System.out.print(elem + " ");
            }
        }

        for (int i = 0; i < nthRow; i++) {
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        generateBellTriangle(10);
    }
}
