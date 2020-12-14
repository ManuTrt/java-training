package code._4_student_effort._2_pairs;

public class Main {
    public static void main(String[] args) {
        Running r1 = new Running();
        Running r2 = new Running();
        Boot boot = new Boot();

        // tip parametrizat
        Pair<Running> pair = new Pair(r1, r2);
        // tip raw => compilatorul va face o
        // inferenta de tip si va alege superclasa
        // comuna celor doua ca tip
        Pair pair2 = new Pair(r1, boot);

    }
}
