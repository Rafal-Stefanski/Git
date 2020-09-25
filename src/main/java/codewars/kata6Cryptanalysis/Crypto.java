package codewars.kata6Cryptanalysis;


//import java.util.ArrayList;
//import java.util.List;

public class Crypto {
    public static String wordPattern(final String word) {

//        solution from https://ao.gl/cryptanalysis-word-patterns-in-java/

        String newWord = word.toLowerCase();
        java.util.List<Character> characterList = new java.util.ArrayList<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < newWord.length(); i++) {
            if (!characterList.contains( newWord.charAt( i ) )) {
                characterList.add( newWord.charAt( i ) );
            }
            if (i != 0) {
                result.append(".");
            }
            result.append(characterList.indexOf(newWord.charAt(i)));
        }

        return result.toString();

//        char[] arrOfChar = new char[word.length()];
//
//        //loop to store each character in the array and then print the same
//        for (int i = 0; i < word.length(); i++) {
//            arrOfChar[i] = word.toUpperCase().charAt(i);
////            System.out.print(arrOfChar[i] + " ");
//        }
//
//        char[] countArray = new char[arrOfChar.length];
//        countArray[0] = 0;
//
//        for (int i = 1; i < arrOfChar.length; i++) {
//            if (arrOfChar[i] != arrOfChar[i - 1]) {
//                countArray[i] = (char) i;
//            }
//
//        }
//
//
//            return new String(countArray);
    }



    public static void main(String[] args) {

//        String test1 = "hello";
//        System.out.println(wordPattern(test1));

        int count;
        String s = "This is your string for example";
        String[] split = s.split(" ");
        for(String str: split)
        {
            char[] ch = str.toCharArray();   // convert string to char array
            count = 0;                       // reset count for every new word/string
            for(char c: ch)                  // iterate over all the characters
            {
                if(Character.isLetter(c))    // Returns true if the character is a Letter
                {
                    count++;                 // increase the count to represent no. of letters
                }
            }
            System.out.print(count + " ");       // print the no.of characters that are letters in a word/string.
        }

        /*
        System.out.println("\n===================== ======================");
        //Initialize the String which needs to be split
        String str = "Enlighten";

        //Use the Split method and store the array of Strings returned in a String array.
        String[] arr = str.split("");
        System.out.println();
        //Printing the characters using for-each loop
        for (int i = 0; i < arr.length; i++) {
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
        for (int i = 0; i < test.length(); i++) {
            arrOfChar[i] = test.charAt(i);
            System.out.print(arrOfChar[i] + " ");
        }
        System.out.println("\n\nFrom String: " + test);
        */

    }
}
