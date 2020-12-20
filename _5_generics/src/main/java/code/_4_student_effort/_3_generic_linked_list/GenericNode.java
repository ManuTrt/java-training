package code._4_student_effort._3_generic_linked_list;

public class GenericNode<T> implements IGenericNode<T> {
    private T value;
    private IGenericNode<T> next;

    public GenericNode(T value) {
        this.value = value;
        this.next = null;
    }

    @Override
    public T getValue() {
        return value;
    }

    @Override
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public IGenericNode<T> getNext() {
        return next;
    }

    @Override
    public void setNext(IGenericNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
