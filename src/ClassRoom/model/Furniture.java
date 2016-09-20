package ClassRoom.model;

/**
 * Created by Евгений on 20.09.2016.
 */
public abstract class Furniture extends NamedEntity {
    private String color;

    public Furniture() {
    }

    public Furniture(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
