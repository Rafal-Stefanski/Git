package Zadania_statements;

/**
 * 3. Napisz program, który wypisze na ekran konsoli, cyfrę arabską dla podanej liczby rzymskiej (od 1 do 9).
 * Czyli np. dla 'I' wypisze 1, dla 'V' 5 itp. Obsłuż przypadek gdy podana liczba rzymska jest nieprawidłowa.
 */

public class Task3 {
    public static void main(String[] args) {
        int b=6;
        if (b==1) System.out.println("I");
        if (b==2) System.out.println("II");
        if (b==3) System.out.println("III");
        if (b==4) System.out.println("IV");
        if (b==5) System.out.println("V");
        if (b==6) System.out.println("VI");
        if (b==7) System.out.println("VII");
        if (b==8) System.out.println("VIII");
        if (b==9) System.out.println("IX");
        if (b==10) System.out.println("X");
        if (b<1||b>10) System.out.println("Out of scale, only 1-10 numbers");

    }
}
