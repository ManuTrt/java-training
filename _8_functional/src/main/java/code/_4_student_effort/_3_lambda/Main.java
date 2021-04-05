package code._4_student_effort._3_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static String ex1() {
        List<String> inputList = Arrays.asList("Hello", "End", "Long", "Light", "Other");
        StringBuilder sb = new StringBuilder();

        inputList.forEach(s -> sb.append(s.charAt(0))); // effectively final
        // Another example using streams without StringBuilder
        List<String> l = inputList.stream().map(s -> String.valueOf(s.charAt(0))).collect(Collectors.toList());
        return sb.toString();
    }

    static void ex2() {
        List<String> inputList = new ArrayList<>(Arrays.asList("Hello", "End", "Long", "Light", "Other"));
        inputList = inputList.stream().filter(s -> s.length() % 2 != 0).collect(Collectors.toList());
        System.out.println(inputList);
    }

    static void ex3() {
        List<String> inputList = new ArrayList<>(Arrays.asList("Hello", "End", "Long", "Light", "Other"));
        inputList.replaceAll(String::toUpperCase); // Appliable on iterable collections (lists -> ListIterator)
        System.out.println(inputList);
    }

    static void ex4() {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "First");
        map.put("2", "Second");
        map.put("3", "Third");

        StringBuilder sb = new StringBuilder();

        map.forEach((key, value) -> sb.append(key).append(value));
        System.out.println(sb);
    }

    static void ex5(){
        List<Integer> inputList = Arrays.asList(1,2,3,4,5);
        Thread t = new Thread(() -> inputList.forEach(System.out::println));
        t.start();
    }

    public static void main(String[] args) {
        System.out.println(ex1());
        ex2();
        ex3();
        ex4();
        ex5();
    }
}
