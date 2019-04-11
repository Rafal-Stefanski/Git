package pl.sda.testy_i_próby.cwieczenia_java_start;

import java.util.Scanner;

public class WybierzBramke {
    public static void main(String[] args) {
        System.out.println("Wybierz bramkę 1, 2 lub 3");

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

//        if (number == 1) {
//            System.out.println("ZONK!");
//        } else if (number == 2) {
//            System.out.println("nagroda!");
//        } else if (number == 3) {
//            System.out.println("Nagroda główna");
//        } else {
//            System.out.println("zły numer");
//        }

        switch (number) {
            case 1:
            System.out.println("Zonk");
            break;
            case 2:
            System.out.println("mała nagroda");
            break;
            case 3:
            System.out.println("Duża nagroda");
            break;
            default:
                System.out.println("zły numer bramki");
        }
    }
}
