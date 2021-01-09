package udemy.java_programming_masterclass.section16.lambda_challenge;

import java.util.function.Function;
import java.util.function.Supplier;

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
