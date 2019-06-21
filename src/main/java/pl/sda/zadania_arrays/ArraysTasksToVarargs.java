package pl.sda.zadania_arrays;

import java.util.Arrays;

/**
 * 7. Przerób każdą z poprzednich metod (poza nr 3)
 * tak żeby przyjmowała parametry jako varargs.
 */

public class ArraysTasksToVarargs {

    public static void main(String[] args) {
        ArraysTasksToVarargs task = new ArraysTasksToVarargs();

        System.out.println("===== Task #1 to Varargs ======");
        System.out.println();
        printArrayOfStrings("cos", "ktos", "gdzies", "kiedys", "po coś");

        System.out.println("\n===== Task #2 to Varargs ======");
        System.out.println();
        int sum = task.printSumOfInt(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        System.out.println("Suma tablicy intow = " + sum);

        System.out.println("\n===== Task #4 to Varargs ======");
        System.out.println();
        float[] arrOfDoubleFloats = task.doubleFloats(1.1f, 1.2f, 1.3f, 1.4f, 1.5f);
        System.out.println("Tablica podwojonych liczb : " + Arrays.toString(arrOfDoubleFloats));

        System.out.println("\n===== Task #5 to Varargs ======");
        System.out.println();
        task.printDoubles();
        task.printDoubles(1.123);
        task.printDoubles(99.9, 101.01);
        task.printDoubles(1.1, 1.2, 1.3, 1.4, 1.5);
        task.printDoubles(2.0, 5.0, 7.0, 11.0);


    }

    // Task #1
    private static void printArrayOfStrings(String... argOfString) {
        System.out.println("1) Petla while: ");
        int n = 0;
        while (n < argOfString.length) {
            System.out.println(argOfString[n]);
            n++;
        }
        System.out.println();
//        System.out.println("2) Petla for: ");
//        for (int m = 0; m < argOfString.length; m++) {
//            System.out.println(argOfString[m]);
//        }

        System.out.println();
        System.out.println("3) Petla for each: ");
        for (String arrayPoForEach : argOfString) {
            System.out.println(arrayPoForEach);
        }
    }

    // Task #2
    private int printSumOfInt(int... arrOfInts) {
        int sum = 0;
        for (int num : arrOfInts) {
            sum += num;
        }
        return sum;
    }

    // Task #4
    private float[] doubleFloats(float... floats) {
        float[] result = new float[floats.length];
        for (int i = 0; i < floats.length; i++) {
            result[i] = floats[i] * 2;
        }
        return result;
    }

    // Task #5
    private void printDoubles(double... dubli) {
        if (dubli.length > 0) {
            System.out.println("Pierwszy element tablicy: " + dubli[0]);
            System.out.println("Ostatni element tablicy: " + dubli[dubli.length - 1]);
            if (dubli.length > 1) {
                if (dubli.length % 2 == 0) {
                    System.out.println("Parzysta licza elementow w tabeli, brak srodkowego, " +
                            "dwa elementy ze srodka to: " + dubli[dubli.length / 2 - 1] + ", " +
                            dubli[dubli.length / 2]);
                } else {
                    System.out.println("Srodkowy element tabeli to: " + dubli[Math.round(dubli.length / 2)]);
                }
            } else {
                System.out.println("Tablica ma tylko 1 element, ktory jest jednoczesnie srodkowy: " + dubli[0]);
            }

            double suma = 0.0;
            for (double num : dubli) {
                suma += num;
            }
            System.out.println("Srednia: " + suma / dubli.length);
        } else {
            System.out.println("Tablica dubli jest pusta!");
        }
    }

    // Task #6
    private Car[] reverseArrayCars(Car[] samochodziki) {
        Car[] result = new Car[samochodziki.length];
        int i = samochodziki.length - 1;
        for (Car samochodzik : samochodziki) {
            result[i] = samochodzik;
            i--;
        }
        return result;
    }

}
