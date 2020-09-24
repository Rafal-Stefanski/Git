package codewars.kata6Cryptanalysis;

import java.lang.reflect.Array;

public class Crypto {
    public static String wordPattern(String word) {
        // Your code here!
//        word="ala";
        char[] forCountingArray = word.toCharArray();

        String[] letters = word.split("");
        int letterNumber = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); i++) {
//                letters[i] = letterNumber;
            }
        }

        String finalString = forCountingArray.toString();
        return null;
    }

    public static void main(String[] args) {

        //Initialize the String which needs to be split
        String str = "Enlighter";

        //Use the Split method and store the array of Strings returned in a String array.
        String[] arr = str.split("");
        System.out.println();
        //Printing the characters using for-each loop
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nFrom String: " + str + "\n");


        //Initialize a test String
        String test = "Hello World, CodeSpeedy here";
        //Store the length in a integer variable
        int length = test.length();

        //Character array to store the characters
        //of length same as the string = 'length'
        char[] arrOfChar = new char[test.length()];

        //loop to store each character in the array and then print the same
        for (int i=0; i<test.length(); i++)
        {
            arrOfChar[i] = test.charAt(i);
            System.out.print(arrOfChar[i] + " ");
        }
        System.out.println("\n\nFrom String: " + test);

    }
}
