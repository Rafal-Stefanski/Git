package Zadania_datatypes_TS;

/*
public class Task5TS {
}

*/

public class Task5TS {
    public static void main(String[] args) {
        int a = 65; // pierwszy znak łaciński
        int b = 1488; // pierwszy znak hebrajski
        int c = 3840; // pierwszy znak tybetański


        for (int i = 0; i < 5; i++) {

            System.out.print((char) a + " ");
            a = (a + 1);
        }
        System.out.println();

        for (int i = 0; i < 5; i++){

            System.out.print(b + " ");
            int x = (int)b++;

        }
        System.out.println();

        for (int i = 0; i < 5; i++){

            System.out.print(c + " ");
            int x = (int)c++;

        }
        System.out.println();

    }
}
