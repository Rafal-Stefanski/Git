package pl.sda.zadania_collections;

/*
 * 4. Napisz metodę, która będzie przyjmować imiona od użytkownika, a wprowadzenie znaku "q"
 * przerwie jej działanie i wyświetli wszystkie unikalne imiona dodane do kolekcji.
 */

import pl.sda.zadania_exception.MyException;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(">>> ");
            String input = scanner.nextLine();

            if ("q".equalsIgnoreCase(input)) {
                break;
            }

            int num = getName(input);
            try {
                double sqrt = getSqrt(num);
                System.out.println("Sqrt for " + num + " = " + sqrt);
            } catch (MyException e) {
                System.out.println("Number can't be less than 0!");
            } finally {
                System.out.println("We will continue in loop ;)");
            }
        }
    }

    private static int getName(String input) {
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
