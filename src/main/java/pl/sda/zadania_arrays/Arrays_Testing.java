package pl.sda.zadania_arrays;

public class Arrays_Testing {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[4];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        //wypisanie 1 wartości tablicy
        System.out.println(numbers[2]);
        //wypisanie wszystkich wartości tablicy pętlą
        System.out.println("for:");
        for (int i = 0; i < numbers.length; i++) {
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
