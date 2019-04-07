package pl.sda.zadania_statements;

/*
 * 3. Napisz program, który wypisze na ekran konsoli, cyfrę arabską dla podanej liczby rzymskiej (od 1 do 9).
 * Czyli np. dla 'I' wypisze 1, dla 'V' 5 itp. Obsłuż przypadek gdy podana liczba rzymska jest nieprawidłowa.
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę rzymską w zakresie I-IX: ");
        String romanNumber = scanner.next();

        System.out.println();
        System.out.println("Dla liczby " + romanNumber + ", liczba arabska to: ");
        switch (romanNumber) {
            case ("I"):
                System.out.println("1");
                break;
            case ("i"):
                System.out.println("1");
                break;
            case ("II"):
                System.out.println("2");
                break;
            case ("ii"):
                System.out.println("2");
                break;
            case ("III"):
                System.out.println("3");
                break;
            case ("iii"):
                System.out.println("3");
                break;
            case ("IV"):
                System.out.println("4");
                break;
            case ("iv"):
                System.out.println("4");
                break;
            case ("V"):
                System.out.println("5");
                break;
            case ("v"):
                System.out.println("5");
                break;
            case ("VI"):
                System.out.println("6");
                break;
            case ("vi"):
                System.out.println("6");
                break;
            case ("VII"):
                System.out.println("7");
                break;
            case ("vii"):
                System.out.println("7");
                break;
            case ("VIII"):
                System.out.println("8");
                break;
            case ("viii"):
                System.out.println("8");
                break;
            case ("IX"):
                System.out.println("9");
                break;
            case ("ix"):
                System.out.println("9");
                break;
            case ("X"):
                System.out.println("10");
                break;
            case ("x"):
                System.out.println("10");
                break;
            default:
                System.out.println("Tylko wartości w zakresie I-IX!");

        }

    }
}
