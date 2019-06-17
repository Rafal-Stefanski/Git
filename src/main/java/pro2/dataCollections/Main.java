package pro2.dataCollections;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        DataCollections.getSurnames().stream();

//        .filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.length() <= 4;
//            }
//        }
//
//        )

        //4) 10 najdłuższych nazwisk, posortowanych malejąco według długości

        List<String> list4 = DataCollections.getSurnames().stream()
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.length() - o2.length();
                    }
                }).limit(10)
                .collect(Collectors.toList());
        System.out.println(list4);

        //6) Odwróć kolejność liter we wszystkich nazwiskach i pozstaw jedynie te,
        // które mają literę 'A' wsród pierwszych trzech liter (odwróconego nazwiska)

        List<String> list6 = DataCollections.getSurnames().stream()
                .map(nazwisko -> {
                    StringBuilder sb = new StringBuilder(nazwisko);
                    sb.reverse();
                    return sb.toString();
                })
                .collect(Collectors.toList());
        System.out.println(list6);


        //1) Ile jest liczb parzystych?


        //2) Ile jest liczb pięciocyfrowych?

        long ilePieciocyfrowych = DataCollections.getNumbers(100_000).stream()
                .filter(liczba -> liczba >= 10_000 && liczba < 100_000)
                .count();
        System.out.println(ilePieciocyfrowych);


    }

    private static void filter(Predicate<String> stringPredicate) {

    }
}
