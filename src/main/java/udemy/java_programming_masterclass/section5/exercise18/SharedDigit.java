package udemy.java_programming_masterclass.section5.exercise18;

public class SharedDigit {
    public static boolean hasSharedDigit(int no_1, int no_2) {
        while ((no_1 >= 10 && no_1 <= 99) && (no_2 >= 10 && no_2 <= 99)) {              // może być też na 'if'
            return no_2 / 10 == no_1 / 10 || no_2 % 10 == no_1 % 10 || no_2 % 10 == no_1 / 10 || no_2 / 10 == no_1 % 10;
        }
        return false;
    }
}
