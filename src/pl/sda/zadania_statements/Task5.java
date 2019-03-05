package pl.sda.zadania_statements;

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
        System.out.println("jeśli " + b + ", to:");
        switch (b) {
            case (1):
                System.out.println("poniedziałek, do weekendu pozostało 5 dni");
                break;
            case (2):
                System.out.println("wtorek, do weekendu pozostały 4 dni");
                break;
            case (3):
                System.out.println("środa, do weekendu pozostały 3 dni");
                break;
            case (4):
                System.out.println("czwartek, do weekendu pozostały 2 dni");
                break;
            case (5):
                System.out.println("piątek, do weekendu pozostał 1 dzień");
                break;
            case (6):
                System.out.println("sobota, weekend");
                break;
            case (7):
                System.out.println("niedziela, weekend");
                break;
            default:
                System.out.println("nie ma takiego dnia tygodnia ;(");
        }
    }
}
