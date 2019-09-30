package udemy.java_programming_masterclass.section5;

public class DigitSumChallenge {
    public static void main(String[] args) {
        int testowaliczba = 1;                 // z 123
        int wyciagZProcent = testowaliczba % 10; // wyciaga 3
        int wyciagZeSlash = testowaliczba / 10;  // wyciaga 12

        System.out.println(wyciagZProcent);
        System.out.println(wyciagZeSlash);
        System.out.println("=== Challenge ===");
        System.out.println("-> " + sumDigits(125));
    }


    public static int sumDigits(int number) {
        int sum = 0;
        do {
            sum = sum + (number % 10);
        } while (number / 10 == 0);


        //        if (number < 10) {
//            return -1;
//        }
//
//        do {
//            sum += number % 10;
//        } while (number > 9);
//        return sum;

//        int sumOfDigits = 0;
//        for (int i = number % 10; i > 9; i = number / 10) {
//            sumOfDigits += i;
//        }
        return sum;
    }
}
