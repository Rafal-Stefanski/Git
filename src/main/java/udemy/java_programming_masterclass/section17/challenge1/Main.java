package udemy.java_programming_masterclass.section17.challenge1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String challenge1 = "I want a bike.";
        String challenge2 = "I want a ball.";

        // use String.matches();

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

        String regExp3 = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regExp3);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());
        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());

        // Challenge #4
        // Replace all occurrences of blanks with an underscore for the following string. Print the resulting String.

        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll("\\s", "_"));
        // or other way with " " space.
        System.out.println(challenge4.replaceAll(" ", "_"));

        // Challenge #5
        // Write regular expression that will match the following string in its entirety. Use String.matches() method to verify answer.

        String challenge5 = "aaabccccccccdddefffg";



    }

}
