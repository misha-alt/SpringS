package FuckingSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("classicalMusic")
   private Music music;
    private Meta meta;

 /*   private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }*/







//    public void setMusic(Music music) {
//        this.music = music;
//    }

    public String playMusic (){
      return  "Chose song playing"+ music.getSong();
    }

}
