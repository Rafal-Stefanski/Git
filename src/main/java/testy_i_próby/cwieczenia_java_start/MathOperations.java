package testy_i_próby.cwieczenia_java_start;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Potęgowanie, podaj liczbę, oraz wartość potęgi: \nv");
        double number = scanner.nextDouble();
        double power = scanner.nextInt();
        double result = Math.pow(number, power);

        System.out.println(number + " ^ " + power + " = " + result);

        System.out.println("\nPierwiastkowanie, podaj liczbę całkowitą: \nv");
        int number2 = scanner.nextInt();
        double sqrt = Math.sqrt(number2);
        System.out.println(sqrt);



    }
}
