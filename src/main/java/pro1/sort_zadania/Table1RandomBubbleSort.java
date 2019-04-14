package pro1.sort_zadania;

import java.util.Random;

public class Table1RandomBubbleSort {
    public static void main(String[] args) {
        int[] tablica1 = tableOfRandom(10000, 1, 10000);

        for (int N = 0; N < 10000; N++)
            System.out.println(tablica1[N]);
        System.out.println("Sortujemy");
        sortTable(tablica1);

        int[] tablica2 = sortTable(tablica1);
        for (int N = 0; N < 10000; N++) {
            System.out.println(tablica2[N]);
        }
    }

    public static int[] tableOfRandom(int n, int first, int last) {
        Random random = new Random();
        int[] table = new int[n];
        for (int i = 0; i < n; i++)
            table[i] = random.nextInt(last + 1 - first) + first;
        return table;
    }

    public static int[] sortTable(int[] x) {
        for (int j = 0; j < x.length - 1; j++) {
            boolean k = true;
            for (int i = 1; i < x.length - j; i++) {
                int temp;
                if (x[i - 1] > x[i]) {
                    temp = x[i - 1];
                    x[i - 1] = x[i];
                    x[i] = temp;
                }
            }
            if (k) {
            }
        }
        return x;
    }
}
