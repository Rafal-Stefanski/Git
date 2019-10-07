package udemy.java_programming_masterclass.section5.exercise21;

public class FactorPrinter {
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
            System.out.print(i + " ");
        }
    }

    public static void printFactoren(int number) {
        if (number >= 1) {
            int divider = 1;
            while (divider <= number) {
                if (number % divider == 0) {
                    System.out.print(divider + " ");
                }
                divider++;
            }
        } else {
            System.out.println("Invalid Value");
        }
    }

}
