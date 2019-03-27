package pl.sda.zadania_strings;

/**
 * 1. Napisz klasę, która wykorzysta większość z metod dostępnych w klasie String.
 */

public class Task1 {
    public static void main(String[] args) {
        //#1
        String text = " This is an example sentence. ";
        System.out.println(text);
        System.out.println();
        System.out.println(text.trim());
        System.out.println(text.length());
        System.out.println(text.charAt(3));
        System.out.println(text.indexOf("x"));
        System.out.println(text.substring(4));
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.concat(" And this is concat."));

        //#2
        String simonSays = simonSays("I love Java! but maybe not today.");
        System.out.println(simonSays);
        simonSays = simonSays2("I hate Java! but maybe just today.");

        //#3
        String after = cleanUp(" Ala ma kota. ");
        System.out.println("After cleanUp: " + after);
        System.out.println();

        //#5
        System.out.println("checkFirstChar1: " + checkFirstChar("", ""));
        System.out.println("checkFirstChar2: " + checkFirstChar("ABCD", "AEFG"));
        System.out.println("checkFirstChar3: " + checkFirstChar("ABCD", ""));
        System.out.println("checkFirstChar4: " + checkFirstChar("", "AEFG"));
        System.out.println("checkFirstChar5: " + checkFirstChar("piłka", "nożna"));
        System.out.println();

        //#6
        System.out.println("checkFirstChar1: " + checkFirstChar("", ""));
        System.out.println("checkFirstChar2: " + checkFirstChar("abc", "abb"));
        System.out.println("checkFirstChar3: " + checkFirstChar("abc", "abc"));
        System.out.println("checkFirstChar4: " + checkFirstChar("123456", "456"));
        System.out.println("checkFirstChar5: " + checkFirstChar("", "123"));
        System.out.println();

        //#8
        System.out.println("checkNo1: " + checkNo("nietonie"));
        System.out.println("checkNo2: " + checkNo("nietonienietonie"));
        System.out.println("checkNo2: " + checkNo("tak to tak"));
        System.out.println("checkNo2: " + checkNo(""));
        System.out.println("checkNo2: " + checkNo("zaraz nie przerwa dwa nie nie i koniec"));

    }

    /**
     * 2. Napisz metodę, która zwróci tekst: “Simon says: [{text}]”, gdzie {text} - to argument metody.
     * Użyj konkatenacji lub StringBuildera.
     */

    private static String simonSays(String message) {
        return "Simon says: " + message;
    }
    private static String simonSays2(String message) {
        StringBuilder stringBuilder = new StringBuilder("Simon says: ");
        stringBuilder.append(message);
        return stringBuilder.toString();
    }

    /**
     * 3. Napisz metodę, która jako argument otrzyma jedną zmienną typu String,
     * usunie z niej białe znaki z początku i końca tekstu oraz zamieni wszystkie litery na małe.
     */
    private static String cleanUp(String text) {
        return text.trim()
                   .toLowerCase();
    }

    /**
     * 5. Napisz metodę, która jako argumenty będzie przyjmować dwie zmienne typu String i
     * zwróci true jeżeli oba teksty zaczynają się od tego samego znaku.
     */

    private static boolean checkFirstChar(String text1, String text2) {
        if (text1.length() == 0 && text2.length() == 0) {
            return true;
        }
        if (text1.length() == 0) {
            return false;
        }
        if (text2.length() == 0) {
            return false;
        }

        char char1 = text1.charAt(0);
        char char2 = text2.charAt(0);
        return char1 == char2;
    }

    /**
     * 6. Napisz metodę, która jako argumenty będzie przyjmować dwie zmienne typu String
     * i zwróci true jeżeli 3 ostatnie znaki w obu tekstach są takie same.
     */

    private static boolean checkLastChars(String text1, String text2) {
        if (text1.length() < 3 || text2.length() < 3) {
            return false;
        }

        String substring1 = text1.substring(text1.length() - 3);
        String substring2 = text2.substring(text2.length() - 3);

        return substring1.equals(substring2);
    }

    /**
     * 8. Napisz metodę sprawdzającą, czy dany łańcuch zawiera co najmniej trzy razy słowo “nie”.
     */

    private static boolean checkNo(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }

        String searchPhrase = "nie";
        int minCount = 3;

        int index = 0;
        int count = 0;
        do {
            index = text.indexOf(searchPhrase, index);
            if (index != -1) {
                count++;
                index += searchPhrase.length();
            }
        } while (index != -1);

        return count >= minCount;
    }
}
