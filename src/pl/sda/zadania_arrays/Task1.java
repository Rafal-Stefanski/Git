package pl.sda.zadania_arrays;

import java.lang.reflect.Array;
import java.sql.SQLOutput;

/**
 * 1. Napisz metodę, która jako parametr przyjmuje zmienną typu String[] i wyświetla wszystkie elementy tablicy na
 * konsoli (użyj różnych rodzajów pętli).
 */

public class Task1 {
    public static void main(String[] args) {

//        int [] myTable;
//        myTable = new int []{12, 23, 45};
//
//        System.out.println(myTable[1]);

        String[] myTable = new String[3];
        myTable[0]="cat";
        myTable[1]="dog";
        myTable[2]="fish";


        typeTable(myTable);
//
//        ArrayMethod arrayMethods = new AbstractMethod();
//        arrayMethods.printStringArray(myTable);

    }

    public static void typeTable (String[] array){
        for (int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }

}
