package FuckingSpring;

import org.springframework.stereotype.Component;

@Component
public class Meta {

    public static void  massiv () {
        String[] mass = {"Hungarrian Rapsody", "Times of year", "таката и фуга ре минор"};

        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);

        }

    }


}

