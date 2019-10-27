package udemy.java_programming_masterclass.section5.exercise26;

public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }

        for (int i = number; i >= 5; i--) {
            System.out.print("*");
            continue;
        }

    }

}
