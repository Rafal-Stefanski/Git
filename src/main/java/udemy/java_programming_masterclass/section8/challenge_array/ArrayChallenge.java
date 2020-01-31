package udemy.java_programming_masterclass.section8.challenge_array;

import java.util.Scanner;

public class ArrayChallenge {
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(3);
        printArray(myIntegers);
        sortIntegers(myIntegers);
        printArray(myIntegers);
    }

    public static Scanner scanner = new Scanner(System.in);

    // getIntegers
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer value: \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    // printArray
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + i + "] " + array[i] + ", ");
        }
    }

    // sortIntegers
    public static int[] sortIntegers(int[] array) {
        int[] sortArray = array;
        int num1;
        int num2;
        for (int i = 0; i < sortArray.length; i++) {
            for (int j = 0; j < sortArray.length; j++) {
                if (sortArray[i] > sortArray[j]) {
                    num1 = sortArray[i];
                    num2 = sortArray[j];
                    sortArray[i] = num2;
                    sortArray[j] = num1;
                }
            }
        }
        return sortArray;
    }
}

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.
