package udemy.java_programming_masterclass.section5.exercise15;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int modifiedNumber = number;
        int reversedNo = 0;

        while (modifiedNumber != 0) {
            int digit = modifiedNumber % 10;
            modifiedNumber /= 10;
            reversedNo = reversedNo*10 + digit;
        }

        if (reversedNo == number) {
            return true;
        } else {
            return false;
        }
    }
}
