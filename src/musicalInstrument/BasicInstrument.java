package musicalInstrument;

public abstract class BasicInstrument implements IMusicalInstrument {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BasicInstrument(String name) {
        this.name = name;
    }

    @Override
    public abstract void play();
}
