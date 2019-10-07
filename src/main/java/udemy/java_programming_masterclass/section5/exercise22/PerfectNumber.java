package udemy.java_programming_masterclass.section5.exercise22;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i=1 ; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPerfectNumberen(int number) {
        if (number >= 1) {
            int sum = 0;
            int divider = 1;
            while (divider < number) {
                if (number % divider == 0) {
                    sum += divider;
                }
                divider++;
            }
            if (sum == number) {
                return true;
            }
        }  return false;
    }
}
