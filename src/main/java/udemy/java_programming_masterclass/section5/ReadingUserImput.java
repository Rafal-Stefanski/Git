package udemy.java_programming_masterclass.section5;

import java.util.Scanner;

public class ReadingUserImput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Your name is " + name);

        scanner.close();

    }
}
