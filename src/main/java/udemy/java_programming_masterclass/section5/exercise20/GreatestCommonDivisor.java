package udemy.java_programming_masterclass.section5.exercise20;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int divider;
        int firstCheck;
        int secondCheck;
        if (first <= second) {
            firstCheck = first;
            secondCheck = second;
        } else {
            firstCheck = second;
            secondCheck = first;
        }

        divider = firstCheck;
        if (firstCheck % divider != 0) {
            divider --;
        }
        if (secondCheck % divider != 0) {
            divider--;
        } else {
            return divider;
        }
        return divider;
    }
}
