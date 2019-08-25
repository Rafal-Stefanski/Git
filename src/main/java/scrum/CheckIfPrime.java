package scrum;

/**
 * Zadanie do code review.
 * Dla podanej liczby wypisz liczby pierwsze od zera do tej liczby.
 * @autor:SzymonKuhn
 */

public class CheckIfPrime {
    public static void main(String[] args) {
        printPrimes(88);
    }

    private static boolean isPrime(final int input) {
        if (input < 2) return false;
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) return false;
        }
        return true;
    }

    private static void printPrimes(final int input) {
        for (int i = 0; i <= input; i++) {
            if (isPrime(i)) System.out.println(i);
        }
    }
}
