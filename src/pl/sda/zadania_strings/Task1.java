package pl.sda.zadania_strings;

/**
 * 1. Napisz klasę, która wykorzysta większość z metod dostępnych w klasie String.
 */

public class Task1 {
    public static void main(String[] args) {
        String text = " This is an example sentence. ";
        System.out.println(text);
        System.out.println( );
        System.out.println(text.trim());
        System.out.println(text.length());
        System.out.println(text.charAt(3));
        System.out.println(text.indexOf("x"));
        System.out.println(text.substring(4));
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.concat(" And this is concat."));





    }
}
