package com.cbsgenesis.classroom.model;

/**
 Bace Class whis property name

 Lukasik Evgen
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

