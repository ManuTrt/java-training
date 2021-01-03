package code._4_student_effort._1_leaders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void displayLeaders(List<Integer> list) {
        Collections.reverse(list);
        Iterator<Integer> it = list.iterator();
        Integer currentElement;
        Integer max = list.get(0);
        while (it.hasNext()){
            currentElement = it.next();
            if (currentElement >= max) {
                max = currentElement;
                System.out.println(max);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(16,2,1,3,12,11));
        displayLeaders(list);
    }
}
