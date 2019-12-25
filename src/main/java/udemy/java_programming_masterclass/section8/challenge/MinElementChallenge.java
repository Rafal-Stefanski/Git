package udemy.java_programming_masterclass.section8.challenge;

import java.util.Scanner;

public class MinElementChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = {1, 2, 3};
        findMin(myIntegers);
    }

    public static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " integer values: \r");
        int[] values = new int[count];
        for (int i = 1; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void findMin(int[] array) {
        int num1 = 0;
        int num2;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    num1 = array[i];
                    num2 = array[j];
                    array[i] = num2;
                    array[j] = num1;
                }
            }
        }
        System.out.println("minimum value is: " + num1);
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
	-Create a new console project with the name eMinElementChallengef

*/


