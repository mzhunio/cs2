package com.zhunio.stack;

import java.util.LinkedList;

public class Stack<T> implements StackInterface<T> {

    private LinkedList<T> list = new LinkedList<>();

    @Override
    public void push(T newEntry) {
        list.addFirst(newEntry);
    }

    @Override
    public T pop() throws Exception {
        if (isEmpty()) throw new Exception("Stack is empty");

        return list.remove();
    }

    @Override
    public T peek() throws Exception {
        if (isEmpty()) throw new Exception("Stack is empty");

        return list.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
