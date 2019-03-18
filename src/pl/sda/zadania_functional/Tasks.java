package pl.sda.zadania_functional;

import com.sun.istack.internal.Nullable;

import java.util.HashSet;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tasks {

    public static void main(String[] args) {
        //#1
        useLambdas();

        //#2
        useOptional();

        //#3
        useStreams();
    }

    /**
     * 1. Utwórz i użyj lambdę która:
     * - utworzy obiekt klasy Double (Supplier)
     * - pobierze obiekt klasy String i wyświetli na konsolę (Consumer)
     * - sprawdzi czy podany string ma długość > 10 (Predicate)
     * - przekształci dwie liczby w String (zsumuje je i zwróci reprezentację tekstową) (BiFunction)
     */
    private static void useLambdas() {
        Supplier<Double> doubleSupplier = () -> 10.6;
        System.out.println(doubleSupplier.get());

        Consumer<String> stringConsumer = s -> System.out.println("stringConsumer1:" + s);
        stringConsumer.accept("lambdaConsumer");

        Predicate<String>stringPredicate = s -> {
            if (s != null) {
                return s.length() > 10;
            }
            return false;
        };
        System.out.println(stringPredicate.test(null));
        System.out.println(stringPredicate.test("abc"));
        System.out.println(stringPredicate.test("defghijklmnoprst"));

        BiFunction<Integer, Integer, String> integerStringBiFunction = ((integer, integer2) -> String.valueOf(integer + integer2));
        System.out.println(integerStringBiFunction);
    }

    /**
     * 2. Utwórz obiekt Optional, który:
     * - nie będzie zawierał żadnej wartości (Optional.empty)
     * - będzie pozwalał przyjmować wartość typu String, która może być `null` (Optional.ofNullable)
     * - rzuci wyjątkiem, w momencie podania wartości null typu Float (Optional.of)
     * - rzuci własny wyjątek, jeśli podano wartość `null` i próbowano pobrać wartość (Optional.orElseThrow)
     * - zwróci wartość domyślną dla typu String jeśli podano wartość `null` (Optional.orElse)
     */

    private static void useOptional() {
        Optional<String> optional = Optional.ofNullable(null);
        System.out.println(optional.isPresent());
        optional.ifPresent(s -> System.out.println("ok"));
        System.out.println(optional.orElse("e"));
    }


    /**
     * 3. Utwórz i użyj strumień danych (Stream):
     * - utwórz stream liczb typu Double z kolekcji typu Set - podaj ich sumę i średnią arytmetyczną
     * - utwórz stream liczb całkowitych od 10 do 40, usuń parzyste i podaj sumę pozostałych
     * - utwórz stream obiektów typu String, zamień wszystkie litery na małe, zostaw tylko te które zaczynają się na literę 'a' lub 'z'
     *   i utwórz listę przetworzonych elementów
     * - utwórz stream obiektów Person i utwórz statystykę lat (suma, średnia, minimalny i maksymalny wiek) dla tego zbioru
     * - utwórz strumień który wypisze na ekran ścieżki wszystkich katalogów i podkatalogów znajdujących się w aktualnym katalogu (Files.list && Paths.get("."))
     */
    private static void useStreams() {
//        System.out.println("=========== Task 3 ===========");

        Set<Double> list = new HashSet<>();
        list.add(5d);
        list.add(5.2);
        list.add(18.7);
        list.add(150d);

        Stream<Double> stream = list.stream();

        Double sum = stream.reduce(0.0, (d1, d2) -> d1 + d2);
        OptionalDouble avg = stream.mapToDouble(value -> value).average();
        System.out.println(sum);
        System.out.println(avg.getAsDouble());

        IntStream.range(10, 40).filter(value -> value % 2 != 0);


//        Zapytać o powód błędu... ?
    }
}