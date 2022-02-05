package org.launchcode.techjobs.oo;

public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField(){
        id = nextId;
        nextId++;
    }
    public JobField(String value) {
        this();
        String DEFAULT_MESSAGE = "Data not available";
        this.value = value.equals( "" ) ? DEFAULT_MESSAGE : value;
    }
    @Override
    public String toString() {
        return value;
    }

    public JobField(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        JobField.nextId = nextId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}
