package udemy.java_programming_masterclass.section5;

public class TheForStatementContinuation {
    public static void main(String[] args) {

//        for (int i = 0; i < 12; i++) {
//            System.out.println(i + " is prime? " + isPrime(i));
//        }

        System.out.println("=== Challenge with primes ===");
        int count = 0;
        for (int p = 0; p < 41; p++) {
            if (isPrime(p)) {
                count++;
                System.out.println("Number " + p + " is a prime number.");
                if (count == 10) {
                    System.out.println("..exiting for loop, after count " + count + " reached.");
                    break;
                }
            }
        }

        System.out.println("\n=== Challenge with 3 and 5 dividers ===");
        int counter = 0;
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                counter++;
                System.out.println(i + " can be devided by both 3 and 5.");
                sum += i;
            }
            if (counter == 5) {
                break;
            }
        }
        System.out.println("Sum of first 5 numbers is " + sum);
    }

    public static boolean isPrime(int n) {
        if (n == 1 || n == 0) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
