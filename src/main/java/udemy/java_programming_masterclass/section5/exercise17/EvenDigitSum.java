package udemy.java_programming_masterclass.section5.exercise17;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        int sumOfEven = 0;

        if (lastDigit % 2 == 0) {
            sumOfEven = lastDigit;
        }

        int nextDigit = number / 10;

        while (nextDigit > 11) {
            lastDigit = nextDigit % 10;
            if (lastDigit % 2 == 0) {
                sumOfEven += lastDigit;
            }
            nextDigit /= 10;
        }
        if ((nextDigit < 9) && (nextDigit % 2 == 0)) {
            sumOfEven += nextDigit;
        }

        return sumOfEven;
    }
}
