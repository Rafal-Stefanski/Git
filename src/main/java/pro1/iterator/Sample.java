package pro1.iterator;

import com.google.common.collect.Lists;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Sample {
    public static void main(String[] args) {
        //#1
        basicsSamples();

        //#2
        //carsContainer();
    }

    private static void basicsSamples() {
        List<String> names = Lists.newArrayList("Ania", "Adam", "Henryk", "Józek", "Stasiek", "Zuza");
        //użycie zwykłego iteratora
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();

            //names.remove("Adam"); //taki kod wyrzuci wyjątek ConcurrentModificationException!

            //usuwać można tak
            if(name.equals("Adam")) {
                iterator.remove();
            }
        }

        //iterowanie się po liście ale bez użycia iteratora wprost
        for (String name : names) {
            System.out.println(name);
        }

        //użycie ListIteratora
        ListIterator<String> listIterator = names.listIterator();
        while (listIterator.hasNext()) {
            String next = listIterator.next();

            if(next.equals("Henryk")) {
                //zmień aktualnie przeglądany element
                listIterator.set("Henryczek");
            }

            if(next.equals("Stasiek")) {
                //dodaj do kolekcji nowy element zaraz po aktualnie przeglądanym elemencie
                listIterator.add("Włodek");
            }

            if(next.equals("Zuza")) {
                //sprawdź index poprzedniego i następnego elementu
                int previousIndex = listIterator.previousIndex();
                int nextIndex = listIterator.nextIndex();
                System.out.println("previousIndex = " + previousIndex);
                System.out.println("nextIndex = " + nextIndex);
            }
        }

        System.out.println("names = " + names);
    }

    private static void carsContainer() {
        CarsContainer carsContainer = new CarsContainer();
        carsContainer.add(new Car("Mazda", "black"));
        carsContainer.add(new Car("Ford", "red"));
        carsContainer.add(new Car("Toyota", "red"));
        carsContainer.add(new Car("BMW", "blue"));
        carsContainer.add(new Car("Audi", "grey"));
        carsContainer.add(new Car("Fiat", "red"));

        System.out.println("carsContainer: ");
        for (Car car : carsContainer) {
            System.out.println(car);
        }

        System.out.println("\ncarsContainer (only red): ");
        for (Car car : carsContainer.oneColorIterable("red")) {
            System.out.println("car = " + car);
        }
    }
}