package software.ulpgc.control;

import software.ulpgc.model.Trivia;

public interface TriviaAdapter <T> {
    Trivia adapt(T t);
}
