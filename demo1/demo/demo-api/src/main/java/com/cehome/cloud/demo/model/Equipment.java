package com.cehome.cloud.demo.model;

public class Equipment implements java.io.Serializable {
    private long id;
    //private String name;
    private String owner;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    */

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
