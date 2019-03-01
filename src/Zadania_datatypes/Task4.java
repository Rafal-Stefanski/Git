package Zadania_datatypes;

// 4. Napisz program, który utworzy jedną zmienną, a następnie wypisze na ekran tekst: true jeżeli wartość tej zmiennej
//jest podzielna przez 3 i jednocześnie przez lub false w przeciwnym przypadku.

public class Task4 {
    public static void main(String[] args) {

        int f = 75;
        boolean g = f %3 == 0;
        boolean h = f %5 == 0;
        boolean i = g == h;

        System.out.println("Czy liczba : " + f + " - jest podzielna przez 3 i 2 ?" );
        System.out.println(" Odpowiedź : " + i );

    }
}
