package pro1.map;

import java.util.*;

public class Samples {
    public static void main(String[] args) {
        //#1
        //deklaracja, inicjalizacja i podstawowe operacje na setacb
        mapBasics();

        //#2
        //użycie equals i hashCode
        //hashCodeAndEquals();

        //#3
        //użycie LinkedHashMap
        //linkedHashMap();

        //#4
        //użycie TreeMap
        //treeMap();
    }

    private static void mapBasics() {
        //deklaracja mapy gdzie klucze to obiekty typu Integer, a wartości to obiekty typu String
        Map<Integer, String> numbersMap = new HashMap<>();

        //********************************************
        // Dodawanie

        //dodajemy element do seta
        numbersMap.put(1, "jeden");
        numbersMap.put(2, "dwa");
        numbersMap.put(2, "DWA");//duplikat nadpisują wartość pod podanym kluczem
        numbersMap.put(101, "sto i jeden");

        //dodajemy jeżeli nie istnieje podany klucz
        numbersMap.putIfAbsent(5, "pięć");
        String actualValue = numbersMap.putIfAbsent(1, "JEDEN");
        System.out.println("actualValue = " + actualValue);

        //wyliczamy nową wartość przez lambdę
        numbersMap.computeIfPresent(1, (key, value) -> value + ",one");

        //jeżeli klucz nie istnieje dodaj klucz i wartość, jeżeli istnieje połącz tak jak zwróci lambda
        numbersMap.merge(10, "dziesięć", String::concat);
        numbersMap.merge(5, "five", (oldValue, newValue) -> oldValue + "," + newValue);

        System.out.println("-----------------");
        numbersMap.forEach((key, value) -> System.out.println(key + "=" + value));

        System.out.println("-----------------");
        //usuwamy pojedynczy element po jego kluczu
        String valueRemoved = numbersMap.remove(2);
        System.out.println("valueRemoved = " + valueRemoved);

        //podmieniamy wartość pod podanym kluczem
        String oldValue = numbersMap.replace(10, "ten");
        System.out.println("oldValue = " + oldValue);

        System.out.println("numbersMap = " + numbersMap);

        //możemy też łatwo wyczyścić cała mapę
        numbersMap.clear();

        System.out.println("-----------------");

        //********************************************
        // Wyświetlanie elementów
        numbersMap.put(1, "jeden");
        numbersMap.put(4, "cztery");
        numbersMap.put(7, "siedem");
        numbersMap.put(10, "dziesięć");
        numbersMap.put(11, "jedenaście");

        //pobieramy wartość przypisaną do klucza o ile istnieje
        String valueFor1 = numbersMap.get(1);
        System.out.println("valueFor1 = " + valueFor1);
        String valueFor2 = numbersMap.get(2);
        System.out.println("valueFor2 = " + valueFor2);
        //można też podać wartość domyślną jak klucz się nie znajdzie
        valueFor2 = numbersMap.getOrDefault(2, "dwa");
        System.out.println("valueFor2 (with default) = " + valueFor2);

        //pobieranie hurtowe - same klucze
        System.out.println("numbersMap.keySet() = " + numbersMap.keySet());

        //pobieranie hurtowe - same wartości
        System.out.println("numbersMap.values() = " + numbersMap.values());

        //pobieranie hurtowe - klucze i wartości
        System.out.println("numbersMap entries:");
        Set<Map.Entry<Integer, String>> entries = numbersMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("numbersMap entries (lambda):");
        //to samo co wyżej ale przy pomocy lambdy
        numbersMap.forEach((key, value) -> System.out.println(key + "->" + value));
    }

    private static void hashCodeAndEquals() {
        PersonOne adam1 = new PersonOne("Adam", "Nowak");
        PersonOne adam2 = new PersonOne("Adam", "Nowak");
        PersonTwo marek1 = new PersonTwo("Marek", "Kropka");
        PersonTwo marek2 = new PersonTwo("Marek", "Kropka");
        PersonTwo jurek = new PersonTwo("Jurek", "Przecinek");

        //********************************************
        // Jak zachowują się obiekty(klucze) z różną implementacją metody hashCode() i equals()
        Map<Person, Integer> personsSalary = new HashMap<>();
        personsSalary.put(adam1, 1000);
        personsSalary.put(adam2, 150);
        personsSalary.put(marek1, 2000);

        //dodanie nowej wartości dla tego samego klucza nadpisuje wartość, ale klucz zostawia ten sam
        Integer oldSalary = personsSalary.put(marek2, 2300);
        System.out.println("old salary = " + oldSalary);

        personsSalary.put(jurek, 1005);

        System.out.println("personsSalary = " + personsSalary);
    }

    private static void linkedHashMap() {
        //w HashMap porządek elementów jest nieprzewidywalny
        Map<String, String> fruits = new HashMap();
        fruits.put("gruszka", "pear");
        fruits.put("jabłko", "apple");
        fruits.put("pomarańcza", "orange");
        fruits.put("cytryna", "lemon");
        fruits.put("jabłko", "apple2");

        System.out.println("map of fruits = " + fruits);

        //LinkedHashMap zachowuje porządek elementów - zgodny z kolejnością dodawania elementów do kolekcji
        fruits = new LinkedHashMap<>();
        fruits.put("gruszka", "pear");
        fruits.put("jabłko", "apple");
        fruits.put("pomarańcza", "orange");
        fruits.put("cytryna", "lemon");
        //jeżeli dodamy drugi raz ten sam element - porządek nie zostanie zmieniony
        fruits.put("jabłko", "apple2");

        System.out.println("linked hash map of fruits = " + fruits);
    }

    private static void treeMap() {
        //domyślne użycie TreeMap - elementy do zapisania w kolekcji muszą implementować Comparable
        TreeMap<String, String> fruits = new TreeMap<>();
        fruits.put("gruszka", "pear");
        fruits.put("jabłko", "apple");
        fruits.put("pomarańcza", "orange");
        fruits.put("cytryna", "lemon");
        fruits.put("jabłko", "apple2");

        System.out.println("tree map of fruits = " + fruits);

        //użycie TreeSet z comparatorem - zmieniamy porządek przechowywania danych
        fruits = new TreeMap<>(Comparator.reverseOrder());
        fruits.put("gruszka", "pear");
        fruits.put("jabłko", "apple");
        fruits.put("pomarańcza", "orange");
        fruits.put("cytryna", "lemon");
        fruits.put("jabłko", "apple2");

        System.out.println("tree map (comparator) of fruits = " + fruits);

        //co się stanie jak źle zaimplementujemy comparator
        fruits = new TreeMap<>((o1, o2) -> 0);
        fruits.put("gruszka", "pear");
        fruits.put("jabłko", "apple");
        fruits.put("pomarańcza", "orange");
        fruits.put("cytryna", "lemon");
        fruits.put("jabłko", "apple2");

        System.out.println("tree map (wrong comparator) of fruits = " + fruits);

        System.out.println("------------------------");

        fruits = new TreeMap<>();
        fruits.put("gruszka", "pear");
        fruits.put("jabłko", "apple");
        fruits.put("pomarańcza", "orange");
        fruits.put("cytryna", "lemon");

        System.out.println("fruits = " + fruits);

        //pobieramy pierwszy i ostatni klucz
        System.out.println("fruits.firstKey() = " + fruits.firstKey());
        System.out.println("fruits.lastKey() = " + fruits.lastKey());

        //pobieramy pierwszy klucz, który jest większy lub równy podanemu argumentowi
        System.out.println("fruits.ceilingKey(h) = " + fruits.ceilingKey("h"));
        //pobieramy pierwszy klucz, który jest mniejszy lub równy podanemu argumentowi
        System.out.println("fruits.floorKey(h) = " + fruits.floorKey("h"));

        System.out.println("fruits.ceilingKey(t) = " + fruits.ceilingKey("t"));
        System.out.println("fruits.floorKey(t) = " + fruits.floorKey("t"));

        //pobieramy podzbiór danych zawartych pomiędzy podanymi argumentami
        SortedMap<String, String> subMap = fruits.subMap("g", "z");
        System.out.println("fruits.subMap(g, z) = " + subMap);
        System.out.println("fruits.subMap(jabłko, true, pomarańcza, true) = " + fruits.subMap("jabłko", true, "pomarańcza", true));

        //pobieramy podzbiór danych mniejszych od podanego argumentu
        SortedMap<String, String> headMap = fruits.headMap("d");
        System.out.println("fruits.headMap(d) = " + headMap);
        //pobieramy podzbiór danych większych od podanego argumentu
        System.out.println("fruits.tailMap(d) = " + fruits.tailMap("d"));
    }
}