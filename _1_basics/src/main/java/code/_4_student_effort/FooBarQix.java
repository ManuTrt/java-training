package code._4_student_effort;

public class FooBarQix {
    public static String compute2(int n){
        String result = "";
        boolean special;

        special = false;

        if (n % 3 == 0){
            special = true;
            result += "Foo";
        }
        if (n % 5 == 0){
            special = true;
            result += "Bar";
        }
        if (n % 7 == 0){
            special = true;
            result += "Qix";
        }
        if (!special){
            return result + numberWithChangedZeroes(n);
        }

        return result + computeForDigitsWithZero(n);
    }

    private static String numberWithChangedZeroes(int n) {
        String result = "";

        for (char c : String.valueOf(n).toCharArray()){
            if (c == '0'){
                result += '*';
            } else {
                result += c;
            }
        }
        return result;
    }

    private static String computeForDigitsWithZero(int n) {
        String result = "";

        for (char c : String.valueOf(n).toCharArray()){
            switch (c) {
                case '3': result += "Foo"; break;
                case '5': result += "Bar"; break;
                case '7': result += "Qix"; break;
                case '0': result += "*"; break;
                default:
            }
        }
        return result;
    }

    public static String compute(int n){
        String result = "";
        boolean special;

        special = false;

        if (n % 3 == 0){
            special = true;
            result += "Foo";
        }
        if (n % 5 == 0){
            special = true;
            result += "Bar";
        }
        if (n % 7 == 0){
            special = true;
            result += "Qix";
        }
        if (!special){
            return result + n;
        }

        return result + computeForDigits(n);
    }

    private static String computeForDigits(int n) {
        String result = "";

        for (char c : String.valueOf(n).toCharArray()){
            switch (c) {
                case '3': result += "Foo"; break;
                case '5': result += "Bar"; break;
                case '7': result += "Qix"; break;
                default:
            }
        }
        return result;
    }

    public static void start(){
        int i;
        System.out.println("FooBarQix -> compute:");

        for (i = 1; i < 100 ; i++) {
            System.out.print(compute(i));
            System.out.print(",");
        }
        System.out.println(compute(i));
        System.out.println("FooBarQix -> compute2:");

        for (i = 1; i < 100 ; i++) {
            System.out.print(compute2(i));
            System.out.print(",");
        }
        System.out.println(compute2(i));
    }
}
