package pro2.weekend2.sob.quiz.model;

public class Question {
    private final QuestionCategory category;
    private final String question;
    private final String[] answers;
    private final String correctAnswer;

    public Question(QuestionCategory category, String question, String[] answers, String correctAnswer) {
        this.category = category;
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public QuestionCategory getCategory() {
        return category;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
