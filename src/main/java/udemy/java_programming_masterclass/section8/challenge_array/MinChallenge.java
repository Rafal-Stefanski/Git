package udemy.java_programming_masterclass.section8.challenge_array;

import java.util.Arrays;
import java.util.Scanner;

public class MinChallenge {

    public static void main(String[] args) {
        System.out.println("Min value of array challenge.");
        int[] arrayToCheck = readIntegers();
        System.out.println("min value = " + findMin(arrayToCheck));

    }

    public static int[] readIntegers() {
        System.out.print("Enter array length: ");
        Scanner scanner = new Scanner(System.in);
//        scanner.nextLine();
        int count = scanner.nextInt();

        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number " + i + " of array: ");
            array[i]=scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("int[] array = "+Arrays.toString(array));
        return array;
    }

    public static int findMin(int[] array) {
        int number = Integer.MAX_VALUE;
        for (int numToCheck : array) {
            if (numToCheck < number) {
                number = numToCheck;
            }
        }

        return number;
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