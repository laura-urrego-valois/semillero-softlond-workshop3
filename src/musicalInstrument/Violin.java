package musicalInstrument;

public class Violin extends BasicInstrument {

    public Violin(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Playing violin ♪ ♪ ♪");
    }
}
