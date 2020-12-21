package code._4_student_effort._5_generic_binary_search;

public class Main {
    public static void main(String[] args) {
        Integer[] arrDsc = new Integer[] {9, 7, 5, 3, 1};
        Integer[] arrAsc = new Integer[] {100, 101, 105, 230, 560};
        try {
            System.out.println(GenericBinarySearch.start(7, arrDsc));
            System.out.println(GenericBinarySearch.start(560, arrAsc));
            System.out.println(GenericBinarySearch.start(1021, arrAsc));
        } catch (ArrayNotSortedException e) {
            e.printStackTrace();
        }

        String[] arrAsc2 = new String[] {"ana", "are", "mere", "multe"};
        String[] arrDsc2 = new String[] {"multe", "mere", "are", "ana"};
        try {
            System.out.println(GenericBinarySearch.start("are", arrAsc2));
            System.out.println(GenericBinarySearch.start("ana", arrDsc2));
        } catch (ArrayNotSortedException e) {
            e.printStackTrace();
        }
    }
}
