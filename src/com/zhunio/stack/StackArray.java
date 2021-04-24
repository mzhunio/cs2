package com.zhunio.stack;

import java.util.Arrays;

public class StackArray<T> implements StackInterface<T> {

    private T[] stack;
    private int topIndex = -1;
    private static final int INITIAL_CAPACITY = 5;

    public StackArray() {
        this(INITIAL_CAPACITY);
    }

    public StackArray(int capacity) {
        @SuppressWarnings("unchecked")
        T[] tempStack = (T[]) new Object[capacity];
        stack = tempStack;
    }

    @Override
    public void push(T newEntry) {
        ensureCapacity();
        stack[topIndex + 1] = newEntry;
        topIndex++;
    }

    private void ensureCapacity() {
        if (isArrayFull()) {
            stack = Arrays.copyOf(stack, stack.length * 2);
        }
    }

    @Override
    public T pop() throws Exception {
        if (isEmpty()) throw new Exception("Stack is empty");

        T removed = stack[topIndex];
        stack[topIndex] = null;
        topIndex--;

        return removed;
    }

    @Override
    public T peek() throws Exception {
        if (isEmpty()) throw new Exception("Stack is empty");

        return stack[topIndex];
    }

    @Override
    public boolean isEmpty() {
        return topIndex == -1;
    }

    @Override
    public void clear() {
        for (int i = 0; i <= topIndex; i++) {
            stack[i] = null;
        }
        topIndex = -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(stack);
    }

    private boolean isArrayFull() {
        return topIndex == stack.length - 1;
    }
}
