package udemy.java_programming_masterclass.section5.exercise20;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int divider = first;

        while (second % divider != 0 || first % divider != 0) {
            divider--;
            while (second % divider == 0 && first % divider == 0) {
                return divider;
            }
        }
        return -1;
    }
}
