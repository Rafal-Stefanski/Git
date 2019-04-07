package pro1.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class Samples {
    public static void main(String[] args) {
        System.out.println("#1 - arraysBasics");
        //deklaracja, inicjalizacja i podstawowe operacje na tablicach
        arraysBasics();
        System.out.println("----------------");

        System.out.println("#2 - multidimensionalArrays");
        //tworzenie i operacje na tablicy dwu-wymiarowej
        multidimensionalArrays();
        System.out.println("----------------");

        System.out.println("#3 - arraysUtils");
        //użycie klasy Arrays
        arraysUtils();
        System.out.println("----------------");

        //#4
        //varargs
        //varargsSamples();
//        System.out.println("----------------");

        //#5
        //sortowanie elementów tablicy
        //arraysSorting();
//        System.out.println("----------------");


        //#6
        //użycie tablic jako źródła dla streamów
        //arraysAndStreams();
//        System.out.println("----------------");

    }

    private static void arraysBasics() {
        //********************************************
        // 3 sposoby deklaracji i incjalizacji tablic

        //deklaracja tablicy integerów
        int[] arrayOfNumbers1;

        //tworzymy pustą tablicę o rozmiarze 10 - maksymalnie 10 elementów może się w niej zmieścić
        arrayOfNumbers1 = new int[10];
        //uzupełniamy po kolei elementy tablicy
        arrayOfNumbers1[0] = 1;
        arrayOfNumbers1[1] = 6;
        arrayOfNumbers1[2] = 10;
        arrayOfNumbers1[3] = 115;
        //uwaga poniższy kod powoduje powstanie wyjątku (ArrayIndexOutOfBoundsException) w czasie wykonania!
        //arrayOfNumbers1[-1] = 10;
        //arrayOfNumbers1[10] = 10;

        //prosta iteracja po elementach tablicy,
        //warto zauważyć że wszystkie elementy mają ustawioną wartość (domyślną równą 0 lub ustawioną wcześniej w kodzie)
        for (int i = 0; i < arrayOfNumbers1.length; i++) {
            System.out.printf("element nr %d = %d%n", i, arrayOfNumbers1[i]);
        }

        //tworzymy tablicę wypełnioną kilkoma liczbami
        int[] arrayOfNumbers2 = new int[]{1, 6, 10, 115};
        //pętla for-each - tutaj nie mamy dostępu do indexu elementu który przeglądamy
        for (int number : arrayOfNumbers2) {
            System.out.println("element =" + number);
        }

        //to samo co wyżej tylko krócej
        int[] arrayOfNumbers3 = {1, 6, 10, 115};

        //elementu tablicy możemy nadpisywać dowolnie
        System.out.println("before = " + arrayOfNumbers3[0]);
        arrayOfNumbers3[0] = 4;
        System.out.println("after = " + arrayOfNumbers3[0]);

        //tablica to obiekt czyli dziedziczy po klasie Object - można na niej wywoływać metody z Object
        System.out.println("toString = " + arrayOfNumbers3.toString());

        //rozmiar tablicy odkrywamy dzięki polu length
        System.out.println("length = " + arrayOfNumbers3.length);
    }

    private static void multidimensionalArrays() {
        //deklaracja i inicjalizacja dwu-wymiarowej tablicy liczb typu double
        double[][] numbers2 = new double[2][3];
        numbers2[0][0] = 1.1;
        numbers2[0][1] = 1.2;
        numbers2[1][0] = 2.1;
        numbers2[1][1] = 2.2;
        numbers2[1][2] = 2.3;

        //zmienna numbers2 odwołuje się do tablicy które jako swoje elementy przechowuje inne tablice
        System.out.println(numbers2.length);

        //zmienna numbers2[0] i numbers2[1] odwołuje się do tablicy które jako swoje elementy przechowuje liczby double
        System.out.println(numbers2[0].length);
        System.out.println(numbers2[1].length);

        //odwołanie do liczb w tabliach zagnieżdżonych
        System.out.println(numbers2[0][0]);
        System.out.println(numbers2[0][1]);
        System.out.println(numbers2[0][2]); // NIE MA WYJATKU! ISTNIEJE WARTOŚĆ DOMYŚLNA
        System.out.println(numbers2[1][0]);
        System.out.println(numbers2[1][1]);
        System.out.println(numbers2[1][2]);

        //podwójna pęlta for-each
        for (double[] doubles : numbers2) {
            for (double aDouble : doubles) {
                System.out.println("aDouble = " + aDouble);
            }
        }
    }

    private static void arraysUtils() {
        //tekstowa wersja tablic
        Double[] doubles = {5.5, 1.0, .7, 99., -7.1};
        System.out.println("doubles.toString() = " + doubles.toString());
        System.out.println("Arrays.toString(doubles) = " + Arrays.toString(doubles));

        //porównywanie tablic
        String[] strings1 = {"Ala", "Ola", "ela"};
        String[] strings2 = {"Ala", "Ola", "ela"};
        System.out.println("strings1.equals(strings2) = " + strings1.equals(strings2));
        System.out.println("Arrays.equals(strings1, strings2) = " + Arrays.equals(strings1, strings2));

        //wypełnianie tablic wartościami
        short[] shorts = new short[5];
        Arrays.fill(shorts, (short) 15);
        for (short aShort : shorts) {
            System.out.println("aShort = " + aShort);
        }

        //kopiowanie elementów tablicy
        String[] cars = {"Ford", "Opel", "BMW", "Audi", "Renault"};
        String[] carsExtended = Arrays.copyOf(cars, cars.length + 3);
        System.out.println("carsExtended = " + Arrays.toString(carsExtended));

        //sortowanie elementów tablicy
        Arrays.sort(cars);
        System.out.println("cars sorted = " + Arrays.toString(cars));
    }

    private static void varargsSamples() {
        //proste przekazanie tablicy do metody
        String[] colors = {"red", "pink", "black", "white", "yellow"};
        noVarargs(colors);
        System.out.println("-------------------" );

        //podobnie jak wyżej ale bez potrzeby konstruowania tablicy - tu używamy varargs - argumentów zmiennej ilości
        withVarargs("red", "white", "black", "purple");
        System.out.println("-------------------" );
        //można nawet bez elementów - wtedy w metodzie otrzymamy pustą tablicę
        withVarargs();
        System.out.println("-------------------" );

        //jeżeli chcemy wymusić przynajmniej jeden element możemy dodać go jako pierwszy parametr metody
        withAtLeastOneElement("white");
        System.out.println("-------------------" );

        //parametr typu varargs musi znajdować się na końcu listy parametrów metody, wcześniej może wystąpić dowolna liczba innych parametrów
        withMultiParameters(12.4, 5,  "white", "black");
        System.out.println("-------------------" );
    }

    private static void noVarargs(String[] colors) {
        for (String color : colors) {
            System.out.println("color = " + color);
        }
    }

    private static void withVarargs(String... colors) {
        for (String color : colors) {
            System.out.println("color = " + color);
        }
    }

    private static void withAtLeastOneElement(String baseColor, String... colors) {
        System.out.println("color = " + baseColor);
        for (String color : colors) {
            System.out.println("color = " + color);
        }
    }

    private static void withMultiParameters(double dNumber, int iNumber, String... colors) {
        System.out.println("dNumber = " + dNumber);
        System.out.println("iNumber = " + iNumber);
        for (String color : colors) {
            System.out.println("color = " + color);
        }
    }

    private static void arraysSorting() {
        int[] integers = {-8, 9, 5, -10, 4, 22};
        //sortowanie w porządku naturalnym
        System.out.println("integers = " + Arrays.toString(integers));
        Arrays.sort(integers);
        System.out.println("integers sorted = " + Arrays.toString(integers));

        String[] animals = {"puma", "lion", "snake", "elephant"};
        //sortowanie w porządku naturalnym
        System.out.println("animals = " + Arrays.toString(animals));
        Arrays.sort(animals);
        System.out.println("animals sorted = " + Arrays.toString(animals));

        Person[] persons = {new Person("Jarek", "Nowak", 19), new Person("Zenek", "Nowak", 23), new Person("Zofia", "Rożen", 45),
                new Person("Józef", "Adamus", 43), new Person("Adam", "Adamus", 59), new Person("Ula", "Adamus", 40)};
        //sortowanie w porządku naturalnym
        System.out.println("persons = " + Arrays.toString(persons));
        Arrays.sort(persons);
        System.out.println("persons sorted = " + Arrays.toString(persons));

        //sortowanie w porządku odwrotnym
        Arrays.sort(persons, Comparator.reverseOrder());
        System.out.println("persons sorted reversed = " + Arrays.toString(persons));

        //sortowanie w porządku zdefiniowanym
        Arrays.sort(persons, new PersonByAgeComparator());
        System.out.println("persons sorted by age = " + Arrays.toString(persons));

        //to samo co wyżej ale comparator jako klasa wewnętrzna
        Arrays.sort(persons, new PersonByAgeComparatorInner());
        System.out.println("persons sorted by age (inner) = " + Arrays.toString(persons));

        //to samo co wyżej ale comparator jako lambda
        Comparator<Person> personComparator = (o1, o2) -> o1.getAge() - o2.getAge();
        Arrays.sort(persons, personComparator);
        System.out.println("persons sorted by age (lambda) = " + Arrays.toString(persons));

        //tworzymy komparator z użyciem metod pomocniczych z Comparator
        Comparator<Person> personComparatorByName = Comparator.comparing(Person::getName).thenComparing(Person::getAge);
        Arrays.sort(persons, personComparatorByName);
        System.out.println("persons sorted by name = " + Arrays.toString(persons));
    }

    private static void arraysAndStreams() {
        Integer[] numbers = new Integer[]{-6, 12, 8, 45, 12, 3, 3, -5, 32, 15, 11, -2, 0, 3, 19, 22};

        //*******************************
        //zwykłe operacje na elementach tablicy
        List<String> luckyNumbers = new ArrayList<>();
        List<Integer> added = new ArrayList<>();
        String prefix = "luckyNumber: ";
        //wybieramy liczby, które są dodatnie, nie są zdublowane
        for (int number : numbers) {
            if(number <= 0) {
                continue;
            }

            if(added.contains(number)) {
                continue;
            }

            added.add(number);
        }

        //następnie sortujemy
        Collections.sort(added);
        //i na koniec dodajemy prefix i ograniczamy wynik do 5 sztuk
        int count = 0;
        for (Integer number : added) {
            if(count >= 5) {
                break;
            }
            String numberStr = prefix + number;
            luckyNumbers.add(numberStr);
            count++;
        }

        System.out.println("lucky numbers = " + luckyNumbers);

        //*******************************
        //to samo co wyżej ale z pomocą Stream API
        luckyNumbers = Arrays.stream(numbers)
                .filter(number -> number > 0)
                .distinct()
                .sorted()
                .limit(5)
                .map(number -> prefix + number)
                .collect(Collectors.toList());
        System.out.println("lucky numbers(by streams) = " + luckyNumbers);
    }

    static class PersonByAgeComparatorInner implements Comparator<Person> {
        @Override
        public int compare(Person o1, Person o2) {
            if(o1 == null && o2 == null) {
                return 0;
            }

            if(o1 == null) {
                return -1;
            }

            if(o2 == null) {
                return 1;
            }

            return o1.getAge() - o2.getAge();
        }
    }
}