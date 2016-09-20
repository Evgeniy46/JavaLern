package ClassRoom.model;

/**
 * Created by Евгений on 20.09.2016.
 */
public class Device extends NamedEntity {

    private String model;

    public Device() {
    }

    public Device(String name, String madel) {
        super(name);
        this.model = madel;
    }

    public String getMadel() {
        return model;
    }

    public void setMadel(String madel) {
        this.model = madel;
    }

}
