package exersise;

import FuckingSpring.Meta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

   private Music music1;
    private Music music2;
    private ClassListOfGanre classListOfGanre;


    @Autowired
    public MusicPlayer(@Qualifier ("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }



    public void playMusic (Ganre ganre){

        Random random= new Random();
        int r = random.nextInt(3);

        if (ganre == Ganre.CLASSICALMUSIC){
           ClassicalMusic classicalMusic = new ClassicalMusic();
            System.out.println(classicalMusic.getSong().get(r));
        }else {
            RockMusic rockMusic = new RockMusic();
            System.out.println(rockMusic.getSong().get(r));
        }
    }

}
