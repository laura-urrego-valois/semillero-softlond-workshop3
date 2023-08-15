package musicalInstrument;

public class Guitar extends BasicInstrument {

    public Guitar(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Playing guitar ♪ ♪ ♪");
    }
}
