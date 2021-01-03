package code._4_student_effort._6_matrix_spiral;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static List<Integer> getSpiralIteration(Integer[][] matrix) {
        List<Integer> result = new LinkedList<>();

        int upperBound = matrix.length;
        int lowerBound = 0;
        int i, j;

        while (lowerBound < upperBound) {
            i = j = lowerBound;

            while (j < upperBound - 1) {
                result.add(matrix[i][j]);
                j++;
            }

            while (i < upperBound - 1) {
                result.add(matrix[i][j]);
                i++;
            }

            while (j > lowerBound) {
                result.add(matrix[i][j]);
                j--;
            }

            while (i > lowerBound) {
                result.add(matrix[i][j]);
                i--;
            }

            lowerBound++;
            upperBound--;
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[][] matrix = new Integer[][] {{1,2,3,4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}};
        System.out.println(getSpiralIteration(matrix));
    }
}
