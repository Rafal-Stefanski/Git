package Zadania_statements;

/*
  6. * Zobacz w jaki sposób można pobrać dane od użytkownika (z konsoli) analizując klasę: pl.sda.statements.ScannerApp.
  Spróbuj dodać wczytywanie liczb z konsoli do każdego z zadań powyżej.
*/

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swoje imię: ");
        String name = scanner.next();

        System.out.print("Podaj swój wiek: ");
        int age = scanner.nextInt();

        System.out.println();
        System.out.println("Witaj " + name + " twój wiek to: " + age);

    }


}
