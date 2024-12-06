package software.ulpgc;

import software.ulpgc.control.LoadRandomTriviaCommand;
import software.ulpgc.model.Trivia;

public class Main {
    public static void main(String[] args) {
        LoadRandomTriviaCommand command = new LoadRandomTriviaCommand(5);
        command.execute();
        for (Trivia trivia: command.getTrivias()){
            System.out.println(trivia.getQuestion());
        }
    }
}
