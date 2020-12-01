package udemy.java_programming_masterclass.section17.challenge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String challenge1 = "I want a bike.";
        String challenge2 = "I want a ball.";

        // use String.matches();
        System.out.println("\n=== Challenge #1 and #2 ===");

        System.out.println("Challenge 1 String is " + challenge1.matches("I want a bike."));
        System.out.println("Challenge 2 String is " + challenge1.matches("I want a (bike|ball).") + ", and String 2 is " + challenge2.matches("I want a (bike|ball)."));

        // Other solution
        String regEXp = "I want a \\w+."; // replaces all characters a-z and 0-9 except for whitespaces
        System.out.println(challenge1.matches(regEXp));
        System.out.println(challenge2.matches(regEXp));

        // Challenge #3
        // same as above but with Matcher.matches() instead of String.matches(), compile a Pattern.

//        StringBuilder bothStrings = new StringBuilder(challenge1);
//        bothStrings.append(challenge2);

        System.out.println("\n=== Challenge #3 ===");

        String regExp3 = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regExp3);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());
        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());

        // Challenge #4
        // Replace all occurrences of blanks with an underscore for the following string. Print the resulting String.
        System.out.println("\n=== Challenge #4 ===");

        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll("\\s", "_"));
        // or other way with " " space.
        System.out.println(challenge4.replaceAll(" ", "_"));

        // Challenge #5
        System.out.println("\n=== Challenge #5 ===");

        // Write regular expression that will match the following string in its entirety. Use String.matches() method to verify answer.

        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[abcdefg]+"));
        System.out.println(challenge5.matches("[a-g]+"));
        String regExp6 = "a{3}bc{8}d{3}ef{3}g";

        System.out.println("\n=== Challenge #6 ===");

        System.out.println(challenge5.matches(regExp6));
        System.out.println(challenge5.replaceAll(regExp6, "REPLACED"));
        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));

        // Challenge #7
        System.out.println("\n=== Challenge #7 ===");
        String challenge7 = "abcd.135";
        String regExp7 = "^[A-z]+.[0-9]+$";
        System.out.println(challenge7.matches(regExp7));
        System.out.println(challenge7.matches("^[A-z][a-z]+\\.\\d+$"));

        // Challenge #8
        System.out.println("\n=== Challenge #8 ===");
        String challenge8 = "abcd.135uvqz.7tzik.999";
//        String regExp8 = "[0-9]+";           // It works when there is no group number group()
        String regExp8 = "[A-Za-z]+\\.(\\d+)"; // It works when there is given group number group(1)

        Pattern pattern8 = Pattern.compile(regExp8);
        Matcher matcher8 = pattern8.matcher(challenge8);

        while (matcher8.find()) {
            System.out.println("Occurrence: " + matcher8.group(1));
        }

        // Challenge #9
        System.out.println("\n=== Challenge #9 ===");
        String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";

        String regExp9 = "[A-Za-z]+\\.(\\d+)\\s";   // added \\s to remove all empty spaces and tabs

        Pattern pattern9 = Pattern.compile(regExp9);
        Matcher matcher9 = pattern9.matcher(challenge9);

        while (matcher9.find()) {
            System.out.println("Occurrence: " + matcher9.group(1));
        }

        // Challenge #10
        System.out.println("\n=== Challenge #10 ===");
        String challenge10 = "abcd.135\tuvqz.7\ttzik.999\n";
//        String regExp10 = "[A-Za-z]+\\.(\\d+\\s)";

        Pattern pattern10 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher10 = pattern10.matcher(challenge10);

        while (matcher10.find()) {
            System.out.println("Occurrence: start = " + matcher10.start(1) + " end = " + (matcher10.end(1) - 1));
        }

        // Challenge #11
        System.out.println("\n=== Challenge #11 ===");
        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";

//        System.out.println((challenge11.replaceAll("\\{","").replaceAll("}", "")));   // Print String but leaves the ",".

        Pattern pattern11 = Pattern.compile("(\\{)(.+?)(})");
//        Pattern pattern11 = Pattern.compile("\\{(.+?)}");   // Solution from course for 1 group.
        Matcher matcher11 = pattern11.matcher(challenge11);

        while (matcher11.find()) {
            System.out.println("Occurrence: " + matcher11.group(2));
        }
        System.out.println("\n=== Challenge #11a ===");
        String challenge11a = "{0, 2}, {0, 5}, {1, 3}, {2, 4}, {x, y}, {6, 34}, {11, 12}";


        Pattern pattern11a = Pattern.compile("\\{(\\d+, \\d+)}");   // Example that skip x, y as those are not digits.
        Matcher matcher11a = pattern11a.matcher(challenge11a);

        while (matcher11a.find()) {
            System.out.println("Occurrence: " + matcher11a.group(1));
        }

        // Challenge #12
        System.out.println("\n=== Challenge #12 ===");
        String challenge12 = "11111";
        System.out.println("Challenge12 US zip code match: " + challenge12.matches("^[0-9]{5}$"));  // In solution "^\\d{5}$".

        // Challenge #13
        System.out.println("\n=== Challenge #13 ===");
        String challenge13 = "11111-1111";
        System.out.println("Challenge13 US zip code match: " + challenge13.matches("^[0-9]{5}[\\-][0-9]{4}$"));  // In solution "^\\d{5}-\\d{4}$".

        // Challenge #14
        System.out.println("\n=== Challenge #14 ===");
//        String challenge14 = "11111-1111";
        System.out.println("Challenge12 US zip code match: " + challenge12.matches("^[0-9]{5}[\\-][0-9]{4}$|^[0-9]{5}$"));  // In solution "^\\d{5}(-\\d{4})?$".
        System.out.println("Challenge13 US zip code match: " + challenge13.matches("^[0-9]{5}[\\-][0-9]{4}$|^[0-9]{5}$"));  // In solution "^\\d{5}(-\\d{4})?$".

        
    }
}
