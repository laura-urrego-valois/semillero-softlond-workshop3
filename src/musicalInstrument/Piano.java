package musicalInstrument;

public class Piano extends BasicInstrument {

    public Piano(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Playing piano ♫ ♫ ♫");
    }
}
