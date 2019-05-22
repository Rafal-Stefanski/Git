package pl.sda.zadania_arrays;

import java.util.Arrays;


public class ArraysTasks {
    public static void main(String[] args) {
        ArraysTasks task = new ArraysTasks();

        System.out.println("===== Task #1 ======");
        System.out.println();
        task.printArrayOfStrings(new String[]{"cos", "ktos", "gdzies", "kiedys"});

        System.out.println("\n===== Task #2 ======");
        System.out.println();
        int sum = task.printSumOfInt(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println("Suma tablicy intow = " + sum);

        System.out.println("\n===== Task #3 ======");
        System.out.println();
        int[] arrOfEvents = task.createArrOfEvents(10);
        System.out.println("Tablica parzystych liczb dla 'count' : " + Arrays.toString(arrOfEvents));

        System.out.println("\n===== Task #4 ======");
        System.out.println();
        float[] arrOfDoubleFloats = task.doubleFloats(new float[]{1.1f, 1.2f, 1.3f, 1.4f, 1.5f});
        System.out.println("Tablica podwojonych liczb : " + Arrays.toString(arrOfDoubleFloats));
    }

    /*
     * 1. Napisz metodę, która jako parametr przyjmuje zmienną typu String[]
     * i wyświetla wszystkie elementy tablicy na konsoli (użyj różnych rodzajów pętli).
     */
    // Task #1
    private static void printArrayOfStrings(String[] argOfString) {
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

    /*
     * 2. Napisz metodę, która jako jedyny parametr przyjmuje zmienną typu int[]
     * i zwróci sumę wszystkich elementów tablicy.
     */
    // Task #2
    private int printSumOfInt(int[] arrOfInts) {
        int sum = 0;
        for (int num : arrOfInts) {
            sum += num;
        }
        return sum;
    }

    /*
     * 3. Napisz metodę, która jako parametr przyjmuje parametr int count i w wyniku zwraca tablicę wypełnioną
     * liczbami parzystymi zaczynając od 2, tablica ma zawierać ilość liczb wskazanych przez parametr count.
     */
    // Task #3
    private int[] createArrOfEvents(int count) {
        int[] result = new int[count];
        for (int i = 1; i <= count; i++) {
            result[i - 1] = i * 2;
        }
        return result;
    }

    /*
     * 4. Napisz metodę, która jako parametr przyjmuje tablicę typu float[]
     * i w wyniku swojego działania powoduje podwojenie wartości dla każdego indeksu przekazanej tablicy.
     */
    // Task #4
    private float[] doubleFloats(float[] floats) {
        float[] result = new float[floats.length];
        for (int i = 0; i < floats.length; i++) {
            result[i] = floats[i] * 2;
        }
        return result;
    }

}
