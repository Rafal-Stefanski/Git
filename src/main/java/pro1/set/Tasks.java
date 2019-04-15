package pro1.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;

public class Tasks {

    public static void main(String[] args) {
        //#1
        Citizen citizen1 = new Citizen("Jan", "Kowalski", "850223000000");
        Citizen citizen2 = new Citizen("Jan", "Kowalski", "891213000000");
        Citizen citizen3 = new Citizen("Jan", "Kowalski", "850223000000");
        setOfCitizens(citizen1, citizen2, citizen3);
        System.out.println("citizen" + treeSetOfCitizens());    //źle :-( ale dlaczego.. RS

        //#2
//        System.out.println(">--- Task #2 ---<");
        Car car1 = new Car("toyota", "red", "1234");
        Car car2 = new Car("suzuki", "blue", "5678");
        Car car3 = new Car("suzuki", "blue", "5678");
//        setOfCars(car1, car2, car3);


        //#3
        System.out.println(">--- Task #3 ---<");
        NavigableSet<Citizen> citizens = treeSetOfCitizens(new Citizen("Maria", "Bobek", "1"), new Citizen("Adam", "Nowak", "2"),
                new Citizen("Jan", "Kowalski", "3"), new Citizen("Anna", "Kowalska", "4"),
                new Citizen("Mirek", "Nowak", "5"), new Citizen("Edward", "Kania", "6"),
                new Citizen("Zenon", "Jeleń", "7"), new Citizen("Zuzanna", "Lazur", "8")
        );
        citizens.forEach(System.out::println);

        //#4
        /*Set<String> names = citizens.stream()
                .map(citizen -> citizen.getSurname() + " " + citizen.getName())
                .collect(Collectors.toSet());
        Set<String> citizenNames = getNames(new TreeSet<>(names), 'A', 'K');
        System.out.println("citizenNames ('A' - 'K') = " + citizenNames);*/
    }

    /**
     * 1. Stwórz kolekcję typu HashSet obiektów typu Citizen. Dodaj w klasie Citizen odpowiednie
     * metody które zapewnią unikalność obiektów tej klasy
     * Dodaj do kolekcji obiekty przekazane w metodzie i wypisz zawartość set-a na ekran.
     */
    private static void setOfCitizens(Citizen... citizens) {
        Set<Citizen> citizenSet = new HashSet<>(Arrays.asList(citizens));

    }

    /**
     * 2. Stwórz klasę Car zawierającą kilka pól opisujących własności samochodu.
     * Dodaj metody: equals(), hashCode() - zastanów się jakie pole może posłużyć do sprawdzenia
     * czy dwa obiekty klasy Car reprezentują ten sam samochód?
     * Dodaj do kolekcji HashSet kilka obiektów klasy Car - również duplikaty i sprawdź
     * czy w kolekcji nie ma duplikatów.
     */
    private static void setOfCars(Car... cars) {
        Set<Car> carSet = new HashSet<>();
        carSet.addAll(Arrays.asList(cars));
        System.out.println(carSet);
    }

    /**
     * 3. Stwórz kolekcję typu TreeSet obiektów klasy Citizen. Dodaj w klasie Citizen metodę
     * compareTo(), która umożliwi sortowanie po nazwisku i imieniu.
     * Dodaj do kolekcji obiekty przekazane w metodzie i zwróć kolekcję z metody.
     */
    private static NavigableSet<Citizen> treeSetOfCitizens(Citizen... citizens) {
//        NavigableSetSet<Citizen> citizenSet = new TreeSet<>();
//        citizenSet.addAll(Arrays.asList(citizens));
//
//        return citizenSet;
//    }

    /**
     * 4. Stwórz metodę która zwróci wszystkie nazwiska z podanego zbioru które zaczyna się od litery: letterFrom(włącznie), a kończą na literze: letterTo(włącznie).
     * Dla chętnych - dodaj testy sprawdzające tą metodę.
     */
//    static Set<String> getNames(NavigableSet<String> citizens, char letterFrom, char letterTo) {
        return null;
    }
}