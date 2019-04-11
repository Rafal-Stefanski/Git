package pl.sda.zadania_arrays;

public class ArraysTask {
    public static void main(String[] args) {
        ArraysTask tasks = new ArraysTask();

        // #1
        System.out.println("\n=== Task #1 ===");
        tasks.printStringArray(new String[]{"a", "ab", "abc", "abcd", "abcde"});

        // #2
        System.out.println("\n=== Task #2 ===");
        int sum = tasks.sumInArr(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println("Suma równia się = " + sum);

//        System.out.println(myTable[1]);
//
//        String[] myTable = new String[3];
//        myTable[0]="cat";
//        myTable[1]="dog";
//        myTable[2]="fish";
//
//
//        typeTable(myTable);
//
//        ArrayMethod arrayMethods = new AbstractMethod();
//        arrayMethods.printStringArray(myTable);

    }

    /**
     * 1. Napisz metodę, która jako parametr przyjmuje zmienną typu String[] i wyświetla wszystkie elementy tablicy na
     * konsoli (użyj różnych rodzajów pętli).
     */
//    private void printStringArray(String[] arrOfStrings) {
//        int n = 0;
//        while (n < arrOfStrings.length) {
//            System.out.println(arrOfStrings[n]);
//            n++;
//        }
//
//        for (int i = 0; i < arrOfStrings.length; i++) {
//            System.out.println(arrOfStrings[i]);
//        }
//        for (String arrOfString : arrOfStrings) {
//            System.out.println(arrOfString);
//        }
//    }
    private void printStringArray(String[] arr) {
        int n = 0;
        while (n < arr.length) {
            System.out.println(arr[n]);
            n++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String arrs : arr) {
            System.out.println(arrs);
        }


    }

    /**
     * 2. Napisz metodę, która jako jedyny parametr przyjmuje zmienną typu int[]
     * i zwróci sumę wszystkich elementów tablicy.
     */
    private int sumInArr(int[] arrOfInts) {
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

}
