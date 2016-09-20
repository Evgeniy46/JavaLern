package com.cbsgenesis.classroom.model;

/**
 * Created by Java on 15.09.2016.
 */
public abstract class Device extends NamedEntity {
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
