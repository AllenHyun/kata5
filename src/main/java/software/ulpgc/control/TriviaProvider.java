package software.ulpgc.control;

import software.ulpgc.model.Trivia;

import java.io.IOException;

public interface TriviaProvider {
    Trivia provideNew() throws IOException;
}
