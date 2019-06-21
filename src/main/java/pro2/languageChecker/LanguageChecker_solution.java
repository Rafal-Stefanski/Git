package pro2.languageChecker;
import com.detectlanguage.DetectLanguage;
import com.detectlanguage.errors.APIError;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LanguageChecker_solution {
    public static void main(String[] args) throws APIError, FileNotFoundException {
        DetectLanguage.apiKey = "6e4f850361c3d2eab677d3a794206ee8";

        File folder = new File("src\\main\\resources\\languageDetect");
        File[] files = folder.listFiles();

        for (File file : files) {
            String language = rozpoznajJezyk(file);
            System.out.println("Plik " + file.getName() + " jest w języku " + language);
        }
    }

    private static String rozpoznajJezyk(File file) throws FileNotFoundException, APIError {
        Scanner scanner = new Scanner(file);

        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            sb.append(line);
            sb.append(" ");
        }

        //System.out.println(sb.toString());
        return DetectLanguage.simpleDetect(sb.toString());
    }
}
