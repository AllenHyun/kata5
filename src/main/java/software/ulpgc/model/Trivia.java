package software.ulpgc.model;

import java.util.List;

public class Trivia {
    public enum Difficulty{Easy, Medium, Hard};
    private final String question;
    private final String category;
    private final String type;
    private final Difficulty difficulty;
    private final String correctAnswers;
    private final List<String> incorrectAnswers;

    public Trivia(String question, String category, String type, Difficulty difficulty, String correctAnswers, List<String> incorrectAnswers) {
        this.question = question;
        this.category = category;
        this.type = type;
        this.difficulty = difficulty;
        this.correctAnswers = correctAnswers;
        this.incorrectAnswers = incorrectAnswers;
    }

    public String getQuestion() {
        return question;
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public String getCorrectAnswers() {
        return correctAnswers;
    }

    public List<String> getIncorrectAnswers() {
        return incorrectAnswers;
    }
}
