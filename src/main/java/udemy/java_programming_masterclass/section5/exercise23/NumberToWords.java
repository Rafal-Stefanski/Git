package udemy.java_programming_masterclass.section5.exercise23;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.print("Invalid Value");
        }

        int counter = getDigitCount(number);
        number = reverse(number);

        int digit = number % 10;
        while (counter >= 1 || number != 0) {
            switch (digit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
            number /= 10;
            digit = number % 10;
            counter--;
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + (number % 10);
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 1;
        while (number / 10 != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
