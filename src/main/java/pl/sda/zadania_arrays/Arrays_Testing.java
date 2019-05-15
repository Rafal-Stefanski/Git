package pl.sda.zadania_arrays;

public class Arrays_Testing {
    public static void main(String[] args) {
        String[] numbers;
        numbers = new String[4];
        numbers[0] = "pierwsza wartosc, ";
        numbers[1] = "druga wartosc, ";
        numbers[2] = "trzecia wartosc, ";
        numbers[3] = "czwarta wartosc, ";
        //wypisanie 1 wartości tablicy
        System.out.println(numbers[2]);
        //wypisanie wszystkich wartości tablicy pętlą
        System.out.println("for:");
        for (int i = 0; i < 2; i++) {
            System.out.print(numbers[i]);
        }
        //wypisanie wszystkich wartości tablicy z pętlą for each
        System.out.println();
        System.out.println("for each:");
        int[] numbers2 = {1, 3, 5, 7, 9};
        for (int i : numbers2) {
            System.out.print(i);
        }
    }
}
