package udemy.java_programming_masterclass.section5.exercise23;

public class NumberToWords {
//    public static String numberToWords(int number) {
//        if (number < 0) {
//            System.out.println("Invalid Value");
//        }
//
//        return number;
//    }

    public static int reverse(int number) {

        int reversedNumber = 0;
        for (int i = 0; number/10==0; i++) {

            int lastDigit = number / 10;
            reversedNumber *= 10;
            reversedNumber += lastDigit;
        }
        return reversedNumber;
    }

}
