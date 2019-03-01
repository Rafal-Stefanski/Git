package Zadania_statements;

/*
 * 1. Napisz program, który wypisze na ekran konsoli,
 * czy dana liczba całkowita znajduje się w przedziale 1-10, 11-100, 101-1000, 1001-10000,
 * czy też może jest mniejsza od 0 lub większa od 10000.
 * Parametrem wejściowym niech będzie zmienna zainicjowana na początku programu.
 */

import java.util.Scanner;

import static java.lang.System.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);

        out.print("Podaj liczbę całkowitą: ");
        int a = scanner.nextInt();
        out.println();
        out.println("Zakres w którym mieści się liczba " + a + " to:");


        if (a < 0) out.println("a<0");
        if (a >= 1 && a <= 10) out.println("1 >= a >= 10");
        if (a >= 11 && a <= 100) out.println("11 >= a >= 100");
        if (a >= 101 && a <= 1000) out.println("101 >= a >= 1000");
        if (a >= 1001 && a <= 10000) out.println("1001 >= a >= 10000");
        if (a > 10000) out.println("a>10000");

    }
}


