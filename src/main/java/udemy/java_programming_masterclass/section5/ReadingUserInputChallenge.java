package udemy.java_programming_masterclass.section5;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;
        while (count <= 10) {
            System.out.println("Enter number #" + count + ": ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;

            } else {
                System.out.println("Invalid number.");
                break;
            }
        }
        System.out.println("Sum equals " + sum + ".");
        scanner.close();
    }

//    public static void SolutionToReadingInputChallenge(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int counter = 0;
//        int sum = 0;
//
//        while (true) {
//            int order = counter + 1;
//            System.out.println("Enter number #" + order + ": ");
//
//            boolean isAnInt = scanner.hasNextInt();
//
//            if (isAnInt) {
//                int number = scanner.nextInt();
//                counter++;
//                sum += number;
//                if (counter == 10) {
//                    break;
//                }
//            } else {
//                System.out.println("Invalid number.");
//            }
//
//            scanner.nextLine(); // handle end of line (enter key)
//        }
//
//        System.out.println("Sum = " + sum);
//        scanner.close();
//    }
}