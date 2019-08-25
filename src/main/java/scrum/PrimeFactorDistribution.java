package scrum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimeFactorDistribution {
    public static void main(String[] args) {
//        givenNumber(13);

        boolean isPrime = true;
        Scanner S = new Scanner(System.in); //Pobieramy liczbę którą chcemy sprawdzić
        int number = S.nextInt();           //Zamiana na liczbę całkowitą
        String dividing = "Liczbę " + number + " możemy zapisać jako iloczyn liczb:"; //Przygotowanie odpowiedzi do której dodamy podzielniki
        List<Integer> dividers = new ArrayList<>(); //Deklarujemy listę która będzie zawierała x liczb pierwszych
        for (int i = 2; i < number; i++) {       // Wyszukanie liczb pierwszych w zakresie od 2 do n
            isPrime = true;
            for (int a = 2; a < i; a++) {
                if ((i % a) == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                dividers.add(i);
            }
        }//KONIEC WYSZUKIWANIA  LICZB PIERWSZYCH

        Collections.sort(dividers, Collections.reverseOrder());
        //Posortowanie dzielników od największego do najmniejszego
        while (number != 1) {//Dzielenie przez liczby pierwsze
            for (int b = 0; b < dividers.size(); b++) {
                if ((number % dividers.get(b)) == 0) {
                    number = number / dividers.get(b);
                    dividing += " " + dividers.get(b) + ",";
                }
            }
        }
        System.out.println(dividing);
    }


//    private static boolean isPrime(final int input) {
//        if (input < 2) return false;
//        for (int i = 2; i <= Math.sqrt(input); i++) {
//            if (input % i == 0) return false;
//        }
//        return true;
//    }
//
//    private static void givenNumber(int input) {
//        for (int i = 0; i <= input; i++) {
//            if (isPrime(i)) {
//                System.out.println(i);
//            } else {
//
//            }
//        }
//    }
}
