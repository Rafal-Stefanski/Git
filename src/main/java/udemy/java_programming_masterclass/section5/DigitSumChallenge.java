package udemy.java_programming_masterclass.section5;

public class DigitSumChallenge {
    public static void main(String[] args) {
        int testowaliczba = 123;                         // z 123
        int wyciagZTestowejProcent = testowaliczba % 10; // wyciaga 3
        int wyciagZTestowejSlassh = testowaliczba / 10;  // wyciaga 12

        System.out.println(wyciagZTestowejProcent);
        System.out.println(wyciagZTestowejSlassh);
        System.out.println("");
        System.out.println(sumDigits(125));
    }


    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sumOfDigits = 0;
        for (int i = number % 10; i > 9; i = number / 10) {
            sumOfDigits += i;
        }
        return sumOfDigits;
    }
}
