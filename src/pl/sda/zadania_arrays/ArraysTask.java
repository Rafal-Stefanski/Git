package pl.sda.zadania_arrays;

public class ArraysTask {
    public static void main(String[] args) {
        ArraysTask tasks = new ArraysTask();

        // #1
        System.out.println("\n=== Task #1 ===");
        tasks.printStringArray(new String[]{"a", "ab", "abc", "abcd", "abcde"});

//        int [] myTable;
//        myTable = new int []{12, 23, 45};
//
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
    private void printStringArray(String[] arrOfStrings) {
        int n = 0;
        while (n < arrOfStrings.length) {
            System.out.println(arrOfStrings[n]);
            n++;
        }

        for (int i = 0; i < arrOfStrings.length; i++) {
            System.out.println(arrOfStrings[i]);
        }
        for (String arrOfString : arrOfStrings) {
            System.out.println(arrOfString);
        }
    }

    private void printStringArrayVarargs(String... strings) {printStringArray(strings);}

    public static void typeTable (String[] array){
        for (int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }

}
