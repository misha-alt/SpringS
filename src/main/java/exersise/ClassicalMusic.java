package exersise;

import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    List<String> songs2 = new ArrayList<>();

    {
        songs2.add("First classical music");
        songs2.add("Second classical music");
        songs2.add("Third classical music");

    }

    @Override
    public List<String> getSong() {
        return songs2;
    }
}