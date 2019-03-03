package pl.sda.zadania_loops;

/**
 * 1. Napisz metodę, która wyświetli na ekranie n-pierwszych liczb parzystych. Zmienna n to parametr metody.
 * Czyli np. dla n = 4 program * powinien wypisać: 2, 4, 6, 8
 */

public class Task1 {

    public static void main(String[] args) {
//        //while loop
//        int n =4;
//        int i=n*2;
//        while(i>=n){
//            System.out.println(i);
//            i++;
//        }

        //for loop
        int n = 4;
        int i;
        for (i=(2*n)/2; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

