package pl.sda.zadania_exception;

/*
3. Przerób klasę ExceptionExample tak, by "łapała" dwa wyjątki w jednej sekcji catch.
 */

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(">>> ");
            String input = scanner.nextLine();

            if ("q".equalsIgnoreCase(input)) {
                break;
            }

            int num = getNumber(input);
            try {
                double sqrt = getSqrt(num);
                System.out.println("Sqrt for " + num + " = " + sqrt);
            } catch (MyException | NumberFormatException e) {
                System.out.println("Number can't be less than 0!");
            } finally {
                System.out.println("We will continue in loop ;)");
            }
        }
    }

    private static int getNumber(String input) {
        int num = 0;
        try {
            num = Integer.parseInt(input);
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException occurred! Default value (0) will be used.");
        }
        return num;
    }

    private static double getSqrt(int num) throws MyException {
        if (0 > num) {
            throw new MyException();
        }
        return Math.sqrt(num);
    }
}
