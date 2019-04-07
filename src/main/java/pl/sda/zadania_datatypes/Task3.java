package pl.sda.zadania_datatypes;

// 3. Napisz program, który utworzy jedną zmienną, a następnie wypisze na ekran tekst: true jeżeli wartość tej zmiennej
//jest liczbą parzystą lub false w przeciwnym przypadku.

public class Task3 {
    public static void main(String[] args) {
    int d = 8;
    boolean e = d%2 == 0;

    System.out.println("Czy liczba : " + d + " jest parzysta?");
    System.out.println(" Odpowiedź : " + e);

    }
}
