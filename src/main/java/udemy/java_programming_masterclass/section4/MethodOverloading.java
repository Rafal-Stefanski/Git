package udemy.java_programming_masterclass.section4;

public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        // Chalenge
        System.out.println("\n=== Chalenge ===");
        System.out.println("\nregular method:");
        calcFeetAndInchesToCentimeters(6, 2);
        calcFeetAndInchesToCentimeters(6, 5);
        System.out.println("\noverload method:");
        calcFeetAndInchesToCentimeters(23);
        calcFeetAndInchesToCentimeters(157);
//        System.out.println("feet and inches in cm: " + calcFeetAndInchesToCentimeters(6, 1.6));
//        System.out.println("inches in cm: " + calcFeetAndInchesToCentimeters(73.6));

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " score " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player score " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("Np player name no player score ");
        return 0;
    }

    // Challenge
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double cm = (feet * 12 + inches) * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + cm + " cm");
            return cm;
        } else {
            System.out.println("Invalid feet or inches parameters.");
            return -1;
        }
    }

    // blad - brakuje 1 cala?! już nie :) wystarczyło zaokrąglić wynik dzielenia stopy na cale,
    // do liczby całkiwtej czy cast int.
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = (int) (inches / 12);
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " +  feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);

        } else {
            System.out.println("Invalid feet or inches parameters.");
            return -1;
        }
    }

}
