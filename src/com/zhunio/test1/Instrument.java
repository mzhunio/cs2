package com.zhunio.test1;

class Instrument {

    private int difficulty;

    public Instrument(int n) {
        setDifficulty(n);
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        var isPositive = difficulty > 0;
        var isEven = difficulty % 2 == 0;

        if (isPositive && isEven) {
            this.difficulty = difficulty;
        }
    }

    public static void main(String[] args) {
        var i = new Instrument(-4);

        i.setDifficulty(-100);

        System.out.println(i.getDifficulty());
    }
}
