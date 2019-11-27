package udemy.java_programming_masterclass.section5;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        System.out.println(" === Welcome to minimum/maximum number printer === ");
        Scanner scanner = new Scanner(System.in);
        int minNumber = 0;
        int maxNumber = minNumber;

        while (true) {
            System.out.print("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                if (number > maxNumber) {
                    maxNumber = number;
                    continue;
                }
                if (number < minNumber || minNumber == 0) {
                    minNumber = number;
                }
            } else {
                System.out.println("Invalid number.");
                break;
            }
            scanner.nextLine(); // handle end of line (enter key)
        }

        System.out.println("Maximum number is: " + maxNumber + "\nMinimum number is: " + minNumber);
        scanner.close();
    }
}
