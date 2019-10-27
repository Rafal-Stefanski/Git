package udemy.java_programming_masterclass.section5.exercise25;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        for (int i = (number - 1); i > 1; i--) {
            if (number % i == 0) {
                return getLargestPrime(i);
                }
            }
        return number;
    }
}
