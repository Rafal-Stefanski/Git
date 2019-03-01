package Zadania_statements;

/**
 * 2. Napisz program, który wypisze na ekran konsoli, słowo oznaczające ocenę dla podanej cyfry.
 * Np. dla 1 - "niedostateczny", 2 - "mierny" itp. Obsłuż przypadek gdy cyfra jest poza skalą ocen.
 */

public class Task2 {
    public static void main(String[] args) {

        int a = 4;

        if (a == 1) System.out.println("niedostateczny");
        if (a == 2) System.out.println("mierny");
        if (a == 3) System.out.println("dostateczny");
        if (a == 4) System.out.println("dobry");
        if (a == 5) System.out.println("bardzo dobry");
        if (a == 6) System.out.println("celujący");
        if (a < 1 || a > 6) System.out.println("ocena poza skalą");

    }
}
