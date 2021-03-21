package com.zhunio.test1;

public class Y extends X {

    double y;

    @Override
    public void increase() {
        y += 3.2;
    }

    public double multiply(double p) {
        return y * 2;
    }

}
