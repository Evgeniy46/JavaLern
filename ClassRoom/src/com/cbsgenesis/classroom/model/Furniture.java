package com.cbsgenesis.classroom.model;

/**
 * Created by Java on 15.09.2016.
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
