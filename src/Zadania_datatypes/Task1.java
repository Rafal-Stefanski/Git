package Zadania_datatypes;

// 1. Napisz program, który utworzy dwie zmienne, a następnie wypisze na ekran ich sumę, różnicę i iloczyn.

/*
public class Task1 {
    public static void main(String[] args) {
        int x;
        int y;

        x = 7;
        y = 13;

        System.out.println("Sum = " + x + y);
    }
}
*/

// wersja od Tomasz Sidor
public class Task1 {
    public static void main(String[] args) {
        int a = 5 , b =2;
        int suma = a+b;
        int roznica = a-b;
        int iloczyn = a*b;
        System.out.println("a + b = " + suma);
        System.out.println("a - b = " + roznica);
        System.out.println("a * b = " + iloczyn);
    }

}
