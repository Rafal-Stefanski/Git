package udemy.java_programming_masterclass.section8.challenge_array;

import java.util.Scanner;

public class MinElementChallengeBis {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int returnedMin = findMin(readIntegers());
        System.out.println("Min value = " + returnedMin);
    }

    public static int[] readIntegers() {
        System.out.print("Enter count number: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] arrayOfInt = new int[count];

        for (int i = 0; i < arrayOfInt.length; i++) {
            System.out.print("Enter Number: ");
            arrayOfInt[i] = scanner.nextInt();
        }
        return arrayOfInt;
    }

    public static int findMin(int[] arrayOfInts) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arrayOfInts.length; i++) {
            int value = arrayOfInts[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
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