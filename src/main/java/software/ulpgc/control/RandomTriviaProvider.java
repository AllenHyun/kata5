package software.ulpgc.control;

import com.google.gson.Gson;
import org.jsoup.Jsoup;
import software.ulpgc.control.pojo.RandomTriviaMe;
import software.ulpgc.control.pojo.RandomTriviaMeResponse;
import software.ulpgc.model.Trivia;

import java.io.IOException;

public class RandomTriviaProvider implements TriviaProvider{
    private static final String RANDOM_TRIVIA_URL = "https://the-trivia-api.com/api/questions?limit=1";

    @Override
    public Trivia provideNew() throws IOException {
        String text = Jsoup.connect(RANDOM_TRIVIA_URL).ignoreContentType(true).get().text();
        RandomTriviaMeResponse response = new Gson().fromJson(text, RandomTriviaMeResponse.class);
        return new RandomTriviaMeAdapter().adapt(response);
    }
}
