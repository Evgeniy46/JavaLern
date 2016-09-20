package ClassRoom.model;

/**
 * Created by Евгений on 20.09.2016.
 */
public abstract class Person extends NamedEntity{
    private String gender;
    private int age;

    public Person() {
    }

    public Person(String name, String gender, int age) {
        super(name);
        this.gender = gender;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
