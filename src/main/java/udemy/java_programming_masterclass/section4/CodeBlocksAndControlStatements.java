package udemy.java_programming_masterclass.section4;

public class CodeBlocksAndControlStatements {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but more than 1000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        int hightScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + hightScore);

        // Challenge
        System.out.println("\n=== Challenge ===");

        calculateScore(true,10000,8,200);

        score=10_000;
        levelCompleted=8;
        bonus=200;

        hightScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + hightScore);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }
}
