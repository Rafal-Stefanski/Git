package udemy.java_programming_masterclass.section4;

import udemy.udemy_java_courses.game.Player;

public class CodeBlocksAndControlStatements {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int hightScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + hightScore);

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        hightScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + hightScore);

        // Challenge
        System.out.println("\n=== Challenge ===");
        //Players
        int positionInTable = calcutaleHighScorePosition(1500);
        displayHighScorePosition("Player 1 Tim", positionInTable);

        positionInTable = calcutaleHighScorePosition(900);
        displayHighScorePosition("Player 2 Bob", positionInTable);

        positionInTable = calcutaleHighScorePosition(400);
        displayHighScorePosition("Player 3 Percy", positionInTable);

        positionInTable = calcutaleHighScorePosition(50);
        displayHighScorePosition("Player 4 Gilbert", positionInTable);

        positionInTable = calcutaleHighScorePosition(1000);
        displayHighScorePosition("Player 5 Louise", positionInTable);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playersName, int positionInTable) {
        calcutaleHighScorePosition(positionInTable);
        System.out.println(playersName + " managed to get into posision " + positionInTable + " on the high score table.");
    }

    private static int calcutaleHighScorePosition(int finalScore) {
//        if (finalScore >= 1000) {
//            return 1;
//        } else if (finalScore >= 500) {
//            return 2;
//        } else if (finalScore >= 100) {
//            return 3;
//        }
//            return 4;
        int position = 4; // assuming position 4 will be returned

        if (finalScore >= 1000) {
            position = 1;
        } else if (finalScore >= 500) {
            position = 2;
        } else if (finalScore >= 100) {
            position = 3;
        }
        return position;
    }

}
