package ClassRoom.model;

/**
 * Created by Евгений on 20.09.2016.
 */
public abstract class NamedEntity {
    private String name;

    public NamedEntity() {
    }


    public NamedEntity(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
