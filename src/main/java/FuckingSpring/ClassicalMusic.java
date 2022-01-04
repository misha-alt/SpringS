package FuckingSpring;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {









//    public void initethod(){
//        System.out.println("Init method");
//    }
//
//    public void destroydMethod(){
//        System.out.println("Destroy method");
//    }


    @Override
    public String getSong() {

      return" Hungarrian Rapsody";
    }
}