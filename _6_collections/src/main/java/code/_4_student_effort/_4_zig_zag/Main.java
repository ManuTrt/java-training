package code._4_student_effort._4_zig_zag;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void ZigZagList(List<Integer> list){
        for (int i = 0; i < list.size() - 1; i++) {
            if (i % 2 == 0) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    Collections.swap(list, i, i+1);
                }
            } else {
                if (list.get(i).compareTo(list.get(i + 1)) < 0) {
                    Collections.swap(list, i, i+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(List.of(4,3,7,8,6,2,1));
        System.out.println("Input: " + list);
        ZigZagList(list);
        System.out.println("Output: " + list);
    }
}
