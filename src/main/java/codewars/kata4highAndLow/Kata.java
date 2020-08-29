package codewars.kata4highAndLow;

public class Kata {
    public static String highAndLow(String numbers) {

        String[] integerStrings = numbers.split(" ");
        int[] integers = new int[integerStrings.length];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = Integer.parseInt(integerStrings[i]);
        }

        int maxValue = integers[0];
        for (int integer : integers) {
            if (integer > maxValue) {
                maxValue = integer;
            }
        }

        int minValue = integers[0];
        for (int integer : integers) {
            if (integer < minValue) {
                minValue = integer;
            }
        }

        return maxValue + " " + minValue;
    }
}
