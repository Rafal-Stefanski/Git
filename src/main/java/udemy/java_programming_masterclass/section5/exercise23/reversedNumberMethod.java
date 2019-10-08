package udemy.java_programming_masterclass.section5.exercise23;

public class reversedNumberMethod {
    public static void main(String[] args) {
        System.out.println(reversedNumber(123456));
    }

    public static int reversedNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + (number % 10);
            number /= 10;
        }
        return reversedNumber;
    }
}
