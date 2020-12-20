package code._4_student_effort._3_generic_linked_list;

public class Main {
    public static void main(String[] args) {
        String rootValue = "a";
        GenericList<String> list = new GenericList<>(rootValue);

        for (int i = 1; i < 10; i++) {
            list.insert(String.valueOf(Character.valueOf((char) (rootValue.charAt(0) + i))));
        }
        list.println();

        GenericList<GenericList<Integer>> listOflists = new GenericList<>();
        GenericList<Integer> l1 = new GenericList<>();
        GenericList<Integer> l2 = new GenericList<>();
        GenericList<Integer> l3 = new GenericList<>();
        GenericList<Integer> l4 = new GenericList<>();

        for (int i = 0; i < 5; i++) {
            l1.insert(i);
            l2.insert(2*i);
            l3.insert(3*i);
            l4.insert(4*i);
        }

        listOflists.insert(l1);
        listOflists.insert(l2);
        listOflists.insert(l3);
        listOflists.insert(l4);

        System.out.println(listOflists);
    }
}
