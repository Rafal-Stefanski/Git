package pl.sda.zadania_exception;

/*
 1. Dodaj obsługę wyjątków w klasach GetNumber oraz PrintTable.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int number = scanner.nextInt();
            System.out.println(number);
        }   catch (InputMismatchException ime) {
            System.out.println("Wrong! Enter number not letter. Run program again.");
        }   finally {
            System.out.println("That's all folks!");
        }

    }

}
