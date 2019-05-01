package pl.sda.zadania_loops;

public class Task_bis {
    public static void main(String[] args) {
        System.out.println("Task #1");
        printEvenNumbers(14);
        System.out.println();
        System.out.println();

        System.out.println("Task #2");
        System.out.println("powerOf(3, 5) = " + powerOf(3, 5));
        System.out.println("powerOf(2, 3) = " + powerOf(2, 3));
        System.out.println("powerOf(12, 0) = " + powerOf(12, 0));
        System.out.println("powerOf(12, -1) = " + powerOf(12, -1));
        System.out.println();

        System.out.println("Task #3");
//        printLetters();
        printSomeLetters();
        printEverySecondLetter();
        System.out.println();

        System.out.println("Task #4");
        System.out.println("checkStrings1 = " + checkStrings("stark", "stark"));
        System.out.println("checkStrings1 = " + checkStrings("", ""));
        System.out.println("checkStrings2 = " + checkStrings("abc", "ab"));
        System.out.println("checkStrings3 = " + checkStrings("abc", "def"));
        System.out.println("checkStrings4 = " + checkStrings("def", "def"));
        System.out.println();

        System.out.println("Task #5");
        System.out.println("checkNo1 = " + checkNo("", "ala"));
        System.out.println("checkNo1 = " + checkNo("ala", "ala"));
        System.out.println("checkNo1 = " + checkNo("ala ma kota", "a"));
        System.out.println("checkNo1 = " + checkNo("ala ma kota", "ada"));

    }
    // Zadania w oddzielnych metodach

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
            even = even + 2;
        }

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
            result = result * a;
        }
        return result;
    }

    /**
     * 3. Wypisz na ekran co drugą, dużą literę alfabetu łacińskiego, zaczynając od 'A' i kończąc na 'Z'.
     * Użyj pętli for, a potem spróbuj przerobić program używając pętli while.
     */

    private static void printSomeLetters() {
        for (char c = 'A'; c <= 'Z'; c += 2) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    private static void printEverySecondLetter() {
        for (char c = 'A'; c <= 'Z'; c += 2) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    /**
     * 4. Napisz metodę która sprawdzi czy dwa podane Stringi (zmienne typu String) są takie same - bez użycia
     * metody equals().
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
     * 5. Napisz metodę sprawdzającą ilość wystąpień frazy: phrase w tekście: text.
     * Parametry metody to: phrase i text.
     * Podpowiedź: użyj metody klasy String która sprawdza index dla podanej frazy
     */



    public static int checkNo(String text, String searchPhrase) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        int index = 0;
        int count = 0;
        do {
            index = text.indexOf(searchPhrase, index);
            if (index != -1){
                count ++;
                index = index + searchPhrase.length();
            }
        } while (index != -1);
        return count;
    }


}
