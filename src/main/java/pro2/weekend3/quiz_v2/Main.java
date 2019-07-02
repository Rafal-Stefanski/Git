package pro2.weekend3.quiz_v2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/quiz/Animals.txt");

        List<ZadanieQuizowe> zwierzaki = wczytajZPliku(file);

        

    }

    private static List<ZadanieQuizowe> wczytajZPliku(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        List<ZadanieQuizowe> zadania = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String pytanie = scanner.nextLine();
            String ileOdpowiedzi = scanner.nextLine();
            int liczbaOdpowiedzi = Integer.parseInt(ileOdpowiedzi);

            List<String> listaOdpowiedzi = new ArrayList<>();
            for (int i = 0; i < liczbaOdpowiedzi; i++) {
                String odp = scanner.nextLine();
                listaOdpowiedzi.add(odp);
            }

//            ZadanieQuizowe zad = new ZadanieQuizowe(pytanie, listaOdpowiedzi);
//            zadania.add(zad);
        }
        return zadania;
    }
}
