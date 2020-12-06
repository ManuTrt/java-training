package code._4_student_effort._1_iterator;

public class ArrayCustomIterator {
    private int[] array;
    private int position;

    public ArrayCustomIterator(int[] array){
        this.array = array;
    }

    public boolean hasNext() {
        return (position < array.length);
    }

    public int next() {
        return array[position++];
    }
}
