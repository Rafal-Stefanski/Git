package pl.sda.zadania_arrays;

/**
 * Napisz metodę, która jako parametr przyjmuje zmienną typu String[]
 * i wyświetla wszystkie elementy tablicy na konsoli (użyj różnych rodzajów pętli).
 */

public class ArraysTask1 {
    public static void main(String[] args) {
        ArraysTask1 task = new ArraysTask1();

        System.out.println("===== Task #1 ======");
        System.out.println();
        printArrayOfStrings(new String[]{"cos", "ktos", "gdzies", "kiedys"});

        System.out.println("\n===== Task #2 ======");
        System.out.println();
//        int sum = new task.printSumOfInt(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});

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

//    public static void printSumOfInt(int[] arrayOfInts);
}
