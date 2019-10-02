package udemy.java_programming_masterclass.section5.exercise15;

public class Main {
    public static void main(String[] args) {

        int testowaLiczba = 123;                 // z 123
        int wyciagZProcent = testowaLiczba % 10; // wyciaga 3 "zostawia" ostatnią liczbę
        int wyciagZeSlash = testowaLiczba / 10;  // wyciaga 12 "odcina" ostatnią liczbę

        System.out.println("Testowanie działań, na " + "testowaLiczba: " + testowaLiczba);
        System.out.println("testowaLiczba % 10 = " + wyciagZProcent +
                ", testowaLiczba / 10 = " + wyciagZeSlash);

        System.out.println("***  ***  ***  ***\nisPalindrome(121) should be true and is -> " +
                NumberPalindrome.isPalindrome(121) + face(NumberPalindrome.isPalindrome(121)));
        System.out.println("isPalindrome(707) should be true and is -> " +
                NumberPalindrome.isPalindrome(707) + face(NumberPalindrome.isPalindrome(707)));
        System.out.println("isPalindrome(11212) should be false and is -> " +
                NumberPalindrome.isPalindrome(11212) + face(NumberPalindrome.isPalindrome(11212)));
    }


    private static String face(boolean palindrome) {
        if (palindrome) {
            return " :)";
        } else {
            return " :(";
        }
    }
}
