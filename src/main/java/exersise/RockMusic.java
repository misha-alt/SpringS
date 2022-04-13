package exersise;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    List <String> songs = new ArrayList<>();
    {
        songs.add("First rock song" );
        songs.add("Second rock song");
        songs.add("Third rock song");
    }


    @Override
    public List<String> getSong() {
        return songs;
    }


}
