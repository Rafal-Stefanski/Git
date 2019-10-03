package udemy.java_programming_masterclass.section5.exercise19;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int no_1, int no_2, int no_3) {
        while (isValid(no_1) && isValid(no_2) && isValid(no_3)) {
            if (no_1 % 10 == no_2 % 10 || no_2 % 10 == no_3 % 10 || no_1 % 10 == no_3 % 10) {
                return true;
            } else return false;
        }
        return false;
    }

    public static boolean isValid(int no) {
        if (no < 10 || no > 1_000) {
            return false;
        }
        return true;
    }
}
