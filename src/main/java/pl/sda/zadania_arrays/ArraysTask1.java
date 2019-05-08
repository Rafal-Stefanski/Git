package pl.sda.zadania_arrays;

/**
 * Napisz metodę, która jako parametr przyjmuje zmienną typu String[]
 * i wyświetla wszystkie elementy tablicy na konsoli (użyj różnych rodzajów pętli).
 */

public class ArraysTask1 {
    public static void main(String[] args) {
        ArraysTask1 tasks = new ArraysTask1();

        System.out.println("Task 1");
        tasks.printStringArray(new String[]{"a", "ab", "abc", "abcd", "abcde"});


    }

    private static void printStringArray(String[] arrOfstrings) {
        int n = 0;
        while (n < arrOfstrings.length) {
            System.out.println(arrOfstrings[n]);
            n++;
        }
        for (int i = 0; i < arrOfstrings.length; i++) {
            System.out.println(arrOfstrings);
        }
        for (String arrOfString : arrOfstrings) {
            System.out.println(arrOfString);
        }
    }

}
