package software.ulpgc.model;

public class Trivia {
    public enum Difficulty{Easy, Medium, Hard};
    private final String question;
    private final String category;
    private final String type;
    private final Difficulty difficulty;

    public Trivia(String question, String category, String type, Difficulty difficulty) {
        this.question = question;
        this.category = category;
        this.type = type;
        this.difficulty = difficulty;
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
}
