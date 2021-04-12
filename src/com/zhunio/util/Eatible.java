package com.zhunio.util;

interface Eatable {
    void eat();
}

class Person implements Eatable {

    @Override
    public void eat() {

    }
}

class Animal implements Eatable {

    @Override
    public void eat() {

    }
}



abstract class Bank {
    int amount;

    abstract void deposit(int amount);

    void widthdrawn(int amount) {

    }
}

class BankOfAmerica extends Bank {
    @Override
    void deposit(int amount) {

    }
}

class HudsonValley extends Bank {
    @Override
    void deposit(int amount) {

    }
}