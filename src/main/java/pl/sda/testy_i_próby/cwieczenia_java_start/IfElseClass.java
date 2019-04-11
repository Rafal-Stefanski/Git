package pl.sda.testy_i_próby.cwieczenia_java_start;

import java.util.Scanner;

public class IfElseClass {
    public static void main(String[] args) {
        System.out.println("sprawdź czy liczba jest parzysta i większa od zera");

        Scanner skaner = new Scanner(System.in);

        int number= skaner.nextInt();

        if (number > 0) {
            System.out.println("liczba " + number + " jest > 0");
            if (number % 2 == 0) {
                System.out.println("liczba parzysta");
            } else {
                System.out.println("liczba nieparzysta");
            }
        } else {
            System.out.println("jest < 0");
        }
    }
}
