package udemy.java_programming_masterclass.section5.exercise26;

public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number >= 5) {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    if (i == 1 || i == number || j == 1 || j == number || i == j || j == number - i + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}
