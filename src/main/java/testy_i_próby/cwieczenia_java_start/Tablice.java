package testy_i_próby.cwieczenia_java_start;

public class Tablice {
    public static void main(String[] args) {
        int tabliczka[] = new int[7];
        tabliczka[0] = 6;
        tabliczka[1] = 5;
        tabliczka[2] = 4;
        tabliczka[3] = 3;
        tabliczka[4] = 2;

        System.out.println("jednowymiarowa");
        for (int i = 0; i < tabliczka.length; i++) {
            System.out.println("Table element: " + tabliczka[i]);
        }

        int table[][] = {{2, 3, 4}, {5, 6, 7}};

        System.out.println("wielowymiarowa");
        for (int i = 0; i < table[i].length; i++) {
            for (int j = 0; j < table[j].length; j++) {
                System.out.println(table[i][j]);
            }
        }
    }
}
