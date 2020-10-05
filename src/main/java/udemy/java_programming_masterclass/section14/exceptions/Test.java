package udemy.java_programming_masterclass.section14.exceptions;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        // Testing parse int, it does not work with string with mixed digits and letters :(

        Scanner s = new Scanner(System.in);
        System.out.print("Enter Integer -> ");
        System.out.println("Int value is: " + Integer.parseInt(s.next()));

    }
}
