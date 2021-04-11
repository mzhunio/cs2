package com.zhunio.util;

public class Node<E> {
    E data;
    Node<E> next;

    public Node(E data) {
        this.data = data;
    }

    public boolean hasNext() {
        return next != null;
    }
}
