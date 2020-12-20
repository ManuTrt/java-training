package code._4_student_effort._3_generic_linked_list;

public class GenericList<T> implements IGenericList<T>{
    public IGenericNode<T> head;

    public GenericList() {
        head = null;
    }

    public GenericList(T headValue) {
        head = new GenericNode<>(headValue);
        head.setNext(null);
    }

    @Override
    public void insert(T element) {
        if (head == null) {
            head = new GenericNode<>(element);
            head.setNext(null);
        } else {
            GenericNode<T> temp = (GenericNode<T>) head;

            while (temp.getNext() != null) {
                temp = (GenericNode<T>) temp.getNext();
            }
            temp.setNext(new GenericNode<>(element));
        }
    }

    @Override
    public void println() {
        GenericNode<T> temp = (GenericNode<T>) head;

        while (temp != null) {
            System.out.println(temp);
            temp = (GenericNode<T>) temp.getNext();
        }
    }

    @Override
    public String toString() {
        String output = "";
        GenericNode<T> temp = (GenericNode<T>) head;

        output += "[";
        while (temp.getNext() != null) {
            output += temp.getValue().toString() + ", ";
            temp = (GenericNode<T>) temp.getNext();
        }
        output += temp.getValue().toString() + "]";

        return output;
    }
}
