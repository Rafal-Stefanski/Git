package udemy.java_programming_masterclass.section5.exercise19;

public class Main {
    public static void main(String[] args) {
        System.out.println(LastDigitChecker.hasSameLastDigit(41, 22, 71) + " - should return 'true'");
        System.out.println(LastDigitChecker.hasSameLastDigit(23, 32, 42) + " - should return 'true'");
        System.out.println(LastDigitChecker.hasSameLastDigit(9, 99, 999) + " - should return 'false'");
        System.out.println(LastDigitChecker.hasSameLastDigit(22, 23, 34) + " - should return 'false'");
    }
}
