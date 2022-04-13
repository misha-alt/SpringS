package exersise;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class ClassListOfGanre  {


   public List MetOfList() {

        List<Object> list = new ArrayList<>();
        ClassicalMusic classicalMusic = new ClassicalMusic();
        RockMusic rockMusic = new RockMusic();
        JazzMusic jazzMusic = new JazzMusic();
        list.add(classicalMusic.songs2);
        list.add(rockMusic.songs);
        list.add(jazzMusic.songs3);

        return list;
    }

}
