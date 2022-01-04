package FuckingSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );


//       Music music= context.getBean("musicBean",Music.class);
//       MusicPlayer musicPlayer = new MusicPlayer(music);
//
//       Music music2 = context.getBean("musicBean2", Music.class);
//
//       MusicPlayer musicPlayer2 = new MusicPlayer(music2);
//
//
//       musicPlayer.playMusic();
//       musicPlayer2.playMusic();

//


        Computer computer = context.getBean("computer",Computer.class);



                System.out.println(computer);


        context.close();
    }
}

