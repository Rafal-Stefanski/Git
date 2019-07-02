package pro2.weekend1.sms.solution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj treść SMSa: ");
        Scanner scanner = new Scanner(System.in);
        String trescSMS = scanner.nextLine();

        String[] slowa = trescSMS.split(" ");

        //String wynik = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (String slowo : slowa) {
            if (slowo.isEmpty()) {
                continue;
            }
            String pierwszaLitera = slowo.substring(0, 1).toUpperCase();
            String resztaLiter = slowo.substring(1);
            //wynik += pierwszaLitera + resztaLiter;
            stringBuilder.append(pierwszaLitera);
            stringBuilder.append(resztaLiter);
        }
        String skroconySMS = stringBuilder.toString();
        System.out.println(skroconySMS);
    }
}
