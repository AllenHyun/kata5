package software.ulpgc.control;

import software.ulpgc.model.Trivia;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class LoadRandomTriviaCommand implements Command{
    private final int count;
    private final List<Trivia> trivias = new ArrayList<>();

    public LoadRandomTriviaCommand(int count) {
        this.count = count;
    }

    @Override
    public void execute() {
        trivias.clear();
        RandomTriviaProvider provider = new RandomTriviaProvider();
        for(int i = 0; i < count; i++){
            try{
                trivias.add(provider.provideNew());
            } catch (IOException e){
                Logger.getAnonymousLogger().severe(e.getMessage());
            }
        }
    }

    public List<Trivia> getTrivias(){
        return trivias;
    }
}
