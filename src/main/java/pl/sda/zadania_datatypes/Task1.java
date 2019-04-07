package pl.sda.zadania_datatypes;

// 1. Napisz program, który utworzy dwie zmienne, a następnie wypisze na ekran ich sumę, różnicę i iloczyn.

public class Task1 {
    public static void main(String[] args) {
        int x;
        int y;

        x = 7;
        y = 13;

        int Sum = x + y;
        int Quotient = y - x;
        int Product = x * y;

        System.out.println("Suma x + y = " + Sum);
        System.out.println("Iloraz y - x = " + Quotient);
        System.out.println("Iloczyn x * y = " + Product);
    }
}