package animalsAndSounds;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Bird());

        System.out.println("Animals sounds");
        System.out.println();
        for (Animal animal : animals) {
            animal.makeSound();
        }

    }
}
