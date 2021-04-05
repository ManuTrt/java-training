package code._4_student_effort._2_predicate;

import org.junit.Assert;

import java.util.Objects;
import java.util.function.Predicate;

public class Main {
    public static void predicate_1() {
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> notPredicate = p1.negate();
        Assert.assertFalse(notPredicate.test(""));
        Assert.assertTrue(notPredicate.test("Not empty"));
    }

    public static void predicate_2() {
        Predicate<String> p1 = Objects::nonNull;
        Predicate<String> p2 = s -> !s.isEmpty();

        Predicate<String> p3 = p1.and(p2);
        Assert.assertFalse(p3.test(""));
        Assert.assertFalse(p3.test(null));
        Assert.assertTrue(p3.test("Not empty!"));
    }

    public static void predicate_3() {
        Predicate<String> p1 = s -> s.length() == 4;
        Predicate<String> p2 = s -> s.startsWith("J");

        // XOR
        Predicate<String> p3 = p1.negate().and(p2).or(p1.and(p2.negate()));
        Assert.assertTrue(p3.test("True"));
        Assert.assertTrue(p3.test("Julia"));
        Assert.assertFalse(p3.test("Java"));
    }

    public static void main(String[] args) {
        predicate_1();
        predicate_2();
        predicate_3();
    }
}
