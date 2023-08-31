package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    private  int id;
    private static int nextId = 1;
    private String value;
// id is unique amongst all JobField types
    public JobField() {
        this.id = nextId;
        nextId++;
        this.value = "Data not available";
    }
    public JobField(String value) {
        this();
        this.value = value;
    }
    @Override
    public String toString() {
        if(getValue().isBlank()) {
            return "Data not available";
        } else {
            return value;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}
