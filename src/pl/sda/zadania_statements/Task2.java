package pl.sda.zadania_statements;

/*
 * 2. Napisz program, który wypisze na ekran konsoli, słowo oznaczające ocenę dla podanej cyfry.
 * Np. dla 1 - "niedostateczny", 2 - "mierny" itp. Obsłuż przypadek gdy cyfra jest poza skalą ocen.
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj ocenę: ");
        int a = scanner.nextInt();
        System.out.println();
        System.out.println("ocena " + a );

        if (a == 1) System.out.println("niedostateczna");
        if (a == 2) System.out.println("mierna");
        if (a == 3) System.out.println("dostateczna");
        if (a == 4) System.out.println("dobra");
        if (a == 5) System.out.println("bardzo dobra");
        if (a == 6) System.out.println("celująca");
        if (a < 1 || a > 6) System.out.println("jest poza skalą");

    }
}
