package Testq;

import java.util.ArrayList;
import java.util.List;

public class Imp {
    public static void main(String[] args) {
        List<Animal> listOfanimal = new ArrayList<>();
        listOfanimal.add(new Animal(1));
        listOfanimal.add(new Animal(3));

        wer(listOfanimal);

    }
    public static void wer(List<?>list){
        for(Object animal:list){
            System.out.println(animal);
        }

    }
}
