package musicalInstrument;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<BasicInstrument> instruments = new ArrayList<>();
        instruments.add(new Piano("Grand Piano"));
        instruments.add(new Violin("Testore Violin"));
        instruments.add(new Guitar("Acustic Guitar"));


        System.out.println("It's time to play some music!");
        System.out.println();
        for (BasicInstrument instrument : instruments) {
            System.out.print(instrument.getName() + ": ");
            instrument.play();
        }
    }
}
