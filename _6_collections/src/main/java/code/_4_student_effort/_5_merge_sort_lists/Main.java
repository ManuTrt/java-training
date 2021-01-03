package code._4_student_effort._5_merge_sort_lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static List<Integer> merge(List<Integer> l1, List<Integer> l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null){
            return l1;
        }
        List<Integer> l3 = new LinkedList<>();

        Iterator<Integer> it1 = l1.iterator();
        Iterator<Integer> it2 = l2.iterator();
        boolean advanceList1 = true;
        boolean advanceList2 = true;

        Integer currentElemL1 = null;
        Integer currentElemL2 = null;
        while (it1.hasNext() && it2.hasNext()) {
            System.out.println("yes");
            // Avansam cu iteratorul in prima lista
            if (advanceList1) {
                currentElemL1 = it1.next();
            }
            // Avansam cu iteratorul in lista a doua
            if(advanceList2) {
                currentElemL2 = it2.next();
            }

            if (currentElemL1.compareTo(currentElemL2) < 0) {
                System.out.println("added from l1");
                l3.add(currentElemL1);
                advanceList1 = true;
                advanceList2 = false;
            } else {
                System.out.println("added from l2");
                l3.add(currentElemL2);
                advanceList1 = false;
                advanceList2 = true;
            }
        }

        // Daca ultima oara a avansat iteratorul pe lista 2,
        // inseamna ca ultimul element adaugat in l3 este din l2
        // si l2 nu mai are elemente in plus, deci vom pune restul
        // de elemente din l1
        if (advanceList2) {
            while (it1.hasNext()) {
                l3.add(currentElemL1);
                currentElemL1 = it1.next();
            }
            l3.add(currentElemL1);
        } else { // analog l1
            while (it2.hasNext()) {
                l3.add(currentElemL2);
                currentElemL2 = it2.next();
            }
            l3.add(currentElemL2);
        }

        return l3;
    }

    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>(List.of(1,5,6,7,8,9));
        List<Integer> l2 = new LinkedList<>(List.of(2,3,4));
        System.out.println(merge(l1, l2));
    }
}
