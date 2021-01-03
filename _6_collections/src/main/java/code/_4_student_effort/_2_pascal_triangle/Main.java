package code._4_student_effort._2_pascal_triangle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void generatePascalTriangle(int n) {
        LinkedList<Integer> currentRow = new LinkedList<>(List.of(0,1,0));

        while (n >= 0) {
            printRow(currentRow, n);
            LinkedList<Integer> nextRow = new LinkedList<>();
            for (int i = 0; i < currentRow.size() - 1; i++) {
                nextRow.add(currentRow.get(i) + currentRow.get(i+1));
            }
            nextRow.addFirst(0);
            nextRow.addLast(0);
            currentRow = nextRow;
            n--;
        }
    }

    private static void printRow(LinkedList<Integer> list, int nthRow) {
        for (int i = 0; i < nthRow; i++) {
            System.out.print(" ");
        }

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
        generatePascalTriangle(10);
    }
}
