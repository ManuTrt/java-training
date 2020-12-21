package code._4_student_effort._5_generic_binary_search;

public class GenericBinarySearch {

    private static <T extends Comparable<T>> boolean isSortedAsc(T[] array){
        boolean check = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i+1]) > 0) {
                check = false;
                break;
            }
        }
        return check;
    }

    private static <T extends Comparable<T>> boolean isSortedDsc(T[] array){
        boolean check = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i+1]) < 0) {
                check = false;
                break;
            }
        }
        return check;
    }

    private static <T extends Comparable<T>> int bSearch(T elem, T[] array, int left, int right, boolean isSortedAsc) {
        int mid = (left + right) / 2;

        if (array[mid].compareTo(elem) == 0) {
            return mid;
        }

        if (left >= right) {
            return -1;
        }

        if (isSortedAsc) {
            if (array[mid].compareTo(elem) > 0) {
                return bSearch(elem, array, left, mid, true);
            } else {
                return bSearch(elem, array, mid + 1, right, true);
            }
        }

        if (array[mid].compareTo(elem) > 0) {
            return bSearch(elem, array, mid + 1, right, false);
        } else {
            return bSearch(elem, array, left, mid, false);
        }
    }

    public static <T extends Comparable<T>> int start(T elem, T[] array) throws ArrayNotSortedException {
        boolean sortedAsc = isSortedAsc(array);
        boolean sortedDsc = isSortedDsc(array);

        if (!sortedAsc && !sortedDsc) {
            throw new ArrayNotSortedException("The array is not sorted!");
        }

        return bSearch(elem, array, 0, array.length - 1, sortedAsc);
    }
}
