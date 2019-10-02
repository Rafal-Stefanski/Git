package udemy.java_programming_masterclass.section5.exercise16;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        int firstDigit = 0;

        while (lastDigit != 0) {

        }


        return firstDigit + lastDigit;

    }
}
