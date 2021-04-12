package com.zhunio.util;

public class Main {

    public static void main(String[] args) {
//        addFront();
        addLast();
    }

    public static void addFront() {
        LinkedList<Integer> family = new LinkedList<>();
        family.addFront(6);
        family.addFront(5);
        family.addFront(4);
        family.addFront(3);
        family.addFront(2);
        family.addFront(1);

        System.out.println(family);
    }

    private static void addLast() {
        LinkedList<Integer> family = new LinkedList<>();
        family.addLast(6);
        family.addLast(5);
        family.addLast(4);
        family.addLast(3);
        family.addLast(2);
        family.addLast(1);

        System.out.println(family);
    }


}
