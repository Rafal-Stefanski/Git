package pl.sda.zadania_arrays;

/**
 * Napisz metodę, która jako parametr przyjmuje zmienną typu String[]
 * i wyświetla wszystkie elementy tablicy na konsoli (użyj różnych rodzajów pętli).
 */

public class ArraysTask1 {
    public static void main(String[] args) {

        System.out.println("===== Task #1 ======");
        System.out.println();
        printArrayOfStrings(new String[]{"cos", "ktos", "gdzies", "kiedys"});
    }

    public static void printArrayOfStrings(String[] argOfString) {
        System.out.println("1. Petla while: ");
        int n = 0;
        while (n < argOfString.length) {
            System.out.println(argOfString[n]);
            n++;
        }
        System.out.println();
        System.out.println("2. Petla for: ");
        for (int m = 0; m < argOfString.length; m++) {
            System.out.println(argOfString[m]);
        }

        System.out.println();
        System.out.println("3. Petla for each: ");
        for (String arrayPoForEach : argOfString) {
            System.out.println(arrayPoForEach);
        }
    }
}
