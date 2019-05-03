package pl.sda.zadania_loops;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Task #5 \n");
        System.out.println("ilosc wystapien frazy: " + checkNoOfPhrases("taki sobie jako taki tik tak", "tak") + "\n");
        System.out.println("ilosc wystapien frazy: " + checkNoOfPhrases("taki sobie jako taki tik tak", "ak") + "\n");
        System.out.println("ilosc wystapien frazy: " + checkNoOfPhrases("taki sobie", "tak") + "\n");
        System.out.println("ilosc wystapien frazy: " + checkNoOfPhrases("taki tik tak", "tak") + "\n");
    }

    /**
     * 5. Napisz metodę sprawdzającą ilość wystąpień frazy: phrase w tekście: text.
     * Parametry metody to: phrase i text.
     * Podpowiedź: użyj metody klasy String która sprawdza index dla podanej frazy
     */

    public static int checkNoOfPhrases(String text, String searchPhrase) {
        System.out.println("tekst: " + text + "\nfraza: " + searchPhrase);
        if (text == null || text.isEmpty()) {
            return 0;
        }
        int index = 0;
        int count = 0;
        do {
            index = text.indexOf(searchPhrase, index);
            if (index != -1) {
                count ++;
                index = index + searchPhrase.length();
            }
        } while (index != -1);
        return count;
    }
}
