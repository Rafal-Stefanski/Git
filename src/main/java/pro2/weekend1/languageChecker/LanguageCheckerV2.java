package pro2.weekend1.languageChecker;

import com.detectlanguage.DetectLanguage;
import com.detectlanguage.errors.APIError;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LanguageCheckerV2 {
    public static void main(String[] args) throws FileNotFoundException, APIError {
        DetectLanguage.apiKey = "6e4f850361c3d2eab677d3a794206ee8";

        File folderWithFiles = new File("src\\main\\resources\\languageDetect");
        File[] files = folderWithFiles.listFiles();

        for (File file : files) {
            String language = recognizeLanguage(file);
            System.out.println("Plik: " + file.getName() + " is in language: " + language);
        }
    }

    private static String recognizeLanguage(File file) throws FileNotFoundException, APIError {
        Scanner scanner = new Scanner(file);
        StringBuilder stringBuilder = new StringBuilder();
        while (scanner.hasNextLine()) {
            String line =  scanner.nextLine();
            stringBuilder.append(line);
            stringBuilder.append(" ");
        }
        return DetectLanguage.simpleDetect(stringBuilder.toString());
    }
}
