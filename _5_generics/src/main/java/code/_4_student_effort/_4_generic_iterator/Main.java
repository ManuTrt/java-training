package code._4_student_effort._4_generic_iterator;

import code._4_student_effort._3_generic_linked_list.GenericList;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1, 2, 3};
        IArrayIterator<Integer> it = new ArrayIterator<>(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        String rootValue = "a";
        GenericList<String> list = new GenericList<>(rootValue);
        IArrayIterator<String> it2 = new ArrayIterator<String>(list);

        for (int i = 1; i < 10; i++) {
            list.insert(String.valueOf(Character.valueOf((char) (rootValue.charAt(0) + i))));
        }

        System.out.println();
        while (it2.hasNext()) {
            System.out.print(it2.next() + " ");
        }
    }
}
