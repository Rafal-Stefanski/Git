package pro2.weekend1.sms;

import java.util.Scanner;

public class SMS_shortner_v2 {
    public static void main(String[] args) {
        System.out.println("== Welcome to SMS shorter. Enter Your text below: ==");
        Scanner scanner = new Scanner(System.in);
        String textOfSms = scanner.nextLine();
        String[] wordsFromGivenText = textOfSms.split(" ");

        StringBuilder stringBuilderForNewWords = new StringBuilder();
        for (String word : wordsFromGivenText) {
            if (word.isEmpty()) {
                continue;
            }

            String firstLetter = word.substring(0, 1).toUpperCase();
            String restOfLetters = word.substring(1);

            stringBuilderForNewWords.append(firstLetter);
            stringBuilderForNewWords.append(restOfLetters);
        }
        String shortnedSMS = stringBuilderForNewWords.toString();
        System.out.println(shortnedSMS);
    }
}
