package pl.sda.zadania_arrays;

public class Arrays_Testing4 {
    public static void main(String[] args) {
        int[] tabelka;
        tabelka = new int[5];
        tabelka[0] = 12;
        tabelka[1] = 23;
        tabelka[2] = 34;
        tabelka[3] = 45;
        tabelka[4] = 56;
        System.out.println("Single value from array:");
        System.out.println(tabelka[1]);
        System.out.println("All values from array:");
        for (int i = 0; i < tabelka.length; i++) {
            System.out.println("pos: " + i + ", value: " + tabelka[i]);
        }
    }
}
