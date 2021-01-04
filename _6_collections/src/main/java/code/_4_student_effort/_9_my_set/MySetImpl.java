package code._4_student_effort._9_my_set;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MySetImpl<T> implements MySet<T>{
    private Object[] array;
    private int size, initialCapacity;

    public MySetImpl() {
        size = 0;
        initialCapacity = 10;
        array = new Object[initialCapacity];
    }

    @Override
    public void add(T e) {
        if (!contains(e)){
            if (size == initialCapacity){
                initialCapacity *= 2;
                array = Arrays.copyOf(array, initialCapacity);
            }
            array[size] = e;
            size++;
        }
    }

    @Override
    public void remove(T e) {
        int idx = -1;

        for (int i = 0; i < size; i++) {
            if (array[i] == e) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            throw new NoSuchElementException();
        } else {
            array[idx] = null;
            size--;
            while (idx + 1 < size) {
                array[idx] = array[idx + 1];
                idx++;
            }
        }
    }

    @Override
    public T get(int index) {
        if (index > size - 1 || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index + " out of bounds - size: " + size);
        }

        return (T) array[index];
    }

    @Override
    public void set(int index, T e) {
        if (index > size - 1 || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index + " out of bounds - size: " + size);
        }

        array[index] = e;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T e) {
        int idx = -1;

        for (int i = 0; i < size; i++) {
            if (array[i] == e) {
                idx = i;
                break;
            }
        }

        return idx != -1;
    }
}
