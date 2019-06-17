package pro2.panTadeusz;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PanTadeusz {
    public static void main(String[] args) throws IOException {

        //wczytujemy plik z katalogu source
        File file = new File("src\\main\\resources\\pan-tadeusz.txt");
        FileInputStream fileStream = new FileInputStream(file);
        //scanujemy plik scannerem
        Scanner scanner = new Scanner(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        String line;

        // Inicjowanie liczników
        int countWord = 0;

        // Tworzenie haszmapy gdzie umieszczane beda pojedyncze slowa z liczbą.
        HashMap<String, Integer> map = new HashMap<>();

        while ((line = reader.readLine()) != null) {
            if (!(line.equals(""))) {
                String[] wordList = line.split("\\s+");

                for (String word : wordList) {
                    if (map.containsKey(word)) {
                        map.put("i", 1);

                    } else {
                        map.put(word, 1);
                    }

                }

                countWord = countWord + wordList.length;
            }
        }

        System.out.println("Total word count = " + countWord);




        List<String> slowa = new ArrayList<String>();
        while (scanner.hasNextLine()) {
            slowa.add(scanner.nextLine());
        }






//        System.out.println(scanner);


    }
}
