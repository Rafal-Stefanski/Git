package udemy.java_programming_masterclass.section17.and_or_not;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiiiiijkl99z";
        System.out.println(alphanumeric);
        System.out.println(alphanumeric.replaceAll(".", "Y"));

        System.out.println(alphanumeric.replaceAll("abcDeee", "YYY"));

        String secondString = "abcDeeeF12GhhabcDeeiiiijkl99z";
        System.out.println(secondString.replaceAll("^abcDee", "YYY"));

        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee"));
        System.out.println(alphanumeric.matches("^abcDeeeF12Ghhiiiiiijkl99z"));

        System.out.println(alphanumeric.replaceAll("jkl99z$", " THE END"));
        System.out.println(alphanumeric.replaceAll("[aei]", "X"));
        System.out.println(alphanumeric.replaceAll("[aei]", "I replace a letter here."));
        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));

        String newAphanumeric = "abcDeeeF12Ghhiiiiiijkl99z";
        System.out.println(newAphanumeric.replaceAll("[^ej]", "X"));
        System.out.println(newAphanumeric.replaceAll("[abcdef34678]", "X"));
        System.out.println(newAphanumeric.replaceAll("[a-fA-F3-8]", "X"));
        System.out.println(newAphanumeric.replaceAll("(?i)[a-f3-8]", "X"));     // (?i) for unicode - no lower upper case sensitivity, for asci (?iu)
        System.out.println(newAphanumeric.replaceAll("[0-9]", "X"));    // replacing all digits with X
        System.out.println(newAphanumeric.replaceAll("[\\d]", "X"));    // replacing all digits with X
        System.out.println(newAphanumeric.replaceAll("[\\D]", "X"));    // replacing all non digits with X

        System.out.println("=============================================");
        String hasWhitespace = "I have blanks and\ta tab, and also a newline\n";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s", ""));    // removes all spaces, tabs and new line.
        System.out.println(hasWhitespace.replaceAll("\t", "X"));    // replace Tab with an X
        System.out.println(hasWhitespace.replaceAll("\\S", ""));    // removes all non spaces, tabs and new line, letters removed remains only spaces and tabs.
        System.out.println(newAphanumeric.replaceAll("\\w", "X"));  // replaces all characters except for whitespaces with an X
        System.out.println(hasWhitespace.replaceAll("\\w", "X"));   // replaces all characters except for whitespaces with an X
        System.out.println(hasWhitespace.replaceAll("\\b", "X"));   // surrounds each word with X in the beginning and in the end of each world


        // Quantifiers and the Pattern and Matcher classes

        String thirdAlphanumericString = "abcDeeeF12Ghhiiiiiijkl99z";
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{3}", "YYY"));     // replaces abcDeee with YYY - {3} indicate number of "e"
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe+", "YYY"));       // same as above with + which takes all last letters that repeats, here its "e"
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe*", "YYY"));       // replace beginning of String with pattern regardless of presence of "e"
        System.out.println(thirdAlphanumericString.replaceAll("abcDe{2,5}", "YYY"));    // replaces the String patern if there is at least 2 and not more than 5 "e"
        System.out.println(thirdAlphanumericString.replaceAll("h+i*j", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something.</p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());


        // Quantifiers and the Pattern and Matcher classes

        matcher.reset();
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());

        }

        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while (groupMatcher.find()) {
            System.out.println("Occurrence: " + groupMatcher.group(1));
        }

        String h2TextGroup = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroup);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()) {
            System.out.println("Occurrence: " + h2TextMatcher.group(2));
        }

        // "abc" "a" and "b" and "t" - one of occurrences
        // [H]arry
        System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
        System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));

        // [^abc] Not abc
        String tvTest = "tstvtk";
//        String tNotVRegExp = "t[^v]";
        String tNotVRegExp = "t(?!v)";
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        count = 0;
        while (tNotVMatcher.find()) {
            count++;
            System.out.println("Occurrence " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }

        // t(?=v)
        // validating the US phone number:
        String phone1 = "1234567890";    // Shouldn't match
        String phone2 = "(123) 456-7890";    // match
        String phone3 = "123 456-7890";    // Shouldn't match
        String phone4 = "(123)456-7890";    // Shouldn't match
        // Checking:
        System.out.println("phone1 = " + phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ][0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone2 = " + phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ][0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone3 = " + phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ][0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone4 = " + phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ][0-9]{3}[\\-]{1}[0-9]{4})$"));
    }
}
