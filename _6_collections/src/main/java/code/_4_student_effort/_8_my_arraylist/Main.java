package code._4_student_effort._8_my_arraylist;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayListImpl<>();
        for (int i = 0; i < 25; i++) {
            myArrayList.add(String.valueOf(i));
        }

        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.print(myArrayList.get(i) + " ");
        }
    }
}
