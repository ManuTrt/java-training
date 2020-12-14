package code._4_student_effort._4_number_to_lcd;

import java.util.HashMap;

public class NumberToLCD {
    private String input_file_path;
    private String output_file_path;
    private int width, height;
    private HashMap<Integer, String> letterLcdMap;

    public NumberToLCD(String input_file_path, String output_file_path, int width, int height) {
        this.input_file_path = input_file_path;
        this.output_file_path = output_file_path;
        this.width = width;
        this.height = height;
        letterLcdMap = initMap();
    }

    public NumberToLCD(String input_file_path, String output_file_path) {
        this(input_file_path, output_file_path, 1, 3);
    }

    private HashMap<Integer, String> initMap(){
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(0, " _ \n| |\n|_|");
        hm.put(1, "|\n|");
        hm.put(2, " _\n _|\n|_ ");
        hm.put(3, "_ \n_|\n_|");
        hm.put(4, "   \n|_|\n  |");
        hm.put(5, " _ \n|_ \n _|");
        hm.put(6, " _ \n|_ \n|_|");
        hm.put(7, "_ \n |\n |");
        hm.put(8, " _ \n|_|\n|_|");
        hm.put(9, " _ \n|_|\n _|");

        return hm;
    }

    private String letterToLCD(int letter) {
        return letterLcdMap.get(letter);
    }

    public String getLCD(int n)
    {
        return letterToLCD(n);
    }
}
