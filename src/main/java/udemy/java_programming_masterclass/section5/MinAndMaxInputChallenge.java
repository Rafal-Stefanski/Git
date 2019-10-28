package udemy.java_programming_masterclass.section5;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        System.out.println(" === Welcome to minimum/maximum number printer === ");
        Scanner scanner = new Scanner(System.in);
        int minNumber = 0;
        int maxNumber = 0;

//        int number = scanner.nextInt();




        while (true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                scanner.nextLine();
                if (number > maxNumber) {
                    maxNumber = number;
                }
                if (number < minNumber) {
                    minNumber = number;
                }
            } else {
                System.out.println("Invalid number.");
            }
        }
//        System.out.println("Maximum number is: " + maxNumber + "\nMinimum number is: " + minNumber);

//        scanner.close();


    }
}
