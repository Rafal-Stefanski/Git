package udemy.java_programming_masterclass.section5;

public class TheForStatement {
    public static void main(String[] args) {
        System.out.println(calculateIntrest(10_000.0, 2.0));

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        System.out.println("\nExercise A Challenge");
        for (int i = 2; i < 9; i++) {
            System.out.println("10.000 at " + i + "% interest = " + String.format("%.2f", calculateIntrest(1000.0, i)));
        }

        System.out.println("\nExercise B Challenge");
        for (int i = 8; i >= 2; i--) {
            System.out.println("10.000 at " + i + "% interest = " + String.format("%.2f", calculateIntrest(1000.0, i)));
        }

        System.out.println("\nExercise C Challenge");
        for (int i = 1; i < 50; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static double calculateIntrest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
