package udemy.java_programming_masterclass.section5;

public class DigitSumChallenge {

    public static void main(String[] args) {
        int testowaLiczba = 123;                 // z 123
        int wyciagZProcent = testowaLiczba % 10; // wyciaga 3
        int wyciagZeSlash = testowaLiczba / 10;  // wyciaga 12

        System.out.println("Testowanie działań, na " + "testowaLiczba: " + testowaLiczba);
        System.out.println("testowaLiczba % 10 = " + wyciagZProcent + ", testowaLiczba / 10 = " + wyciagZeSlash);

        System.out.println("\n=== Challenge ===");
        System.out.println("sumDigits(125)-> " + sumDigits(125));
        System.out.println("sumDigits(-125)-> " + sumDigits(-125));
        System.out.println("sumDigits(4)-> " + sumDigits(4));
        System.out.println("sumDigits(32123)-> " + sumDigits(32123));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        do {
            sum += (number % 10);
            number = number / 10;
        } while (number / 10 != 0);

        while (number / 10 < 10) {
            sum += number;
            break;
        }
        return sum;
    }
}
