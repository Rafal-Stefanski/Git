package udemy.java_programming_masterclass.section5.exercise20;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        for (int firstDivider = 1; first % firstDivider == 0; firstDivider++) {
            return firstDivider;
        }

        return 1;
    }
}
