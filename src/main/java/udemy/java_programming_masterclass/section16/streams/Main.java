package udemy.java_programming_masterclass.section16.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
            if (number.toUpperCase().startsWith("G")) {
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

        /** Intermediate and Terminal Operations */
        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O71");
        Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I17", "I29", "O71");
        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);

//        System.out.println("*** concatStream.count ***");
//        System.out.println(concatStream.count());

        System.out.println("*** concatStream.distinct.count ***");
        System.out.println(concatStream.distinct().count());

        System.out.println("-----------------------");
//        System.out.println(concatStream
//                .distinct()
//                .peek(System.out::println)
//                .count());

        /** Flatmap & Lambdas */
        Employee john = new Employee("John Doe", 30);
        Employee jane = new Employee("Jane Deer", 25);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        Department hr = new Department("Human Resources");
        hr.addEmployee(jane);
        hr.addEmployee(jack);
        hr.addEmployee(snow);
        Department accounting = new Department("Accounting");
        accounting.addEmployee(john);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);

        // 07-01-2021 needed fix.. getting @hexadecimal values instead of names of employees :(
        // 08-01-2021 FOUND IT!! - problem appeared in Employee class. Missing @override toString method, now names are printed out it original String form :D

        System.out.println("-----------------------");
//        List<String> sortedGNumbers = someBingoNumbers
//                .stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.startsWith("G"))
//                .sorted()
//                .collect(Collectors.toList());

        List<String> sortedGNumbers = someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        for (String s : sortedGNumbers) {
            System.out.println(s);
        }

        System.out.println("-----------------------");
        /** collecting using grouping by method */
        System.out.println("The youngest employee:");
        Map<Integer, List<Employee>> groupByAge = departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(employee -> employee.getAge()));

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1, e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
                .ifPresent(System.out::println);

        System.out.println("-----------------------");
        Stream.of("ABC", "AC", "BAA", "CCCC", "XY", "ST")
                .filter(s -> {
                    System.out.println(s);
                    return s.length() == 3;
                })
                .count();

    }
}
