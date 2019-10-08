package udemy.java_programming_masterclass.section5.exercise23;

public class Main {
    public static void main(String[] args) {


        System.out.println("\nReversed number test");
        System.out.println("is -> "+ reverse(1041));

    }
    public static int reverse(int number) {
        int reveresedNumber = 0;
        while (number != 0) {
            int LastDigit = number % 10;
            number /=10;
            reveresedNumber = reveresedNumber * 10 + LastDigit;
        }
        return reveresedNumber;
    }
}
