package pro2.zadanie_sms;


import java.util.Arrays;
import java.util.Scanner;

public class Sms_optymalizer {
    public static void main(String[] args) {
        System.out.println("Podaj treść SMSa: ");
        Scanner scanner = new Scanner(System.in);
        String trescSMS = scanner.nextLine();
        System.out.println(trescSMS);

        String[] slowa = trescSMS.split(" ");

        System.out.println("Słowa to: " + Arrays.toString(slowa));

//        String wynik = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (String slowo : slowa) {
            if (slowo.isEmpty()) {
                continue;
            }
//            System.out.println("Slowo to: " + slowo);
            String pierwszaLitera = slowo.substring(0, 1).toUpperCase();
            String reszaLiter = slowo.substring(1);
            System.out.println("Słowo to: " + pierwszaLitera + reszaLiter);
//            wynik += pierwszaLitera + reszaLiter;
            stringBuilder.append(pierwszaLitera);
            stringBuilder.append(reszaLiter);
        }
        String skroconySMS = stringBuilder.toString();
        System.out.println(skroconySMS);


        // moje rozwiązanie
        System.out.println(" ================================ ");
        System.out.println("moje rozwiazanie: ");
        String text = "Dzisiaj jest sobota, imieniny kota.";
        System.out.println(text);
        System.out.println("Text length: " + text.length());

        String[] smsParts = text.split(" ");

        //petla do podzielenia wyswietlenia stringa po splicie
        for (int i = 0; i < smsParts.length; i++) {
            String smsPart = smsParts[i];
            System.out.print(smsPart);
        }

        System.out.println("");

        // petla do wyświetlenia stringa po splicie i zamianie pierwszego znaku na duży
        for (int i = 0; i < smsParts.length; i++) {
            String pierwszyZnak = smsParts[i].substring(0, 1).toUpperCase(); //wycieganiecie pierwszego znaku i zamiana na dużą literę
            String smsPart = smsParts[i].substring(1); //wyciagnięcie reszty słowa za pierwsza literą
            System.out.print(pierwszyZnak + smsPart); //sklejamy wyraz w całość, duża litera i reszta słowa
        }

        System.out.println("");
        System.out.println("Number of words: " + smsParts.length);

    }
}
