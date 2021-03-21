package com.zhunio.test1;

public class Main {

    public static void main(String[] args) {
        X x1 = new X();
//        X x2 = new X(5);
        X x3 = new Z();
        X x4 = new Y();
        Y y1 = new Z();
//        Y y2 = new X();
//        Y y3 = (Y) x1;
        Y y4 = (Y) x3;
        Y y5 = (Y) x4;
//        Z z1 = new X();
//        Z z2 = (Z) new Y();
        Z z3 = (Z) x3;
    }
}