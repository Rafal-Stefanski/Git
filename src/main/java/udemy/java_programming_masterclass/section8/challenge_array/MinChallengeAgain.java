package udemy.java_programming_masterclass.section8.challenge_array;

import java.util.Arrays;
import java.util.Scanner;

public class MinChallengeAgain {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arrayToCheck = readIntegers();
        System.out.println("Array to check: "+ Arrays.toString(arrayToCheck));
        System.out.println("Min value = " + findMin(arrayToCheck));
    }

    public static int[] readIntegers() {
        System.out.print("Enter count number: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] arrayInt = new int[count];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Enter number: ");
            arrayInt[i] = scanner.nextInt();
        }
        return arrayInt;
    }

    public static int findMin(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for (int number : array) {
            if (number < minValue) {
                minValue = number;
            }
        }
        return minValue;
    }
}


/*
-Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
-The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
-Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
-In the main() method read the count from the console and call the method readIntegers() with the count parameter.
-Then call the findMin() method passing the array returned from the call to the readIntegers() method.
-Finally, print the minimum element in the array.

Tips:
	-Assume that the user will only enter numbers, never letters
	-For simplicity, create a Scanner as a static field to help with data input
	-Create a new console project with the name "MinElementChallenge"
*/