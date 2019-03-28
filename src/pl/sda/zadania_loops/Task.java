package pl.sda.zadania_loops;

import javax.swing.*;

public class Task {
    public static void main(String[] args) {
        //#1
        System.out.println("Task 1:");
        printEvenNumbers(4);
        System.out.println();

        //#2
        System.out.println("Task 2:");
        System.out.println("powerOf(3, 5) = " + powerOf(3, 5));
        System.out.println("powerOf(12, 0) = " + powerOf(12, 0));
        System.out.println("powerOf(12, -1) = " + powerOf(12, -1));
        System.out.println();

        //#3
        System.out.println("Task 3:");
        printLetters();
        System.out.println();

        //#4
        System.out.println("Task 4:");
        System.out.println("checkStrings1 = " + checkStrings("", ""));
        System.out.println("checkStrings2 = " + checkStrings("abc", "ab"));
        System.out.println("checkStrings3 = " + checkStrings("abc", "def"));
        System.out.println("checkStrings4 = " + checkStrings("def", "def"));
        System.out.println();

        //#5
        System.out.println("Task 5:");
        System.out.println("checkNo1 = " + checkNo("", "ala"));
        System.out.println("checkNo2 = " + checkNo("ala", "ala"));
        System.out.println("checkNo3 = " + checkNo("ala ma kota", "a"));
        System.out.println("checkNo4 = " + checkNo("ala ma kota", "ada"));
        System.out.println();

        //#6
        System.out.println("Task 6:");
        sumNumbersFromUser(5);
        System.out.println();

        //#7
        System.out.println("Task 7:");
        rectangle(6, 3);
        System.out.println();
        rectangle(5, 5);
        System.out.println();


    }

    /**
     * 1. Napisz metodę, która wyświetli na ekranie n-pierwszych liczb parzystych. Zmienna n to parametr metody.
     * Czyli np. dla n = 4 program * powinien wypisać: 2, 4, 6, 8
     */
    private static void printEvenNumbers(int n) {
        if (n <= 0) {
            return;
        }
        int even = 2;
        for (int i = 0; i < n; i++) {
            System.out.print(even + " ");
            even += 2;
        }
        System.out.println();
    }

    /**
     * 2. Napisz metodę, która policzy n-tą potęgę (n >= 0) liczby całkowitej a. Parametry metody to: n i a.
     */

    private static int powerOf(int a, int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= a;
        }
        return result;
    }

    /**
     * 3. Wypisz na ekran co drugą, dużą literę alfabetu łacińskiego, zaczynając od 'A' i kończąc na 'Z'.
     * Użyj pętli for, a potem spróbuj przerobić program używając pętli while.
     */
    private static void printLetters() {
        for (char c = 'A'; c <= 'Z'; c += 2) {
            System.out.print(c + " ");
        }
        System.out.println();

        char c = 'A';
        while (c <= 'Z') {
            System.out.print(c + " ");
            c += 2;
        }
        System.out.println();
    }

    /**
     * 4. Napisz metodę która sprawdzi czy dwa podane Stringi (zmienne typu String) są takie same - bez użycia metody equals().
     * Podpowiedź: możesz porównać oba teksty znak po znaku używając jednej z metod klasy String.
     */
    private static boolean checkStrings(String text1, String text2) {
        if (text1 == null && text2 == null) {
            return true;
        } else if (text1 == null || text2 == null) {
            return false;
        }

        if (text1.length() != text2.length()) {
            return false;
        }

        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    /**
     * 5. Napisz metodę sprawdzającą ilość wystąpień frazy: phrase w tekście: text. Parametry metody to: phrase i text.
     * Podpowiedź: użyj metody klasy String która sprawdza index dla podanej frazy
     */
    private static int checkNo(String text, String searchPhrase) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        int index = 0;
        int count = 0;
        do {
            index = text.indexOf(searchPhrase, index);
            if (index != -1) {
                count++;
                index += searchPhrase.length();
            }
        } while (index != -1);
        return count;
    }

    /**
     * 6. Zmień metodę pl.sda.loops.ForLoop.sumNumbersFromUser() tak by przyjmowała liczby typu float.
     * W podsumowaniu oprócz sumy wypisz także średnią arytmetyczną podanych liczb.
     */
    private static void sumNumbersFromUser(int numbersSize) {
        float   sum = 0;
        for (int i = 1; i <= numbersSize; i++) {
            String numberInString = JOptionPane.showInputDialog("Podaj liczbę: ");
            float numberFromUser = Float.valueOf(numberInString);
            System.out.println("liczba nr " + i + " to: " + numberFromUser);
            sum += numberFromUser;
        }

        System.out.println("sum = " + sum);
        System.out.println("average = " + sum / numbersSize);
    }

    /**
     * 7. Napisz metodę która wyświetli na ekranie prostokąt o podanych rozmiarach: width i height (to są parametry metody).
     * Podpowiedź: zobacz metodę: pl.sda.loops.ForLoop.leftTriangle()
     */
    private static void rectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) { //pętla w pętli
                System.out.print("*");
            }
            System.out.println();
        }
    }


}

