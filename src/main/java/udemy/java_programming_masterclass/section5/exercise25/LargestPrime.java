package udemy.java_programming_masterclass.section5.exercise25;

public class LargestPrime {
    public static int getLargerstPrime(int number) {
        if (number < 1) {
            return -1;
        }
        int biggestDivider = 0;
        int isPrimeDivider = 0;

        // Wciaz nie działa :(

        for (int i = (number - 1); i > 1; i--) {
            if (number % i == 0) {
                biggestDivider = i;
                for (int j = (biggestDivider - 1); j > 1; j--) {
                    if (biggestDivider % j == 0) {
                        isPrimeDivider = j;
//                        break;
                    }

                }
                return isPrimeDivider;
//                break;
            } else {
            }
        }

        return isPrimeDivider;
    }
}
