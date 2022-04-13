package exersise;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JazzMusic implements Music {

    List<String> songs3 = new ArrayList<>();
    {
        songs3.add("First jazz song");
        songs3.add("Second jazz song");
        songs3.add("Third jazz song");

    }



    @Override
    public List<String> getSong() {
        return songs3;
    }
}
