package udemy.java_programming_masterclass.section5.exercise16;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        int firstDigit = number;

        if (number < 10) {
            return firstDigit * 2;
        }

        while ((firstDigit / 10) != 0) { // działa! :)
            firstDigit = firstDigit / 10;
        }

        return firstDigit + lastDigit;
    }
}
