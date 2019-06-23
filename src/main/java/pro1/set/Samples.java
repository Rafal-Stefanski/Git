package pro1.set;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.*;
import java.util.function.Predicate;

public class Samples {
    public static void main(String[] args) {
        //#1
        //deklaracja, inicjalizacja i podstawowe operacje na setacb
        setBasics();

        //#2
        //użycie equals i hashCode
        hashCodeAndEquals();

        //#3
        //użycie LinkedHashSet
        linkedHashSet();

        //#4
        //użycie TreeSet
        treeSet();
    }

    private static void setBasics() {
        //deklaracja seta stringów
        Set<String> colors = new HashSet<>();

        //********************************************
        // Dodawanie

        //dodajemy element do seta
        colors.add("red");
        colors.add("white");
        colors.add("white"); //duplikat są ignorowane - pierwsza wartość pozostaje w secie

        //dodajemy hurtem wiele elementów
        List<String> additionalList = Lists.newArrayList("pink", "yellow", "brown", "grey");
        colors.addAll(additionalList);

        System.out.println("colors = " + colors);

        //********************************************
        // Usuwanie

        //usuwamy pojedynczy element po jego wartości
        colors.remove("grey");

        //usuwamy elementy hurtem po ich wartości, elementy które nie występują w secie do usunięcia zostaną pominięte (np. "purple")
        List<String> listToRemove = Lists.newArrayList("red", "purple");
        colors.removeAll(listToRemove);

        //pozostawiamy na secie tylko elementy które znajdują sie w podanej kolekcji
        List<String> listToRetain = Lists.newArrayList("brown", "purple", "gold", "white");
        colors.retainAll(listToRetain);

        //usuwamy elementy spełniające warunek - z użyciem lambdy
        Predicate<String> filter = color -> color.length() > 5;
        colors.removeIf(filter);

        System.out.println("colors after deletion = " + colors);

        //możemy również usunąć wszystkie elementy seta
        colors.clear();
        System.out.println("colors after clear() = " + colors);

        //********************************************
        // Wyświetlanie elementów
        //klasa Sets pochodzi z biblioteki Guava !
        colors = Sets.newHashSet("pink", "yellow", "brown", "purple", "gold");

        // #1 - wykorzystanie obiektu typu Iterator pochodzacego z interfejsu Iterable
        System.out.println("\nColors by iterator");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // #2 - wykorzystanie petli foreach
        System.out.println("\nColors by `for-each` loop");
        for (String color : colors) {
            System.out.println(color);
        }

        // #3 - colors but for loop
        System.out.println("\nColors by `foreach` method");
        colors.forEach(System.out::println);
    }

    private static void hashCodeAndEquals() {
        PersonOne adam1 = new PersonOne("Adam", "Nowak");
        PersonOne adam2 = new PersonOne("Adam", "Nowak");

        //gdy equals nie jest nadpisane w klasie
        System.out.println("adam1 == adam2 = " + (adam1 == adam2));
        System.out.println("adam1.equals(adam2) = " + adam1.equals(adam2));

        System.out.println("------------------------");

        PersonTwo marek1 = new PersonTwo("Marek", "Kropka");
        PersonTwo marek2 = new PersonTwo("Marek", "Kropka");
        PersonTwo jurek = new PersonTwo("Jurek", "Przecinek");

        //gdy equals jest nadpisane w klasie
        System.out.println("marek1 == marek2 = " + (marek1 == marek2));
        System.out.println("marek1.equals(marek2) = " + marek1.equals(marek2));
        System.out.println("marek1 == jurek = " + (marek1 == jurek));
        System.out.println("marek1.equals(jurek) = " + marek1.equals(jurek));

        System.out.println("------------------------");

        //********************************************
        // Jak zachowują się obiekty z różną implementacją metody hashCode() w kolekcji opartej o tablicę z haszowaniem
        Set<Person> persons = new HashSet<>();
        persons.add(adam1);
        persons.add(adam2);
        persons.add(marek1);
        persons.add(marek2);
        persons.add(jurek);

        PersonThree ewa1 = new PersonThree("Ewa", "Paragraf");
        PersonThree ewa2 = new PersonThree("Ewa", "Paragraf");
        persons.add(ewa1);
        persons.add(ewa2);

        System.out.println("persons = " + persons);
    }

    private static void linkedHashSet() {
        //w HashSet porządek elementów jest nieprzewidywalny
        Set<String> fruits = new HashSet<>();
        fruits.add("pear");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");
        fruits.add("apple");

        System.out.println("hash set fruits = " + fruits);

        //LinkedHashSet zachowuje porządek elementów - zgodny z kolejnością dodawania elementów do zbioru
        fruits = new LinkedHashSet<>();
        fruits.add("pear");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("lemon");
        //jeżeli dodamy drugi raz ten sam element - porządek nie zostanie zmieniony
        fruits.add("apple");

        System.out.println("linked hash set fruits = " + fruits);
    }

    private static void treeSet() {
        //domyślne użycie TreeSet - elementy do zapisania w kolekcji muszą implementować Comparable
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("pear");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("plum");
        fruits.add("banana");

        System.out.println("tree set fruits = " + fruits);

        //użycie TreeSet z comparatorem - zmieniamy porządek przechowywania danych
        fruits = new TreeSet<>(new StringComparator());
        fruits.add("pear");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("plum");
        fruits.add("banana");

        System.out.println("tree set (comparator) fruits = " + fruits);

        //co się stanie jak źle zaimplementujemy comparator
        fruits = new TreeSet<>((o1, o2) -> 0);
        fruits.add("pear");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("plum");
        fruits.add("banana");

        System.out.println("tree set (wrong comparator) fruits = " + fruits);

        System.out.println("------------------------");

        fruits = new TreeSet<>();
        fruits.add("pear");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("plum");
        fruits.add("banana");

        System.out.println("fruits = " + fruits);

        //pobieramy pierwszy i ostatni element ze zbioru
        System.out.println("fruits.first() = " + fruits.first());
        System.out.println("fruits.last() = " + fruits.last());

        //pobieramy pierwszy element, który jest większy lub równy podanemu argumentowi
        System.out.println("fruits.ceiling(niedz) = " + fruits.ceiling("niedz"));
        System.out.println("fruits.ceiling(banana) = " + fruits.ceiling("banana"));
        //pobieramy pierwszy element, który jest mniejszy lub równy podanemu argumentowi
        System.out.println("fruits.floor(niedz) = " + fruits.floor("niedz"));
        System.out.println("fruits.floor(banana) = " + fruits.floor("banana"));

        System.out.println("fruits.ceiling(t) = " + fruits.ceiling("t"));
        System.out.println("fruits.floor(t) = " + fruits.floor("t"));

        //pobieramy podzbiór danych zawartych pomiędzy podanymi argumentami
        SortedSet<String> subSet = fruits.subSet("a", "d");
        System.out.println("fruits.subSet(a, d) = " + subSet);
        System.out.println("fruits.subSet(apple, true, orange, true) = " + fruits.subSet("apple", true, "orange", true));

        //pobieramy podzbiór danych mniejszych od podanego argumentu
        SortedSet<String> headSet = fruits.headSet("d");
        System.out.println("fruits.headSet(d) = " + headSet);
        //pobieramy podzbiór danych większych od podanego argumentu
        System.out.println("fruits.tailSet(d) = " + fruits.tailSet("d"));
    }
}

class StringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if(o1.length() != o2.length()) {
            return o1.length() - o2.length();
        }
        return o1.compareTo(o2);
    }
}
