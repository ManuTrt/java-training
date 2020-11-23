package code._4_student_effort;

public class FizzBuzz {
    private static void checkAndPrint(int i){
        boolean special;

        special = false;

        if (i % 3 == 0){
            special = true;
            System.out.print("Fizz");
        }
        if (i % 5 == 0){
            special = true;
            System.out.print("Buzz");
        }
        if (i % 7 == 0){
            special = true;
            System.out.print("Rizz");
        }
        if (i % 11 == 0){
            special = true;
            System.out.print("Jazz");
        }
        if (!special){
            System.out.print(i);
        }
    }

    public static void start(){
        int i;

        System.out.println("FizzBuzz: ");
        for (i = 1; i < 100 ; i++) {
            checkAndPrint(i);
            System.out.print(",");
        }
        checkAndPrint(i);
        System.out.println("\n");
    }
}
