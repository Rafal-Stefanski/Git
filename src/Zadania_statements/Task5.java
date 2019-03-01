package Zadania_statements;

/*
 *5. Napisz program, który dla podanej liczby wypisze na ekran konsoli dzień tygodnia (dla 1 - "poniedziałek", 2 - "wtorek"
 * itp). Dodatkowo wyświetl ile dni zostało do weekendu, dla poniedziałku - 5 dni, wtorku - 4 itp.
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj numer dnia tygodnia: ");
        int b = scanner.nextInt();
        System.out.println();
        System.out.println("jeśli "+b + ", to:");

        if (b == 1) System.out.println("poniedziałek, do weekendu pozostało 5 dni");
        if (b == 2) System.out.println("wtorek, do weekendu pozostały 4 dni");
        if (b == 3) System.out.println("środa, do weekendu pozostały 3 dni");
        if (b == 4) System.out.println("czwartek, do weekendu pozostały 2 dni");
        if (b == 5) System.out.println("piątek, do weekendu pozostał 1 dzień");
        if (b == 6) System.out.println("sobota, weekend");
        if (b == 7) System.out.println("niedziela, weekend");
        if (b < 1 || b > 7) System.out.println("nie ma takiego dnia tygodnia ;(");

    }
}
