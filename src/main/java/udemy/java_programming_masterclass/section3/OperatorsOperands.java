package udemy.java_programming_masterclass.section3;

public class OperatorsOperands {
    public static void main(String[] args) {

        int result = 1 + 2; // 1+2=3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3-1=2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);
        result = result * 10;
        System.out.println("2 * 10 = " + result);
        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);
        // Modulo remainder
        result = result % 3;    // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++;
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3;
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result - 2 ;
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It's not an alien!");
            System.out.println("And I am scared of aliens!");
        }

        int topScore = 80;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }
        // AND '&&' operator
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score nad less than 100");
        }

        // OR '||' operator
        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both the conditions are true.");
        }

        // Assignment operator vs equlas to operators
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an '==' in if and it's true.");
        }

        // Boolean
        boolean isCar = false;
        if (isCar) { // '!' is A NOT operator so will work for '!isCar'
            System.out.println("This is not supposed to happen, " +
                    "because there should be '==' operator");
        }

        // Ternaty operator - operator trójskładnikowy
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // Challenge
        System.out.println("\n=== Challenge ===");
        double firstDoubleValue = 20.00d;
        double secondDoubleValue = 80.00d;
        double totalSumAndMultiplyValue = (firstDoubleValue + secondDoubleValue) * 100.00d;
        System.out.println("totalSumAndMultiplyValue is: " + totalSumAndMultiplyValue);
        double remainderValueDivider = 40.00d;
        System.out.println("remainderValueDivider is: " + remainderValueDivider);
        double remainderValue = totalSumAndMultiplyValue % remainderValueDivider;
        System.out.println("remainderValue from totalSumAndMultiplyValue and remainderValueDivider is: " + remainderValue);
        boolean remainderValueIsZero = false;
        if (remainderValue == 0) {
            remainderValueIsZero = true;
            System.out.println("remainderValue is 0 which is " + remainderValueIsZero);
        } else {
            remainderValueIsZero = false;
            System.out.println("\nGot some remainder.\nremainderValue is not 0 so remainderValueIsZero is " + remainderValueIsZero);
        }
        //other way
        boolean isNoRemainder = (remainderValue==0) ? true : false;
        System.out.println("\nAlternative solution for isNoRemainder: " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder.");
        }
    }

}
