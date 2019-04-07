package pl.sda.zadania_map_collections;

import java.util.*;

/**
 * 1. Stwórz mapę, która jako klucze będzie zawierała obiekty Integer, a jako wartości obiekty typu
 * String. Wypisz na ekran rozmiar mapy oraz wszystkie wartości (klucz - wartość).
 *
 * 2. Policz w mapie z pkt 1 (za pomocą pętli) ilość kluczy, które mają wartość mniejszą od zera oraz
 * takich które mają wartość większą lub równą zeru. Wypisz wyniki na ekran.
 *
 * 3. Z mapy stworzonej w pkt 1 wyciągnij wszystkie klucze, które mają wartość mniejszą od zera i
 * dodaj je do nowej listy obiektów Integer. Następnie usuń z mapy wszystkie wartości, których klucze
 * znajdują się w liście. Wypisz wszystkie pozostałe wartości mapy (klucz - wartość) na ekran.
 */


public class Task1 {
    public static void main(String[] args) {
        Map<Integer, String> task1 = new HashMap<>();

        //dodaj
        task1.put(1, "jedynka");
        task1.put(2, "dwójka");
        task1.put(3, "trójka");
        task1.put(-1, "minus jedynka");
        task1.put(-2, "minus dwójka");
        task1.put(-3, "minus trójka");


        //rozmiar
        System.out.println("task1 size = " + task1.size());

        //wyświetl
        Set<Integer> keys = task1.keySet();
        int k=0;
        for (Integer key : keys) {
            System.out.println(key + " - " + task1.get(key));
            if (key<0) k++;
        }
        System.out.println("Mniejsze: " + k + " większe równe: " + (task1.size()-k));

        // ujemne wartości
        List<Integer> negativeTask1 = new ArrayList<>();
        for (Integer key : task1.keySet()) {
            if (key < 0) {
                negativeTask1.add(key);
            }
        }



    }
}
