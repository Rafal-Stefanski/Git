package pl.sda.zadania_oop;

/**
 * 1. Utwórz klasę Triangle i napisz metodę isRectangular(), która jako argumenty przyjmować będzie trzy liczby
 * całkowite. Metoda powinna zwrócić true jeśli z odcinków o długości przekazanych w argumentach można
 * zbudować trójkąt prostokątny. Wzór który może pomóc: c2 = a2 + b2
 */

public class Task1Triangle {
    public boolean isRectangular (int a, int b, int c) {
        if (c * c == a * a + b * b) {
            return true;
        }
        return false;

    }
    public void print(int a) {
        if (a>3){
            System.out.println("> 3!");
        }
        System.out.println("< 3!");
    }

}
