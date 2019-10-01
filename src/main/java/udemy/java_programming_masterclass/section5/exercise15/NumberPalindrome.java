package udemy.java_programming_masterclass.section5.exercise15;

public class NumberPalindrome {

    public static void main(String[] args) {

        int testowaLiczba = 123;                 // z 123
        int wyciagZProcent = testowaLiczba % 10; // wyciaga 3 "zostawia" ostatnią liczbę
        int wyciagZeSlash = testowaLiczba / 10;  // wyciaga 12 "odcina" ostatnią liczbę

        System.out.println("Testowanie działań, na " + "testowaLiczba: " + testowaLiczba);
        System.out.println("testowaLiczba % 10 = " + wyciagZProcent +
                ", testowaLiczba / 10 = " + wyciagZeSlash);


    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;

        while (number!=0) {
            reverse = (number % 10);
//            reverse + reverse;
        }


        if (reverse == number) {
            return true;
        } else {
            return false;
        }
    }


}
