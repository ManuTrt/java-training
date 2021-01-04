package code._4_student_effort._9_my_set;

public class Main {
    public static void main(String[] args) {
        MySet<Integer> mySet = new MySetImpl<>();
        for (int i = 0; i < 25; i++) {
            mySet.add(i%6);
        }

        for (int i = 0; i < mySet.size(); i++) {
            System.out.print(mySet.get(i) + " ");
        }
    }
}
