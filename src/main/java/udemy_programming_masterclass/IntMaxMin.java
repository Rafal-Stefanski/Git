package udemy_programming_masterclass;

public class IntMaxMin {
    public static void main(String[] args) {
        // Wyswietlnie maxymalnej wartosci int'a
        int myIntMaxValue = Integer.MAX_VALUE;
        int myIntMinValue = Integer.MIN_VALUE;
        System.out.println("int max value: " + myIntMaxValue);
        System.out.println("int min value: " + myIntMinValue);
        System.out.println("Busted int max value: " + (myIntMaxValue + 1));
        System.out.println("Busted int min value: " + (myIntMinValue - 1));

        // rozne sposoby zapisu inta.
        int myTestInt = 2147483647;
        System.out.println(myTestInt);
        int my_Test_Int = 2_147_483_647;
        System.out.println(my_Test_Int);

        // byte
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value: " + myMinByteValue);
        System.out.println("Byte maximum value: " + myMaxByteValue);

        // short
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value: " + myMinShortValue);
        System.out.println("Short maximum value: " + myMaxShortValue);

        // long
        long myLongValue = 100;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value: " + myMinLongValue);
        System.out.println("Long maximum value: " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println("big long literal value: " + bigLongLiteralValue);
        short bigShortLiteralValue = 32_767;
        System.out.println("big short literal value: " + bigShortLiteralValue);

        // Arthmetic
        int myTotal = (myIntMaxValue / 2);
        byte myNewByteValue = (byte) (myMaxByteValue / 2);
        short myNewShortValue = (byte) (myMaxShortValue / 2);

        // Challenge
        byte validByteNumber = 112;
        short validShortNumber = 32_000;
        int validIntNumber = 2_111_222_333;

        long validLongNumber = 50_000L + 10L * (validByteNumber + validShortNumber + validIntNumber);
        System.out.println("Challege number is: " + validLongNumber);

        short validTotalShort = (short) (10 + 10 * (validByteNumber + validShortNumber + validIntNumber));
        System.out.println("Challenge short number is: " + validTotalShort);
    }
}
