package pro1.list;

import com.google.common.collect.Lists;

import java.util.*;
import java.util.function.Predicate;

public class Samples {
    public static void main(String[] args) {
        //#1
        //deklaracja, inicjalizacja i podstawowe operacje na listach
        listBasics();

        //#2
        //użycie klasy Collections
        collectionsUtils();

        //#3
        //sortowanie elementów listy
        listSorting();

        //#4
        //użycie linkedList
        linkedList();
    }

    private static void listBasics() {
        //deklaracja listy stringów - ArrayList - jako parametr w konstruktorze można ustawić początkową wielkość tablicy
        List<String> colors = new ArrayList<>(10);

        //********************************************
        // Dodawanie

        //dodajemy element na koniec listy
        colors.add("red");
        colors.add("white");

        //dodajemy element w określone miejsce listy
        int index = 1;
        colors.add(index, "black");

        //dodajemy hurtem wiele elementów na koniec listy
        List<String> additionalList = Lists.newArrayList("pink", "yellow", "brown");
        colors.addAll(additionalList);

        //dodajemy hurtem wiele elementów w określone miejsce listy
        additionalList = Lists.newArrayList("grey", "silver", "gold");
        index = 0;
        colors.addAll(index, additionalList);

        System.out.println("colors = " + colors);

        //********************************************
        // Usuwanie

        //usuwamy pojedynczy element po jego wartości
        colors.remove("grey");

        //usuwamy pojedynczy element po jego indexie
        colors.remove(3);

        //usuwamy elementy hurtem po ich wartości, elementy które nie występują w liście do usunięcia zostaną pominięte (np. "purple")
        List<String> listToRemove = Lists.newArrayList("red", "white", "purple");
        colors.removeAll(listToRemove);

        //pozostawiamy na liście tylko elementy które znajdują sie w podanej liście
        List<String> listToRetain = Lists.newArrayList("brown", "purple", "gold", "silver");
        colors.retainAll(listToRetain);

        //usuwamy elementy spełniające warunek - z użyciem lambdy
        Predicate<String> filter = color -> color.length() > 5;
        colors.removeIf(filter);

        System.out.println("colors after deletion = " + colors);

        //********************************************
        // Zmiana wartości elementów

        //zmieniamy pojedynczy element po jego indexie
        colors.set(0, "white");

        //zmieniamy hurtowo używając lambdy
        colors.replaceAll(color -> color.substring(0, 3));

        System.out.println("colors after update = " + colors);

        //********************************************
        // Wyświetlanie elementów
        colors = Lists.newArrayList("pink", "yellow", "brown", "purple", "gold");

        // #1 - wykorzystanie obiektu typu Iterator pochodzacego z interfejsu Iterable
        System.out.println("\nColors by iterator");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // #2 - wykorzystanie petli foreach
        System.out.println("\nColors by `for-each` loop");
        for (String fruit : colors) {
            System.out.println(fruit);
        }

        // #3 - colors but for loop
        System.out.println("\nColors by `for` loop");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        // #4 - colors but for loop
        System.out.println("\nColors by `foreach` method");
        colors.forEach(System.out::println);
    }

    private static void collectionsUtils() {
        List<Integer> numbers = Lists.newArrayList(4, 7, 10);

        //szybka zmiana listy na synchronizowaną (bezpieczną w użyciu w programowaniu wielowątkowym)
        List<Integer> synchronizedList = Collections.synchronizedList(numbers);
        System.out.println("synchronizedList = " + synchronizedList);

        //tworzenie niezmienialnej listy - gdy chcemy mieć pewność że raz ustawiona lista nie zostanie zmieniona
        List<Integer> unmodifiableList = Collections.unmodifiableList(numbers);
        System.out.println("unmodifiableList = " + unmodifiableList);
        //unmodifiableList.add(123); //wyrzuci wyjątek

        //podmiana wartości elementów na inne
        List<String> names = Lists.newArrayList("Julia", "adam", "Robert", "adam", "Zenek");

        Collections.replaceAll(names, "adam", "ADAM");
        System.out.println("names = " + names);

        //kopiowanie z nadpisaniem z zachowaniem indexów listy z której kopiujemy
        List<Integer> dest = Lists.newArrayList(1, 2, 3, 4, 5);
        List<Integer> src = Lists.newArrayList(21, 22, 23);

        Collections.copy(dest, src);
        System.out.println("copied list = " + dest);

        //łatwe tworzenie pustych list - przydaje się przy zwracaniu z metody gdy nie mamy co zwrócić
        List<String> emptyStrings = Collections.emptyList();
        System.out.println("emptyStrings =" + emptyStrings);
    }

    private static void listSorting() {
        List<Double> doubles = Lists.newArrayList(2.5, 6.1, 0.7, 1.1, 9.9);

        //sortowanie w porządku naturalnym
        Collections.sort(doubles);
        System.out.println("doubles sorted = " + doubles);

        //sortowanie w porządku odwrotnym
        Collections.reverse(doubles);
        System.out.println("doubles reverse = " + doubles);

        List<Product> products = Lists.newArrayList(
                new Product(1, "SmartTV", 1999.99),
                new Product(2, "Laptop HD", 1500.55),
                new Product(3, "SmartWatch", 999.05),
                new Product(4, "Pen", 15.59),
                new Product(5, "Laptop FullHD", 1500.55)
        );

        //sortowanie w porządku naturalnym
        Collections.sort(products);
        System.out.println("\nproducts sorted = " + products);

        //sortowanie w porządku odwrotnym
        Collections.reverse(products);
        System.out.println("\nproducts reverse = " + products);

        //sortowanie przy pomocy comparatora
        Collections.sort(products, Comparator.comparing(Product::getName));
        System.out.println("\nproducts sorted by name:");
        products.forEach(product -> System.out.println(product.getName()));
    }

    private static void linkedList() {
        LinkedList<String> colors = new LinkedList<>();

        //********************************************
        // Dodawanie

        //dodajemy element na koniec listy
        colors.add("red");
        colors.add("white");
        colors.addLast("gold");

        //dodajemy element na początek listy
        colors.addFirst("silver");
        colors.addFirst("purple");
        colors.push("brown");

        System.out.println("colors = " + colors);

        //********************************************
        // Pobierania elementów
        System.out.println("colors.get(3) = " + colors.get(3));
        System.out.println("colors.getFirst() = " + colors.getFirst());
        System.out.println("colors.getLast() = " + colors.getLast());
        //pobiera i usuwa pierwszy element
        System.out.println("colors.peek() = " + colors.peek());
        System.out.println("colors.poll() = " + colors.poll());

        System.out.println("colors = " + colors);

        //********************************************
        // Usuwanie elementów
        colors.removeFirst();
        colors.removeLast();
        System.out.println("colors = " + colors);
    }
}