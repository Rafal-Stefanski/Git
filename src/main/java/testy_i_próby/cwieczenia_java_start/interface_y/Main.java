package testy_i_próby.cwieczenia_java_start.interface_y;

import java.util.Comparator;

/**
 * Interfejsy w Javie. Słowo kluczowe interface oraz implements.
 * https://www.youtube.com/watch?v=zetJnForb4Q
 */

public class Main {
    public static void main(String[] args) {

        Logger logger = new ConsoleLogger();

        logger.log("testuję loggera.");

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };
    }
}
