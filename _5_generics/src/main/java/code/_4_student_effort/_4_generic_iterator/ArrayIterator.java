package code._4_student_effort._4_generic_iterator;

import code._4_student_effort._3_generic_linked_list.GenericList;
import code._4_student_effort._3_generic_linked_list.IGenericList;
import code._4_student_effort._3_generic_linked_list.IGenericNode;

import java.util.NoSuchElementException;

public class ArrayIterator<T> implements IArrayIterator<T> {
    private T[] array;
    private int position;
    private IGenericList<T> list;
    private IGenericNode<T> currentNode;

    public ArrayIterator(T[] array) {
        this.array = array;
        this.position = 0; // implicit oricum, but just to be sure
        this.list = null;
    }

    public ArrayIterator(IGenericList<T> list) {
        this.array = null;
        this.list = list;
        this.currentNode = ((GenericList<T>)list).head;
    }

    @Override
    public boolean hasNext() {
        if (array != null){
            return (position < array.length);
        }
        return currentNode != null;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more elements!");
        } else if (array != null) {
            T elem = array[position];
            position++;
            return elem;
        }
        T elem = currentNode.getValue();
        currentNode = currentNode.getNext();
        return elem;
    }
}
