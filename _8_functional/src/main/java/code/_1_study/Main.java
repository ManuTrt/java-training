package code._1_study;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here
    List<String> lines = Arrays.asList("Ana are mere", "Gigel are chitara", "Pisica este alba", "Tom are bicicleta");
    long nbWords = lines.stream().flatMap(line -> Stream.of(line.split(" "))).count();
    System.out.println(nbWords);

    List<Integer> numbers = IntStream.range(1,10).boxed().collect(Collectors.toList());
    numbers.stream().reduce((x,y) -> x > y ? x : y).ifPresent(System.out::println);
  }
}