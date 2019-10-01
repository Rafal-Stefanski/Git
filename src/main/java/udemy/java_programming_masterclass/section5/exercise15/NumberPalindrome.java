package udemy.java_programming_masterclass.section5.exercise15;

public class NumberPalindrome {

    public static void main(String[] args) {

        int testowaLiczba = 123;                 // z 123
        int wyciagZProcent = testowaLiczba % 10; // wyciaga 3 "zostawia" ostatnią liczbę
        int wyciagZeSlash = testowaLiczba / 10;  // wyciaga 12 "odcina" ostatnią liczbę

        System.out.println("Testowanie działań, na " + "testowaLiczba: " + testowaLiczba);
        System.out.println("testowaLiczba % 10 = " + wyciagZProcent +
                ", testowaLiczba / 10 = " + wyciagZeSlash);

//        System.out.println("***  ***  ***  ***\nisPalindrome(121) should be true and is -> " +
//                isPalindrome(121) + face(isPalindrome(121)));
//        System.out.println("isPalindrome(707) should be true and is -> " +
//                isPalindrome(707) + face(isPalindrome(707)));
//        System.out.println("isPalindrome(11212) should be true and is -> " +
//                isPalindrome(11212) + face(isPalindrome(11212)));
        System.out.println(isPalindrome(11212));
    }

    private static String face(boolean palindrome) {
        if (palindrome) {
            return " :)";
        } else {
            return " :(";
        }
    }

    public static boolean isPalindrome(int number) {

        int modifiedNumber = number;
        int reversedNumber = 0;
        int factor = 10;

        while (modifiedNumber != 0) {
            int digit = modifiedNumber % 10;
            modifiedNumber /= 10;
            reversedNumber += (int) (digit * (factor * 0.1));
            factor = factor * 10;
        }


        if (reversedNumber == number) {
            return true;
        } else {
            return false;
        }
    }


}
