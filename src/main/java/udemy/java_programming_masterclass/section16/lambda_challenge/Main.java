package udemy.java_programming_masterclass.section16.lambda_challenge;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static javafx.scene.input.KeyCode.T;

public class Main {
    public static void main(String[] args) {

        /** #1 Challenge anonymous class to lambda expression */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String myString = "Let's split this up into an array";
                String[] parts = myString.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };

        Runnable runnableLambda = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        /** #2 Challenge method as lambda expression */
        Function<String, String> lambdaFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }

            return returnVal.toString();
        };

        /** #3 Write the code from #2 to execute the function with an argument */
        System.out.println(lambdaFunction.apply("1234567890"));

        /** #4 Write a method called everySecondCharacter that accepts the function as a parameter and executes it with the argument "12345678990 */

        /** #5 Using bonus version, call the method with lambdaFunction created earlier, and String "12345678990 */
        System.out.println(everySecondCharacter(lambdaFunction, "1234567890"));

        /** #6 Write Lambda expression that maps to the java.util.Supplier interface. This lambda should return the string "I love Java!". Assign it ot variable called iLoveJava. */
//        Supplier<String> iLoveJava = () -> "I love Java!";
//        With return statement:
        Supplier<String> iLoveJava = () -> {
            return "I love Java!";
        };

        /** #7 Use Supplier to assign the string "I love Java!" to a variable called supplierResult, than print variable to the console */
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

        /** #9 Write code to print items in sorted order and with first letter in each name upper cased. */
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );
        System.out.println("*** Challenge #9 ***");
        topNames2015
                .stream()                           // also answer for challenge 11 with using .stream
                .map(s -> s.toUpperCase().charAt(0) + s.substring(1))
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);      // answer to Challenge #10

//        System.out.println("*** Challenge #9 ***");
        //Tim's answer
        System.out.println("<Tim's Answer>");
        List<String> firstUpperCaseName= new ArrayList<>();
        topNames2015.forEach(s->firstUpperCaseName.add(s.substring(0,1).toUpperCase()+s.substring(1)));
//        firstUpperCaseName.sort((s1,s2)->s1.compareTo(s2));
//        firstUpperCaseName.forEach(s-> System.out.println(s));
        // change of above lines to use ::
        firstUpperCaseName.sort(String::compareTo);
        firstUpperCaseName.forEach(System.out::println);

        /** #11 Write code to print items in sorted order and with first letter in each name upper cased.
         * Using .stream */
        System.out.println("*** Challenge #11 ***");
        topNames2015
                .stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .sorted(String::compareTo)
                .forEach(System.out::println);

        /** #12 Write code to print items in sorted order and with first letter in each name upper cased. */
        System.out.println("*** Challenge #12 ***");
        long namesBeginningWithA = topNames2015
                .stream()
//                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .filter(name -> name.startsWith("A"))
                .count();

        System.out.println("Number of Names beginning with A is: " + namesBeginningWithA);

         /** #13 What will be following code print to the console. */
        System.out.println("*** Challenge #13 ***");
        topNames2015
                .stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo);

        // The Answer: Nothing, until there is terminal operation added to the chain. Because stream chains are evaluated lazily

        /** #14 Add terminal operation. */
        System.out.println("*** Challenge #14 ***");
        topNames2015
                .stream()
                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo) // Won't work as it's after the peek operation, that's why it's greyed out by intellij.
//                .count(); // this added terminal operation.
                .collect(Collectors.toList()); // other terminal operation.
    }

    /** for #5 interface */


    /**
     * for #4 Challenge
     */
    public static String everySecondCharacter(Function<String, String> func, String source) {
        return func.apply(source);
    }

    /**
     * for #2 Challenge
     */
    public static String everySecondChar(String source) {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }

        return returnVal.toString();
    }


}
