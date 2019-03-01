package Zadania_statements;

/**
 * 4. Napisz program, który wypisze na ekran konsoli
 * czy podany kod Unicode jest liczbą (0-9), małą literą (a-z) czy też dużą literą (A-Z).
 * Kody każdej z grup znaków następują po sobie więc wystarczy znaleźć kod np. dla litery 'a' i 'z' i sprawdzić
 * czy podany kod zawiera się w tym przedziale.
 */

public class Task4 {
    public static void main(String[] args) {

        int c = 74;

        if (c>=30 && c<=39) System.out.println("Unicode number range: 0-9");
        if (c>=41 && c<=50) System.out.println("Unicode capital letter range: A-Z");
        if (c>=61 && c<=80) System.out.println("Unicode lowercase letter range: A-Z");
        if(c<30 || c>80) System.out.println("Out of Unicode number and letter range.");
        if(c>50 && c<60) System.out.println("Out of Unicode number and letter range.");

    }

}
