package pro1.arrays;

import java.util.Arrays;
import java.util.List;

public class Tasks {

    public static void main(String[] args) {
        //#1
//        arraysOfStrings();

        //#2
//        String[] words = {"one", "two", "three", "four"};
//        String[] reversedWords = reverse(words);
//        System.out.println("#2 metodę która odwróci kolejność występowania wyrazów");
//        System.out.println("reversedWords = " + Arrays.toString(reversedWords));

        //#3
//        double[] numbers = {1.5, 6.9, -7.3, -7.5, 9, 10.1};
//        double min = findMin(numbers);
//        System.out.println("Znajdź najmniejszą wartość w tablicy, zwróć ją jako wynik metody");
//        System.out.printf("min of %s is: %.2f%n", Arrays.toString(numbers), min);

        //#4
        //String[] wordsExtended = copy(words, 10);
        //System.out.println("wordsExtended = " + Arrays.toString(wordsExtended));

        //#5
        //words = addElementToArray(words, "five");
        //words = addElementToArray(words, "six");
        //words = addElementToArray(words, "seven");
        //System.out.println("wordsExtended = " + Arrays.toString(words));

        //#6
        //Car[] cars = {new Car("Porshe", 2011, 10), new Car("Skoda", 2004, 8), new Car("Ford Mondeo", 2005, 9), new Car("Fiat", 2000, 4),
        //              new Car("Audi", 2016, 8), new Car("Toyota", 2005, 7), new Car("Honda", 2011, 9), new Car("Ford S-max", 2014, 9)};
        //cars = sortCars(cars);
        //System.out.println("cars sorted:");
        //Arrays.stream(cars)
        //     .forEach(System.out::println);

        //#7
        //cars = sortCarsByRating(cars);
        //System.out.println("cars sorted by rating:");
        //Arrays.stream(cars)
        //     .forEach(System.out::println);

        //#8* - dla chętnych
        //List<String> bestModels = extractTheBestModels(cars);
        //System.out.println("best models = " + bestModels);
    }

    /**
     * 1. Stwórz tablicę obiektów typu String. Wypisz na ekran pierwszy i ostatni element tablicy.
     * Następnie wypisz na ekran wszystkie stringi które zaczynają się na literę 'a'.
     */
    private static void arraysOfStrings() {
        String[] tablica1 = new String[6];
        tablica1[0] = "Ola";
        tablica1[1] = "Ula";
        tablica1[2] = "Zulugula";
        tablica1[3] = "Asia";
        tablica1[4] = "Basia";
        tablica1[5] = "Kasia";

        // inny sposób podania tablicy
        String[] tablica2 = new String[]{"Ola", "Ula", "Zulugula", "Asia", "Basia"};

        System.out.println("Wypisujemy pierwszy i ostani element tablicy");
        System.out.println(tablica1[0] + " " + tablica1[tablica1.length-1]);

        System.out.println("Wszystkie stringi w tablicy");
        System.out.println(Arrays.toString(tablica1));
       System.out.println("Wszystkie stringi w tablicy które zaczynają się na literę 'a'");

        for (String name: tablica1) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }
    }

    /**
     * 2. Napisz metodę która odwróci kolejność występowania wyrazów w podanej tablicy
     */
    private static String[] reverse(String[] words) {
        String[] reverseWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            reverseWords[i] = words[words.length - 1 - i];
        }
        return reverseWords;
    }

    /**
     * 3. Znajdź najmniejszą wartość w tablicy, zwróć ją jako wynik metody
     */
    private static double findMin(double[] numbers) {

        //z wykorzystaniem funkcji arrays.
        //Arrays.sort(numbers);
        //return numbers[0];

        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException();
        }
            double min = numbers[0];
        for (int i=1; i<numbers.length; i++) {
            if (numbers[i]<min) min = numbers[i];
        }
        return 0;
    }

    /**
     * 4. Napisz metodę, która skopiuje elementy tablicy words do nowej tablicy o podanej wielkości (parametr length).
     * Jeżeli parametr length jest mniejszy niż wielkość tablicy words w nowej tablicy mają się znaleźć tylko elementy, które się zmieszczą.
     */
    private static String[] copy(String[] words, int length) {
        return null;
    }

    /**
     * 4.1 Spróbuj napisać podobną metodę ale zamiast tablicy words niech przyjmuje parametr typu varargs
     */
    private static String[] copy(int length, String... words) {
        return null;
    }

    /**
     * 5. Napisz metodę, która doda element do tablicy - jeżeli nie ma miejsca należy stworzyć nową tablicę dwukrotnie większą i skopiować elementy ze starej
     */
    private static String[] addElementToArray(String[] words, String word) {
        return null;
    }

    /**
     * 6. Dodaj do klasy Car możliwość sortowanie w porządku naturalnym (najpierw po marce, potem po roku produkcji).
     *    Następnie posortuj tablicę obiektów Car w porządku naturalnym i ją zwróć
     */
    private static Car[] sortCars(Car[] cars) {
        return null;
    }

    /**
     * 7. Posortuj tablicę obiektów Car w porządku dodatkowym, najpierw po ocenie malejąco, potem po marce rosnąco
     */
    private static Car[] sortCarsByRating(Car[] cars) {
        return null;
    }

    /**
     * 8*. Używając Stream API wyciągnij nazwy 3 modeli, które mają najwyższe oceny (w przypadku tej samej oceny młodszy wygrywa)
     */
    private static List<String> extractTheBestModels(Car[] cars) {
        return null;
    }
}