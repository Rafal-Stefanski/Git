package udemy_programming_masterclass;

public class IntMaxMin {
    public static void main(String[] args) {
        // Wyswietlnie maxymalnej wartosci int'a
        int myIntMaxValue = Integer.MAX_VALUE;
        int myIntMinValue = Integer.MIN_VALUE;
        System.out.println("int max value: " + myIntMaxValue);
        System.out.println("int min value: " + myIntMinValue);
        System.out.println("Busted max value: " + (myIntMaxValue + 1));

        // Int rozne sposoby zapisu.
        int myTestInt = 2147483647;
        System.out.println(myTestInt);
        int my_Test_Int = 2_147_483_647;
        System.out.println(my_Test_Int);

        // Byte
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value: " + myMinByteValue);
        System.out.println("Byte maximum value: " + myMaxByteValue);

        // Short
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value: " + myMinShortValue);
        System.out.println("Short maximum value: " + myMaxShortValue);

        // Long
        long myWrongLongValue = 100; // - zły zapis
        long myLongValue = 100L; // - dobry zapis, long ma dużą literę L na końcu
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value: " + myMinLongValue);
        System.out.println("Long maximum value: " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println("bigLongLiteralValue = " + bigLongLiteralValue);

        short bigShortLiteralValue = 32767;


    }
}
