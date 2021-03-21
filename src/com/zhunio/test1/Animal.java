package com.zhunio.test1;

public class Animal {
    private int numOfLegs;
    private String type;
    private boolean wild;

    public Animal() {
        this(4, "mammal", false);
    }

    public Animal(int numOfLegs, String type, boolean wild) {
        this.numOfLegs = numOfLegs;
        this.type = type;
        this.wild = wild;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public String getType() {
        return type;
    }

    public boolean isWild() {
        if (isWild())
            return true;
        return false;
    }
}

