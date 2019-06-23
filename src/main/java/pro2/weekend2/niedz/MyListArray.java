package pro2.weekend2.niedz;

import java.util.ArrayList;
import java.util.List;

/**
 * Dodaj klasę MojaLista (lub MyList), która będzie implementowała
 * listę i posiadała następujące funkcjonalności:
 */

public class MyListArray {
    public static void main(String[] args) {
        List();
    }

    private static void List() {
        List<String> colors = new ArrayList<>(5);

        //● dodawanie elementu na końcu listy
        colors.add("red");
        colors.add("white");
        colors.add("blue");
        colors.add("yellow");

        //● dodawanie elementu na wybrany indeks w liście
        int index = 1;
        colors.add(index, "black");

        //● usuwanie elementu z listy
        colors.remove("black");

        //● usuwanie elementu z listy na podstawie indeksu
        colors.remove(4);

        //● pobieranie elementu na podstawie indeksu
        System.out.println("colors.get(3) = " + colors.get(2));
        System.out.println("colors = " + colors);

        //● szukanie elementu na liście
        System.out.println("colors ()");

    }
}
