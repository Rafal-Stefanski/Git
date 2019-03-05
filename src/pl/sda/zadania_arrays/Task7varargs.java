package pl.sda.zadania_arrays;

/**
 * 7. Przerób każdą z poprzednich metod (poza nr 3)
 * tak żeby przyjmowała parametry jako varargs.
 */

public class Task7varargs {

    public static void main(String[] args) {

        String[] myTable = new String[3];
        myTable[0]="cat";
        myTable[1]="dog";
        myTable[2]="fish";

//        void getAnimals (int cat, dog, fish);


        typeTable(myTable);
    }

    public static void typeTable (String[] array){
        for (int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }

}
