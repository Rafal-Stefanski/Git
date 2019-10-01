package udemy.java_programming_masterclass.section5;

public class DigitSumChallenge {

    public static void main(String[] args) {
        int testowaLiczba = 123;                 // z 123
        int wyciagZProcent = testowaLiczba % 10; // wyciaga 3
        int wyciagZeSlash = testowaLiczba / 10;  // wyciaga 12

        System.out.println("Testowanie działań, na " + "testowaLiczba: " + testowaLiczba);
        System.out.println("testowaLiczba % 10 = " + wyciagZProcent + ", testowaLiczba / 10 = " + wyciagZeSlash);

        System.out.println("\n=== Challenge (moje rozwiązanie) ===");
        System.out.println("sumDigits(125)-> " + sumDigits(125));
        System.out.println("sumDigits(-125)-> " + sumDigits(-125));
        System.out.println("sumDigits(4)-> " + sumDigits(4));
        System.out.println("sumDigits(32123)-> " + sumDigits(32123));
        
        System.out.println("\n=== Challenge (rozwiązanie z kursu) ===");
        System.out.println("sumOfDigits(125)-> " + sumOfDigits(125));
        System.out.println("sumOfDigits(-125)-> " + sumOfDigits(-125));
        System.out.println("sumOfDigits(4)-> " + sumOfDigits(4));
        System.out.println("sumOfDigits(32123)-> " + sumOfDigits(32123));
    }

    // moje rozwiązanie
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

    // rozwiązanie z kursu
    public static int sumOfDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;

        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number > 0) {
            // extract lest-significant digit
            int digit = number % 10;
            sum += digit;
            
            // drop lest-significant digit
            number /= 10;   // same as number = number / 10;
        }
        return sum;
    }

}
