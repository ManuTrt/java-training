package code._4_student_effort;

import java.util.Arrays;
import java.util.HashSet;

public class PairOf2 {
    public static void start() {
        int[] v = {3, 2, -3, -3, -2, 3, 6, 7, 9};
        int numberOfPairs = 0;
        HashSet<Integer> hs = new HashSet<>();

        for (int n : v) {
            // verific daca exista pereche
            boolean hasPair = hs.contains(-n);

            // daca nu exista, adaug numarul in eventualitatea gasirii ulterioare
            // a unei perechi
            if (!hasPair){
                hs.add(n);
            }else {
                // daca am gasit o pereche, sterg perechea si incrementez numarul de perechi
                hs.remove(-n);
                numberOfPairs++;
            }
        }

        System.out.println("\nPairOf2:");
        System.out.println(Arrays.toString(v) + " has " + numberOfPairs + " pairs ");
    }
}
