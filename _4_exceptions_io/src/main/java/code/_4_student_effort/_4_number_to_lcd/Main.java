package code._4_student_effort._4_number_to_lcd;

public class Main {
    public static void main(String[] args) {
        NumberToLCD ntl = new NumberToLCD("","");
        for (int i = 0; i < 10; i++)
            System.out.println(ntl.getLCD(i) + "\n");
    }
}
