package udemy.java_programming_masterclass.section4;

public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " score " + score + " points");
        return score*1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed player score " + score + " points");
        return score*1000;
    }
    public static int calculateScore() {
        System.out.println("Np player name no player score ");
        return 0;
    }

    // Challenge
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double centemeters = feet/30.48 + inches/2.54;
            return centemeters;
        } else {
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double centemeters = inches*2.54;
            return centemeters;
        } else {
            return -1;
        }
    }

}
