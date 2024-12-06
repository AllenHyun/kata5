package software.ulpgc.control;

import software.ulpgc.control.pojo.RandomTriviaMe;
import software.ulpgc.control.pojo.RandomTriviaMeResponse;
import software.ulpgc.model.Trivia;

public class RandomTriviaMeAdapter implements TriviaAdapter<RandomTriviaMeResponse>{
    @Override
    public Trivia adapt(RandomTriviaMeResponse response) {
        RandomTriviaMe triviaMe = response.get(0);
        return adapt(triviaMe);
    }

    private static Trivia adapt(RandomTriviaMe triviaMe){
        Trivia trivia = new Trivia(triviaMe.getQuestion(),
                triviaMe.getCategory(),
                triviaMe.getType(),
                Trivia.Difficulty.valueOf(firstUpperCase(triviaMe.getDifficulty())),
                triviaMe.getCorrectAnswer(),
                triviaMe.getIncorrectAnswers());
        return trivia;
    }

    private static String firstUpperCase(String value){
        return value.substring(0, 1).toUpperCase() + value.substring(1).toLowerCase();
    }
}
