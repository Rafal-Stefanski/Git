package codewars.kata1;

import java.util.Arrays;

public class Kata {

    public static String createPhoneNumber(int[] numbers) {

//        First solution.

        String phoneNumberFromArray = "(";

        System.out.print("(");
        for (int i = 0; i < 3; i++) {
            phoneNumberFromArray += String.valueOf(numbers[i]);
        }
        phoneNumberFromArray += ") ";
        for (int j = 3; j < 6; j++) {
            phoneNumberFromArray += String.valueOf(numbers[j]);
        }
        phoneNumberFromArray += "-";
        for (int j = 6; j <= 9; j++) {
            phoneNumberFromArray += String.valueOf(numbers[j]);
        }
        return phoneNumberFromArray;

//        Second Solution.

//        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
    }
}