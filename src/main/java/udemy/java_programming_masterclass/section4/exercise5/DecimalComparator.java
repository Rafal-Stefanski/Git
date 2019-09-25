package udemy.java_programming_masterclass.section4.exercise5;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        firstNumber = firstNumber * 1000;
        secondNumber = secondNumber * 1000;
        int firstNumber3dec = (int) firstNumber;
        int secondNumber3dec = (int) secondNumber;

        if (firstNumber3dec == secondNumber3dec) {
            return true;
        } else {
            return false;
        }
    }
}