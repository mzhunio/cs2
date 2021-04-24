package com.zhunio.stack;

public class Main {

    public static void main(String[] args) throws Exception {
        StackArray<Integer> stack = new StackArray<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.clear();

        System.out.println(stack);
    }

}
