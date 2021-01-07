package udemy.java_programming_masterclass.section16.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "O71");

        List<String> gNumbers = new ArrayList<>();

        /** sorting data from someBingoNumbers using forEach loop with functional interface */
        someBingoNumbers.forEach(number -> {
            if(number.toUpperCase().startsWith("G")) {
                gNumbers.add(number);
//                System.out.println(number); // printing outside loop
            }
        });

        /** printing with sorting. */
        gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
        gNumbers.forEach((String s) -> System.out.println(s));

        /** same as above but with single statement .stream() (g64 is printed out with capital 'G') */
        someBingoNumbers
                .stream()
                .map(String::toUpperCase)   // possible to use: '.map(s->s.toUpperCase())'
                .filter(s -> s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);
    }
}
