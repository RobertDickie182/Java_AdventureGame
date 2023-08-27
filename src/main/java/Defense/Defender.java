package Defense;

public abstract class Defender implements IDefend {

    public String name;

    public Defender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
