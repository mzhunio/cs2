package com.zhunio.test1;

public class Pet extends Animal {

    private String name;

    private long ownerId;

    private long id;

    private static long globalId = 100;

    public Pet(String name) {
        this(name, 0);
    }

    public Pet(String name, long ownerId) {
        super(4, "mammal", false);
        this.name = name;
        this.ownerId = ownerId;
        this.id = globalId++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public String toString() {
        return "Legs: " + getNumOfLegs() + "\n" +
                "type: " + getType() + '\'' +
                "name: " + name + "\n" +
                "ownerID: " + ownerId;
    }

    public boolean equals(Pet other) {
        if (other == null) return false;
        if (this == other) return true;

        return this.ownerId == other.ownerId &&
                this.name.equals(other.name);
    }

}
