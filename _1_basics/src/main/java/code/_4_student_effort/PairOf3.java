package code._4_student_effort;

import java.util.Arrays;

public class PairOf3 {
    public static void start() {
        int[] v = {-1, -1, 2, 5, 6, -5, 0};
        boolean[] used = new boolean[v.length];
        int nbOfPairs = 0;

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {
                for (int k = 0; k < v.length; k++) {
                    if (i != j && j != k && i != k){
                        if (v[i] + v[j] + v[k] == 0 && (!used[i] && !used[j] && !used[k])) {
                            used[i] = true;
                            used[j] = true;
                            used[k] = true;
                            nbOfPairs++;
                        }
                    }
                }
            }
        }

        System.out.println("\nPairOf3:");
        System.out.println(Arrays.toString(v) + " has " + nbOfPairs + " pairs ");
    }
}
