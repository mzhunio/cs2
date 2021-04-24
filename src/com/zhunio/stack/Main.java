package com.zhunio.stack;

public class Main {

    public static void main(String[] args) throws Exception {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.clear();

        System.out.println(stack);
    }

}
