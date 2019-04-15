package pro1.sort_zadania;


import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {

        int[] tablica = {2, 5, 6, 7, 3};
        quickSortMethod(tablica, 0, 4);
        System.out.println("Posortowana tablica mała:");
        System.out.println(Arrays.toString(tablica));
        System.out.println("tablica random:");
        int[] tablica1 = tableOfRandom(100000, 1, 100000);
        System.out.println(Arrays.toString(tablica1));
        System.out.println("===========//===========//===========//===========");
        System.out.println("Posortowana tablica random:");
        quickSortMethod(tablica1, 0, tablica1.length - 1);
        System.out.println(Arrays.toString(tablica1));
    }

    public static int[] tableOfRandom(int n, int first, int last) {
        Random random = new Random();
        int[] table = new int[n];
        for (int i = 0; i < n; i++)
            table[i] = random.nextInt(last + 1 - first) + first;
        return table;
    }

    public static void quickSortMethod(int[] tablica, int low, int high) {
        if (low < high) {
            int pivot_location = Partition(tablica, low, high);
            quickSortMethod(tablica, low, pivot_location - 1);
            quickSortMethod(tablica, pivot_location + 1, high);
        }
    }

    public static int Partition(int[] tablica, int low, int high) {
        int pivot = tablica[high];
        int i, j;
        i = low - 1;

        for (j = low; j < high; j++) {
            if (tablica[j] <= pivot) {
                i++;
                int temp;
                temp = tablica[j];
                tablica[j] = tablica[i];
                tablica[i] = temp;
            }
        }
        i++;
        int temp;
        temp = tablica[high];
        tablica[high] = tablica[i];
        tablica[i] = temp;
        return i;
    }
}
