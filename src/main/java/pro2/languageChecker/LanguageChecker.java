package pro2.languageChecker;
import com.detectlanguage.DetectLanguage;
import com.detectlanguage.errors.APIError;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class LanguageChecker {
    public static void main(String[] args) throws APIError, FileNotFoundException {
        DetectLanguage.apiKey = "613ba5137fcc846d7098e991d1b33c07";

        String language = DetectLanguage.simpleDetect("Hello world");
        System.out.println(language);

        Scanner file_chunichi = new Scanner(new FileReader
                ("src\\main\\resources\\languageDetect"));
        String line = file_chunichi.nextLine();

        while (file_chunichi.hasNextLine()) {
//            String line = file_chunichi.nextLine();
        }

        String tekst = String.valueOf(file_chunichi);
        String language1 = DetectLanguage.simpleDetect(line);
        System.out.println(language1);
    }

}
