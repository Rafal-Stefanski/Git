package udemy.java_programming_masterclass.section5.exercise23;

public class NumberToWords {
//    public static String numberToWords(int number) {
//        if (number < 0) {
//            System.out.println("Invalid Value");
//        }
//
//        for (int i = )
//
//        return number;
//    }

    public static int reverse(int number) {
        int reveresedNumber = 0;
        while (number != 0) {
            int LastDigit = number % 10;
            number /=10;
            reveresedNumber = reveresedNumber * 10 + LastDigit;
        }
        return reveresedNumber;
    }

}
