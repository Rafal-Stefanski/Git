package pl.sda.zadania_statements;

/*
 * 3. Napisz program, który wypisze na ekran konsoli, cyfrę arabską dla podanej liczby rzymskiej (od 1 do 9).
 * Czyli np. dla 'I' wypisze 1, dla 'V' 5 itp. Obsłuż przypadek gdy podana liczba rzymska jest nieprawidłowa.
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą arabską w zakresie 1-10: ");
        int b = scanner.nextInt();
        System.out.println();
        System.out.println("Dla liczy " + b + ", liczba rzymska to: ");
        switch (b) {
            case (1):
                System.out.println("I");
                break;
            case (2):
                System.out.println("II");
                break;
            case (3):
                System.out.println("III");
                break;
            case (4):
                System.out.println("IV");
                break;
            case (5):
                System.out.println("V");
                break;
            case (6):
                System.out.println("VI");
                break;
            case (7):
                System.out.println("VII");
                break;
            case (8):
                System.out.println("VIII");
                break;
            case (9):
                System.out.println("IX");
                break;
            case (10):
                System.out.println("X");
                break;
            default:
                System.out.println("Out of scale, only 1-10 numbers");

        }

    }
}
