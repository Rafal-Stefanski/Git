package codewars.kata7;

/** Complete the solution so that the function will break up camel casing, using a space between words. */

public class BreakCamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase("camelCasing"));
    }

    public static String camelCase(String input) {

        String solution = input.replaceAll(
                        String.format("%s|%s|%s",
                                "(?<=[A-Z])(?=[A-Z][a-z])",
                                "(?<=[^A-Z])(?=[A-Z])",
                                "(?<=[A-Za-z])(?=[^A-Za-z])")," ");

        return solution;
    }
}
