package udemy.java_programming_masterclass.section5;

public class WhileDoWhileStatements {
    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        while (true) {
            if (count == 5) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        for (int i = 6; i != 6; i++) {  // petla nie wykona sie przez ograniczenie i!=6
            System.out.println("Count value is " + count);
        }

        System.out.println("\n-- Do While Loop --");
        count = 6;
        do {
            System.out.println("Count value is " + count);
            count++;
            if (count > 10) {
                break;
            }
        } while (count != 6);

        System.out.println("\n-- is even number --");
        System.out.println("is even number: 5 - " + isEvenNumber(5));

        System.out.println("\n-- while loop --");
        int number = 4;
        int finishNumber = 20;
        int numberOfEvenNo = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("even number " + number);
            numberOfEvenNo++;
            if (numberOfEvenNo >= 5) {
                break;
            }

        }
        System.out.println("number of even numbers " + numberOfEvenNo);


    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
