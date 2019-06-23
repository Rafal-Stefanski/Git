package pro2.weekend2.sob.quiz;

import pro2.weekend2.sob.quiz.model.Question;
import pro2.weekend2.sob.quiz.service.FileQuestionLoader;
import pro2.weekend2.sob.quiz.service.QuestionLoader;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        QuestionLoader questionLoader = new FileQuestionLoader();
        Question[] questions = questionLoader.load();

        boolean continueGame;

        while (true) {
            Game game = new Game();
            game.start(questions);

            Scanner scanner = new Scanner(System.in);
            String decision = scanner.nextLine();

            System.out.println("czy chcesz kontynuować grę?" + "Wybiecz [y] by kontynuować");
            if (decision.toLowerCase().equals("y")) {
                break;
            }

        }

            }
}
