package software.ulpgc.control.pojo;

import java.util.List;

public class RandomTriviaMe {
    private String type;
    private String category;
    private String question;
    private String correctAnswer;
    private List<String> incorrectAnswers;
    private String difficulty;


    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }

    public String getQuestion() {
        return question;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public List<String> getIncorrectAnswers() {
        return incorrectAnswers;
    }
}
